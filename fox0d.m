% Fox et al. model in 0d

% parameter values
gna=12.8;
gk1=2.8;
gkr=0.0136;
gks=0.0245;
gkp=0.002216;
gto=0.23815;
gnab=0.0031;
gcab=0.0003842;
pca=0.0000226;
pcak=5.79e-7;
prel=6.0;
pleak=0.000001;
xinakbar=0.693;
xicahalfbar=-0.265;
xipcabar=0.05;
rr=8.314;
tt=310.0;
ff=96.5;
acap=1.534e-4;
csc=1.0;
eta=0.35;
xksat=0.2;
xknaca=1500.0;
xkmfca=0.18;
xkmk1=13.0;
xkmna=87.5;
xkmca=1380.0;
xkmnai=10.0;
xkmko=1.5;
xkmpca=0.05;
xkmup=0.32;
cmdntot=10.0;
csqntot=10000.0;
xkmcmdn=2.0;
xkmcsqn=600.0;
vup=0.1;
vmyo=25.84e-6;
vsr=2e-6;
cnai=10.0;
cki=149.4;
cnao=138.0;
cko=4.0;
ccao=2000.0;
stim=-40.8*1.5; %80
xstimdur=1.;

% useful quantities and constants
rtof=rr*tt/ff;
ena=rtof*log(cnao/cnai);
ek=rtof*log(cko/cki);
eks=rtof*log((cko+0.01833*cnao)/(cki+0.01833*cnai));
sigma=(exp(cnao/67.3)-1.)/7.;
taufca=30.;
caidtconst=acap*csc*0.5/(ff*vmyo);

% numerical parameters
%Nx=100;
Nx=1;
nx=Nx;
dt=.05; % time step, in ms
istimdur=round(xstimdur/dt);
endtime=2000;   %length of simulation in ms
nsteps=ceil(endtime/dt);

% stimulation period and strength
period=200.0;
icycle=ceil(period/dt);

% initial values 
v=-94.7*ones(Nx,1);
ccai=0.0472*ones(Nx,1);
ccasr=320.0*ones(Nx,1);
xf=1.0*ones(Nx,1);
xd=0.0*ones(Nx,1);
xm=0.0*ones(Nx,1);
xh=1.0*ones(Nx,1);
xj=1.0*ones(Nx,1);
xfca=1.0*ones(Nx,1);
xkr=0.0*ones(Nx,1);
xks=0.0*ones(Nx,1);
xto=0.0*ones(Nx,1);
yto=1.0*ones(Nx,1);
%vt=v;

% vectors for saving data to plot
vsave = zeros(nsteps+1,1);
vsave(1,1)=v(1,1);

t = 0:nsteps;
t=t*dt;     % change to physical time in ms

for ntime=1:nsteps

% sodium current
%             if(abs(vv+47.13).lt.1e-6) then
%            am=3.2
    am=0.32*(v+47.13)./(1.-exp(-0.1*(v+47.13)));
    bm=0.08*exp(-v/11.);
    ah=0.135*exp((v+80.)./-6.8);
    bh=7.5./(1.+exp(-0.1*(v+11.)));
    aj=0.175*exp((v+100.0)./-23.)./(1.+exp(0.15*(v+79.)));
    bj=0.3./(1.+exp(-0.1*(v+32.)));
    taum1=1./(am+bm);
    xminf1=taum1.*am;
    tauh1=1./(ah+bh);
    xhinf1=tauh1.*ah;
    tauj1=1./(aj+bj);
    xjinf1=tauj1.*aj;

    xm=xminf1+(xm-xminf1).*exp(-dt./taum1);
    % xm = xm + dt*(am*(1-xm)-bm*m);
    xh=xhinf1+(xh-xhinf1).*exp(-dt./tauh1);
    xj=xjinf1+(xj-xjinf1).*exp(-dt./tauj1);
    xina=gna*xm.*xm.*xm.*xh.*xj.*(v-ena);

% inward rectifier k+ current
    xik1=gk1*cko/(cko+xkmk1)*(v-ek)./(2.+exp(1.62/rtof*(v-ek)));

% rapid component of the delayed rectifier k+ current
    xrinf1=1./(1.+exp(-2.182-0.1819*v));
    taukr1=43.+1./(exp(-5.495+0.1691*v)+exp(-7.677-0.0128*v));
    xkr=xrinf1+(xkr-xrinf1).*exp(-dt./taukr1);
    xikrcoeff=gkr*sqrt(cko)*0.5*(v-ek)./(1.+2.5*exp(0.1*(v+28.0)));
    xikr=xkr.*xikrcoeff;

% slow component of the delayed rectifier k+ current
    xsinf1=1./(1.+exp((v-16.0)/-13.6));
%         if(abs(vv-10).lt.1e-6) then
%            tauks(i)=417.946
    tauks1=1./((0.0000719*(v-10.)./(1.-exp(-0.148*(v-10.))))+(0.000131*(v-10.)./(exp(0.0687*(v-10.))-1.)));
    xks=xsinf1+(xks-xsinf1).*exp(-dt./tauks1);
    xiks=gks*xks.*xks.*(v-eks);

% transient outward k+ current
    axto=0.04516*exp(0.03577*v);
    bxto=0.0989*exp(-0.06237*v);
    ayto=0.005415*exp((v+33.5)/-5.)./(1.+0.051335*exp((v+33.5)/-5.));
    byto=0.005415*exp((v+33.5)/5.)./(1.+0.051335*exp((v+33.5)/5.));
    tauxto1=1./(axto+bxto);
    xtoinf1=axto.*tauxto1;
    tauyto1=1./(ayto+byto);
    ytoinf1=ayto.*tauyto1;

    xto=xtoinf1+(xto-xtoinf1).*exp(-dt./tauxto1);
    yto=ytoinf1+(yto-ytoinf1).*exp(-dt./tauyto1);
    xito=gto*xto.*yto.*(v-ek);

% plateau k+ current
    xikp=gkp*(v-ek)./(1.+exp((7.488-v)/5.98));

% na+-k+ pump current
    xinak=xinakbar*(cko/(cko+xkmko))./(1.+(xkmnai/cnai)^1.5)./(1.+0.1245.*exp(-0.1*v/rtof)+0.0365.*sigma.*exp(-v/rtof));

% na+/ca2+ exchange current
    xinacat1=(xknaca/((xkmna^3)+(cnao^3)))./(xkmca+ccao)./(1.+xksat*exp(v*(eta-1.)/rtof)).*(exp(v*eta/rtof)*cnai^3*ccao);
    xinacat2=(xknaca/((xkmna^3)+(cnao^3)))./(xkmca+ccao)./(1.+xksat*exp(v*(eta-1.)/rtof)).*(exp(v*(eta-1.)/rtof)*cnao^3);
    xinaca=xinacat1-xinacat2.*ccai;

% sarcolemmal pump current
    xipca=xipcabar*ccai./(xkmpca+ccai);

% ca2+ background current
    ecat=0.5*rtof*log(ccao./ccai);
    xicab=gcab*(v-ecat);

% na+ background current
    xinab=gnab*(v-ena);

% L-type ca2+ channel current
    finf1=1./(1.+exp((v+12.5)/5.));
    tauf1=30.+200./(1.+exp((v+20.)/9.5));
    dinf1=1./(1.+exp((v+10.)/-6.24));
    taud1=1./((0.25*exp(-0.01*v)./(1.+exp(-0.07*v)))+(0.07*exp(-0.05*(v+40.)))./(1.+exp(0.05*(v+40.))));

%         if(abs(vv).lt.1e-6) then
%            xicabart1(i)=0.00434168*exp(2.*vv/rtof)
%            xicabart2(i)=0.00434168*0.341*ccao

    xicabart1=pca/csc*4.0*v*ff/rtof./(exp(2.*v/rtof)-1.).*exp(2.*v/rtof);
    xicabart2=pca/csc*4.0*v*ff/rtof./(exp(2.*v/rtof)-1.)*0.341*ccao;

    xicabar=xicabart1.*ccai-xicabart2;
    xf=finf1+(xf-finf1).*exp(-dt./tauf1);
    xd=dinf1+(xd-dinf1).*exp(-dt./taud1);
    fcainf1=1./(1.+(ccai/xkmfca).^3);
    xfca=fcainf1+(xfca-fcainf1).*exp(-dt./taufca);
    xica=xicabar.*xf.*xd.*xfca;

% k+ current through the L-type Ca2+ channel
%         if(abs(vv).lt.1e-6) then
%            xicakcoeff(i)=317.103
    xicakcoeff=pcak/csc*(1000.*v*ff/rtof).*(cki*exp(v/rtof)-cko)./(exp(v/rtof)-1.);
    xicak=xicakcoeff.*xf.*xd.*xfca./(1.+xicabar/xicahalfbar);

% calcium handling
    gamma=1./(1.+(2000.0./ccasr).^3);
    xjrelcoeff=prel./(1.+1.65*exp(v/20.));
    xjrel=xjrelcoeff.*xf.*xd.*xfca.*(gamma.*ccasr-ccai);
    xjleak=pleak*(ccasr-ccai);
    xjup=vup./(1.+(xkmup./ccai).^2);
    bit=1./(1.+(cmdntot*xkmcmdn./((xkmcmdn+ccai).^2)));
    dcaidt=bit.*(xjrel+xjleak-xjup-caidtconst.*(xica+xicab+xipca-2.0*xinaca));
    ccai=ccai+dt*dcaidt;

    bsr=1./(1.+csqntot*xkmcsqn./((xkmcsqn+ccasr).^2));
    dcasrdt=bsr.*(xjup-xjleak-xjrel)*vmyo/vsr;
    ccasr=ccasr+dt*dcasrdt;

% stimulus
    xstim=zeros(size(v));
    if(mod(ntime,icycle)<istimdur)
%    if(ntime<istimdur)
%        xstim(1:5)=stim;
        xstim=stim;
    end
    
    v=v-dt*(xina+xik1+xito+xikp+xinab+xiks+xica+xinaca+xipca+xicab+xicak+xinak+xikr+xstim);
     
    vsave(ntime+1,1) = v(1,1);

end

plot(t,vsave,'k','linewidth',2)
ylabel('V_m')
xlabel('Time')
ylim([-100 50])
