import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.EventObject;

public class foxtable10 extends Applet
    implements ActionListener, ItemListener
{

    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawRect(0, 35, 431, 256);
        g.setColor(Color.black);
        g.fillRect(1, 36, 430, 255);
        g.setColor(Color.white);
        g.drawLine(30, 45, 30, 255);
        g.drawLine(30, 255, 420, 255);
        g.drawString("Time (ms)", 185, 285);
        g.drawString("V", 13, 155);
        g.drawString("(mV)", 4, 165);
        if(!firsttime)
        {
            g.setColor(Color.white);
            xpos = 80;
            if(senv == 10D)
            {
                g.setColor(Color.red);
                g.drawString("V", xpos, 55);
                xpos = xpos + 20;
            }
            if(senxm == 10D)
            {
                g.setColor(new Color(12, 100, 12));
                g.drawString("m,", xpos, 55);
                xpos = xpos + 20;
            }
            if(senxh == 10D)
            {
                g.setColor(Color.blue);
                g.drawString("h,", xpos, 55);
                xpos = xpos + 20;
            }
            if(senxj == 10D)
            {
                g.setColor(Color.gray);
                g.drawString("j,", xpos, 55);
                xpos = xpos + 20;
            }
            if(senxd == 10D)
            {
                g.setColor(new Color(234, 161, 0));
                g.drawString("d,", xpos, 55);
                xpos = xpos + 20;
            }
            if(senxfca == 10D)
            {
                g.setColor(Color.magenta);
                g.drawString("fca,", xpos, 55);
                xpos = xpos + 20;
            }
            if(senccasr == 10D)
            {
                g.setColor(new Color(128, 128, 0));
                g.drawString("[Ca]sr", xpos, 55);
                xpos = xpos + 20;
            }
            if(senccai == 10D)
            {
                g.setColor(Color.cyan);
                g.drawString("[Ca]i", xpos, 55);
                xpos = xpos + 20;
            }
            if(senvarxf == 10D)
            {
                g.setColor(new Color(83, 192, 186));
                g.drawString("xf,", xpos, 55);
                xpos = xpos + 25;
            }
            if(senxkr == 10D)
            {
                g.setColor(new Color(118, 0, 254));
                g.drawString("kr,", xpos, 55);
                xpos = xpos + 25;
            }
            if(senxks == 10D)
            {
                g.setColor(new Color(44, 154, 0));
                g.drawString("ks,", xpos, 55);
                xpos = xpos + 25;
            }
            if(senxto == 10D)
            {
                g.setColor(new Color(0, 254, 0));
                g.drawString("xto,", xpos, 55);
                xpos = xpos + 20;
            }
            if(senyto == 10D)
            {
                g.setColor(new Color(204, 100, 0));
                g.drawString("yto,", xpos, 55);
                xpos = xpos + 20;
            }
            g.setColor(Color.red);
            double d = 0.0D;
            double d1 = 12.800000000000001D;
            double d2 = 0.024500000000000001D;
            double d3 = 0.23815D;
            double d4 = 0.0030999999999999999D;
            double d5 = 0.00038420000000000001D;
            double d6 = 9.9999999999999995E-07D;
            double d7 = -0.26500000000000001D;
            double d8 = 8.3140000000000001D;
            double d9 = 310D;
            double d10 = 96.5D;
            double d11 = 0.00015339999999999999D;
            double d12 = 1.0D;
            double d13 = 10000D;
            double d14 = 600D;
            double d15 = 2.584E-05D;
            double d16 = 1.9999999999999999E-06D;
            double d17 = 10D;
            double d18 = 149.40000000000001D;
            double d19 = 138D;
            double d20 = 4D;
            double d25 = (d8 * d9) / d10;
            double d26 = d25 * Math.log(d19 / d17);
            double d27 = d25 * Math.log(d20 / d18);
            double d28 = d25 * Math.log((d20 + 0.018329999999999999D * d19) / (d18 + 0.18329999999999999D * d17));
            double d29 = (Math.exp(d19 / 67.299999999999997D) - 1.0D) / 7D;
            double d30 = 30D;
            double d31 = (d11 * d12 * 0.5D) / (d10 * d15);
            v = -94.700000000000003D;
            ccai = 0.047199999999999999D;
            ccasr = 320D;
            varxf = 0.98299999999999998D;
            xd = 0.0001D;
            xm = 0.00024676D;
            xh = 0.99868999999999997D;
            xj = 0.99887000000000004D;
            xfca = 0.94199999999999995D;
            xkr = 0.22900000000000001D;
            xks = 0.0001D;
            xto = 3.7419999999999997E-05D;
            yto = 1.0D;
            int i = 185;
            int j = (int)(130D - v * 1.3D);
            int k = 185;
            int l = 85;
            int i1 = 85;
            int j1 = 85;
            int k1 = 85;
            int l1 = 235;
            int i2 = 85;
            int j2 = 85;
            int k2 = 85;
            int l2 = 85;
            int i3 = 85;
            int j3 = 34;
            is2 = (int)s2;
            is1 = (int)s1;
            ntime = (int)time;
            iendtime = 300;
            ixs11 = 31;
            ixs21 = (int)((xnstims2 * 395D) / endtime) + 32;
            g.setColor(Color.white);
            g.drawString("S1", ixs11 - 3, 270);
            g.drawString("S2", ixs21 - 3, 270);
            g.drawString("|", ixs11, 260);
            g.drawString("|", ixs21, 260);
            String s = nf.format(endtime / 1000D);
            g.drawString("Total Time=" + String.valueOf(s) + " sec.", iendtime - 15, 285);
            ttime = 0.0D;
            nswitch = 0;
            ncounts1 = 1;
            napdd = 0;
            nt_of_t = -1;
            int k4 = 0;
            nswitch = 0;
            ncounts1 = 1;
            sdur = stimdur;
            xnstims1 = stims1 + sdur;
            xnstims2 = stims1 * (double)(ns1s - 1) + stims2 + sdur;
            endtime = xnstims2 + 250D;
            nend = (int)(endtime / dt);
            DII = 0.0D;
            APDD = 0.0D;
            for(int l4 = 1; l4 < nend; l4++)
            {
                k4++;
                ttime = ttime + dt;
                Istim = 0.0D;
                if(ttime >= xnstims1 - sdur && ttime <= xnstims1)
                {
                    Istim = stimstrength;
                    nswitch = 1;
                    skip = 1;
                    ncount = 0;
                    if(ns1s < 13)
                    {
                        ixs11 = (int)((xnstims1 * 395D) / endtime) + 34;
                        g.setColor(Color.white);
                        g.drawString("S1", ixs11 - 5, 270);
                        g.drawString("|", ixs11, 260);
                    }
                }
                if(ttime >= xnstims1 && ncounts1 < ns1s - 1 && nswitch == 1)
                {
                    nswitch = 0;
                    ncounts1 = ncounts1 + 1;
                    xnstims1 = (double)ncounts1 * stims1 + sdur;
                    skip = 1;
                    ncount = 0;
                }
                if(ttime >= xnstims2 - sdur && ttime < xnstims2)
                {
                    Istim = stimstrength;
                    skip = 1;
                    ncount = 0;
                }
                if(ttime < sdur + 0.10000000000000001D)
                {
                    skip = 1;
                    ncount = 0;
                    if(l4 > 10)
                        Istim = stimstrength;
                }
                double d32 = (v - vlo) / dvt;
                int k3 = (int)d32;
                int l3 = k3 + 1;
                double d21 = d32 - (double)k3;
                double d22 = (double)l3 - d32;
                double d33 = (ccai - cailo) / dcait;
                int i4 = (int)d33;
                int j4 = i4 + 1;
                double d23 = d33 - (double)i4;
                double d24 = (double)j4 - d33;
                double d36 = d22 * taum[k3] + d21 * taum[l3];
                double d37 = d22 * tauh[k3] + d21 * tauh[l3];
                double d38 = d22 * tauj[k3] + d21 * tauj[l3];
                double d39 = d22 * xminf[k3] + d21 * xminf[l3];
                double d40 = d22 * xhinf[k3] + d21 * xhinf[l3];
                double d41 = d22 * xjinf[k3] + d21 * xjinf[l3];
                xm = d39 + (xm - d39) * Math.exp(-dt / d36);
                xh = d40 + (xh - d40) * Math.exp(-dt / d37);
                xj = d41 + (xj - d41) * Math.exp(-dt / d38);
                double d42 = d1 * xm * xm * xm * xh * xj * (v - d26);
                double d43 = d22 * xik1t[k3] + d21 * xik1t[l3];
                double d44 = d22 * xrinf[k3] + d21 * xrinf[l3];
                double d45 = d22 * taukr[k3] + d21 * taukr[l3];
                xkr = d44 + (xkr - d44) * Math.exp(-dt / d45);
                double d46 = xkr * (d22 * xikrcoeff[k3] + d21 * xikrcoeff[l3]) * gkrr;
                double d47 = d22 * xsinf[k3] + d21 * xsinf[l3];
                double d48 = d22 * tauks[k3] + d21 * tauks[l3];
                xks = d47 + (xks - d47) * Math.exp(-dt / d48);
                double d49 = d2 * xks * xks * (v - d28);
                double d50 = d22 * xtoinf[k3] + d21 * xtoinf[l3];
                double d51 = d22 * tauxto[k3] + d21 * tauxto[l3];
                double d52 = d22 * ytoinf[k3] + d21 * ytoinf[l3];
                double d53 = d22 * tauyto[k3] + d21 * tauyto[l3];
                xto = d50 + (xto - d50) * Math.exp(-dt / d51);
                yto = d52 + (yto - d52) * Math.exp(-dt / d53);
                double d54 = d3 * xto * yto * (v - d27);
                double d55 = d22 * xikpt[k3] + d21 * xikpt[l3];
                double d56 = d22 * xinakt[k3] + d21 * xinakt[l3];
                double d57 = (d22 * xinacat1[k3] + d21 * xinacat1[l3]) - (d22 * xinacat2[k3] + d21 * xinacat2[l3]) * ccai;
                double d58 = d24 * xipcat[i4] + d23 * xipcat[j4];
                double d59 = d5 * (v - (d24 * ecat[i4] + d23 * ecat[j4]));
                double d60 = d4 * (v - d26);
                double d61 = (d22 * xicabart1[k3] + d21 * xicabart1[l3]) * ccai - (d22 * xicabart2[k3] + d21 * xicabart2[l3]);
                double d62 = d22 * finf[k3] + d21 * finf[l3];
                double d63 = d22 * tauf[k3] + d21 * tauf[l3];
                double d64 = d22 * dinf[k3] + d21 * dinf[l3];
                double d65 = d22 * taud[k3] + d21 * taud[l3];
                varxf = d62 + (varxf - d62) * Math.exp(-dt / d63);
                xd = d64 + (xd - d64) * Math.exp(-dt / d65);
                double d66 = d24 * fcainf[i4] + d23 * fcainf[j4];
                xfca = d66 + (xfca - d66) * Math.exp(-dt / d30);
                double d67 = d61 * varxf * xd * xfca;
                double d68 = ((d22 * xicakcoeff[k3] + d21 * xicakcoeff[l3]) * varxf * xd * xfca) / (1.0D + d61 / d7);
                double d69 = 1.0D / (1.0D + Math.pow(2000D / ccasr, 3D));
                double d70 = (d22 * xjrelcoeff[k3] + d21 * xjrelcoeff[l3]) * varxf * xd * xfca * (d69 * ccasr - ccai);
                double d71 = d6 * (ccasr - ccai);
                double d72 = d24 * xjupt[i4] + d23 * xjupt[j4];
                double d73 = (d24 * bit[i4] + d23 * bit[j4]) * ((d70 + d71) - d72 - d31 * ((d67 + d59 + d58) - 2D * d57));
                ccai = ccai + dt * d73;
                double d74 = 1.0D / (1.0D + (d13 * d14) / Math.pow(d14 + ccasr, 2D));
                double d75 = (d74 * (d72 - d71 - d70) * d15) / d16;
                ccasr = ccasr + dt * d75;
                Itot = d42 + d43 + d54 + d55 + d60 + d46 + d49 + d67 + d57 + d58 + d59 + d68 + d56 + Istim;
                vt = v - dt * Itot;
                if(ttime > stims1 * (double)(ns1s - 1) + sdur)
                {
                    if((vt + 78D) * (v + 78D) < 0.0D)
                    {
                        napdd = napdd + 1;
                        apdtime[napdd] = ttime;
                    }
                    if(napdd == 3)
                    {
                        DII = apdtime[2] - apdtime[1];
                        APDD = apdtime[3] - apdtime[2];
                    }
                }
                v = vt;
                d += dt;
                ncount = ncount + 1;
                if(k4 == 50)
                {
                    k4 = 0;
                    int i5 = (int)(35D + (ttime * 395D) / endtime);
                    int k5 = (int)(130D - v * 1.3D);
                    int i6 = (int)(240D - xm * 140D);
                    int k6 = (int)(240D - xh * 140D);
                    int i7 = (int)(240D - xj * 140D);
                    int j7 = (int)(240D - varxf * 140D);
                    int k7 = (int)(240D - xd * 140D);
                    double d35 = (ccasr - 200D) / 100D;
                    int l7 = (int)(295D - d35 * 100D);
                    double d34 = ccai * 100D;
                    int i8 = (int)(235D - d34);
                    int j8 = (int)(240D - xfca * 140D);
                    int k8 = (int)(240D - xkr * 140D);
                    int l8 = (int)(240D - xks * 140D);
                    int i9 = (int)(240D - xto * 140D);
                    int j9 = (int)(240D - yto * 140D);
                    if(senv == 10D)
                    {
                        g.setColor(Color.red);
                        g.drawLine(j3, j, i5, k5);
                    }
                    if(senxm == 10D)
                    {
                        g.setColor(new Color(12, 100, 12));
                        g.drawLine(j3, k, i5, i6);
                    }
                    if(senxh == 10D)
                    {
                        g.setColor(Color.blue);
                        g.drawLine(j3, l, i5, k6);
                    }
                    if(senxj == 10D)
                    {
                        g.setColor(Color.darkGray);
                        g.drawLine(j3, i1, i5, i7);
                    }
                    if(senccasr == 10D)
                    {
                        g.setColor(new Color(128, 128, 0));
                        g.drawLine(j3, i, i5, l7);
                    }
                    if(senvarxf == 10D)
                    {
                        g.setColor(Color.magenta);
                        g.drawLine(j3, k1, i5, j7);
                    }
                    if(senxd == 10D)
                    {
                        g.setColor(Color.orange);
                        g.drawLine(j3, j1, i5, k7);
                    }
                    if(senccai == 10D)
                    {
                        g.setColor(Color.cyan);
                        g.drawLine(j3, l1, i5, i8);
                    }
                    if(senxfca == 10D)
                    {
                        g.setColor(new Color(83, 192, 186));
                        g.drawLine(j3, i2, i5, j8);
                    }
                    if(senxkr == 10D)
                    {
                        g.setColor(new Color(118, 0, 254));
                        g.drawLine(j3, j2, i5, k8);
                    }
                    if(senxks == 10D)
                    {
                        g.setColor(new Color(44, 154, 0));
                        g.drawLine(j3, k2, i5, l8);
                    }
                    if(senxto == 10D)
                    {
                        g.setColor(new Color(0, 254, 0));
                        g.drawLine(j3, l2, i5, i9);
                    }
                    if(senyto == 10D)
                    {
                        g.setColor(new Color(204, 100, 0));
                        g.drawLine(j3, i3, i5, j9);
                    }
                    k = i6;
                    j = k5;
                    l = k6;
                    i1 = i7;
                    j1 = k7;
                    k1 = j7;
                    l1 = i8;
                    i = l7;
                    j3 = i5;
                    i2 = j8;
                    j2 = k8;
                    k2 = l8;
                    l2 = i9;
                    i3 = j9;
                    if(nt_of_t < 0x15f90)
                    {
                        nt_of_t = nt_of_t + 1;
                        xna_of_t[nt_of_t] = (float)d42;
                        xto_of_t[nt_of_t] = (float)d43;
                        xk1_of_t[nt_of_t] = (float)d54;
                        xkp_of_t[nt_of_t] = (float)d55;
                        xnab_of_t[nt_of_t] = (float)d60;
                        xkr_of_t[nt_of_t] = (float)d46;
                        xks_of_t[nt_of_t] = (float)d49;
                        xcal_of_t[nt_of_t] = (float)d67;
                        xnaca_of_t[nt_of_t] = (float)d57;
                        xpca_of_t[nt_of_t] = (float)d58;
                        xcab_of_t[nt_of_t] = (float)d59;
                        xcak_of_t[nt_of_t] = (float)d68;
                        xnak_of_t[nt_of_t] = (float)d56;
                        xtotal_of_t[nt_of_t] = (float)Itot;
                        v_of_t[nt_of_t] = (float)v;
                        t_of_t[nt_of_t] = (float)ttime;
                    }
                }
            }

            int j5 = (int)(35D + (apdtime[1] * 395D) / endtime);
            int l5 = (int)(35D + (apdtime[2] * 395D) / endtime);
            int j6 = (int)(35D + (apdtime[2] * 395D) / endtime);
            int l6 = (int)(35D + (apdtime[3] * 395D) / endtime);
            char c = '\347';
            nf.setMaximumFractionDigits(2);
            String s3 = nf.format(APDD);
            g.setColor(Color.magenta);
            g.drawString("APD=" + String.valueOf(s3) + "ms", 300, 55);
            g.drawLine(j6, c, l6, c);
            String s4 = nf.format(DII);
            g.setColor(Color.yellow);
            g.drawString("DI =" + String.valueOf(s4) + "ms", 300, 70);
            g.drawLine(j5, c, l5, c);
        }
    }

    public void init()
    {
        setSize(610, 330);
        background = new Color(192, 192, 192);
        setBackground(background);
        background2 = new Color(141, 54, 63);
        buttonPanel = new Panel();
        butt = new Button("Start");
        butt.addActionListener(this);
        butt.setBackground(Color.green);
        promptNS1 = new Label("  N (s1's)");
        inputNS1 = new TextField(3);
        inputNS1.addActionListener(this);
        promptS1 = new Label("  S1 (bcl)");
        inputS1 = new TextField(3);
        inputS1.addActionListener(this);
        promptS2 = new Label("  S2 (bcl)");
        inputS2 = new TextField(3);
        inputS2.addActionListener(this);
        inputNS1.setText("2");
        inputS1.setText("430");
        inputS2.setText("200");
        buttonPanel.setLayout(new GridLayout(1, 7));
        buttonPanel.add(butt);
        buttonPanel.add(promptNS1);
        buttonPanel.add(inputNS1);
        buttonPanel.add(promptS1);
        buttonPanel.add(inputS1);
        buttonPanel.add(promptS2);
        buttonPanel.add(inputS2);
        checkPanel = new Panel();
        butp = new Button("Replot");
        butp.addActionListener(this);
        checkv = new Checkbox("Voltage", true);
        checkv.addItemListener(this);
        checkxm = new Checkbox("m gate", false);
        checkxm.addItemListener(this);
        checkxh = new Checkbox("h gate", false);
        checkxh.addItemListener(this);
        checkxj = new Checkbox("j gate", false);
        checkxj.addItemListener(this);
        checkxd = new Checkbox("d gate", false);
        checkxd.addItemListener(this);
        checkvarxf = new Checkbox("xf gate", false);
        checkvarxf.addItemListener(this);
        checkxfca = new Checkbox("fca gate", false);
        checkxfca.addItemListener(this);
        checkxkr = new Checkbox("kr gate", false);
        checkxkr.addItemListener(this);
        checkxks = new Checkbox("ks gate", false);
        checkxks.addItemListener(this);
        checkxto = new Checkbox("xto gate", false);
        checkxto.addItemListener(this);
        checkyto = new Checkbox("yto gate", false);
        checkyto.addItemListener(this);
        checkccai = new Checkbox("[Ca]i gate", false);
        checkccai.addItemListener(this);
        checkccasr = new Checkbox("[Ca]sr", false);
        checkccasr.addItemListener(this);
        options = new Choice();
        options.addItem("gkr=0.0136");
        options.addItem("gkr=0.0272");
        options.addItemListener(this);
        options.reshape(320, 295, 135, 25);
        add(options);
        checkPanel.setLayout(new GridLayout(7, 2));
        checkPanel.add(butp);
        checkPanel.add(checkv);
        checkPanel.add(checkxd);
        checkPanel.add(checkxm);
        checkPanel.add(checkxh);
        checkPanel.add(checkxj);
        checkPanel.add(checkxfca);
        checkPanel.add(checkxkr);
        checkPanel.add(checkxks);
        checkPanel.add(checkxto);
        checkPanel.add(checkyto);
        checkPanel.add(checkvarxf);
        checkPanel.add(checkccai);
        checkPanel.add(checkccasr);
        bgraph = new Button("Plot Currents");
        bgraph.addActionListener(this);
        add(bgraph);
        bgraph.reshape(100, 295, 135, 25);
        setLayout(new BorderLayout());
        add(checkPanel, "East");
        add(buttonPanel, "North");
        double d = 2.7999999999999998D;
        double d1 = 0.013599999999999999D;
        double d2 = 0.0022160000000000001D;
        double d3 = 2.26E-05D;
        double d4 = 5.7899999999999998E-07D;
        double d5 = 6D;
        double d6 = 0.69299999999999995D;
        double d7 = 0.050000000000000003D;
        double d8 = 8.3140000000000001D;
        double d9 = 310D;
        double d10 = 96.5D;
        double d11 = 0.00015339999999999999D;
        double d12 = 1.0D;
        double d13 = 0.34999999999999998D;
        double d14 = 0.20000000000000001D;
        double d15 = 1500D;
        double d16 = 0.17999999999999999D;
        double d17 = 13D;
        double d18 = 87.5D;
        double d19 = 1380D;
        double d20 = 10D;
        double d21 = 1.5D;
        double d22 = 0.050000000000000003D;
        double d23 = 0.32000000000000001D;
        double d24 = 10D;
        double d25 = 2D;
        double d26 = 0.10000000000000001D;
        double d27 = 2.584E-05D;
        double d28 = 10D;
        double d29 = 149.40000000000001D;
        double d30 = 138D;
        double d31 = 4D;
        double d32 = 2000D;
        double d45 = (d8 * d9) / d10;
        double d46 = d45 * Math.log(d30 / d28);
        double d47 = d45 * Math.log(d31 / d29);
        double d48 = d45 * Math.log((d31 + 0.018329999999999999D * d30) / (d29 + 0.18329999999999999D * d28));
        double d49 = (Math.exp(d30 / 67.299999999999997D) - 1.0D) / 7D;
        double d50 = 30D;
        double d51 = (d11 * d12 * 0.5D) / (d10 * d27);
        for(int i = 0; i < vtablesize; i++)
        {
            double d33 = vlo + (double)i * dvt;
            double d35;
            if(Math.abs(d33 + 47.130000000000003D) < 9.9999999999999995E-07D)
                d35 = 3.2000000000000002D;
            else
                d35 = (0.32000000000000001D * (d33 + 47.130000000000003D)) / (1.0D - Math.exp(-0.10000000000000001D * (d33 + 47.130000000000003D)));
            double d36 = 0.080000000000000002D * Math.exp(-d33 / 11D);
            double d37 = 0.13500000000000001D * Math.exp((d33 + 80D) / -6.7999999999999998D);
            double d38 = 7.5D / (1.0D + Math.exp(-0.10000000000000001D * (d33 + 11D)));
            double d39 = (0.17499999999999999D * Math.exp((d33 + 100D) / -23D)) / (1.0D + Math.exp(0.14999999999999999D * (d33 + 79D)));
            double d40 = 0.29999999999999999D / (1.0D + Math.exp(-0.10000000000000001D * (d33 + 32D)));
            taum[i] = 1.0D / (d35 + d36);
            xminf[i] = taum[i] * d35;
            tauh[i] = 1.0D / (d37 + d38);
            xhinf[i] = tauh[i] * d37;
            tauj[i] = 1.0D / (d39 + d40);
            xjinf[i] = tauj[i] * d39;
            xrinf[i] = 1.0D / (1.0D + Math.exp(-2.1819999999999999D - 0.18190000000000001D * d33));
            taukr[i] = 43D + 1.0D / (Math.exp(-5.4950000000000001D + 0.1691D * d33) + Math.exp(-7.6769999999999996D - 0.012800000000000001D * d33));
            xsinf[i] = 1.0D / (1.0D + Math.exp((d33 - 16D) / -13.6D));
            if(Math.abs(d33 - 10D) < 9.9999999999999995E-07D)
                tauks[i] = 417.94600000000003D;
            else
                tauks[i] = 1.0D / ((7.1899999999999999E-05D * (d33 - 10D)) / (1.0D - Math.exp(-0.14799999999999999D * (d33 - 10D))) + (0.00013100000000000001D * (d33 - 10D)) / (Math.exp(0.068699999999999997D * (d33 - 10D)) - 1.0D));
            double d41 = 0.045159999999999999D * Math.exp(0.035770000000000003D * d33);
            double d42 = 0.098900000000000002D * Math.exp(-0.062370000000000002D * d33);
            double d43 = (0.0054149999999999997D * Math.exp((d33 + 33.5D) / -5D)) / (1.0D + 0.051334999999999999D * Math.exp((d33 + 33.5D) / -5D));
            double d44 = (0.0054149999999999997D * Math.exp((d33 + 33.5D) / 5D)) / (1.0D + 0.051334999999999999D * Math.exp((d33 + 33.5D) / 5D));
            tauxto[i] = 1.0D / (d41 + d42);
            xtoinf[i] = d41 * tauxto[i];
            tauyto[i] = 1.0D / (d43 + d44);
            ytoinf[i] = d43 * tauyto[i];
            finf[i] = 1.0D / (1.0D + Math.exp((d33 + 12.5D) / 5D));
            tauf[i] = 30D + 200D / (1.0D + Math.exp((d33 + 20D) / 9.5D));
            dinf[i] = 1.0D / (1.0D + Math.exp((d33 + 10D) / -6.2400000000000002D));
            taud[i] = 1.0D / ((0.25D * Math.exp(-0.01D * d33)) / (1.0D + Math.exp(-0.070000000000000007D * d33)) + (0.070000000000000007D * Math.exp(-0.050000000000000003D * (d33 + 40D))) / (1.0D + Math.exp(0.050000000000000003D * (d33 + 40D))));
            xik1t[i] = (((d * d31) / (d31 + d17)) * (d33 - d47)) / (2D + Math.exp((1.6200000000000001D / d45) * (d33 - d47)));
            xikrcoeff[i] = (d1 * Math.sqrt(d31) * 0.5D * (d33 - d47)) / (1.0D + 2.5D * Math.exp(0.10000000000000001D * (d33 + 28D)));
            xikpt[i] = (d2 * (d33 - d47)) / (1.0D + Math.exp((7.4880000000000004D - d33) / 5.9800000000000004D));
            xinakt[i] = (d6 * (d31 / (d31 + d21))) / (1.0D + Math.pow(d20 / d28, 1.5D)) / (1.0D + 0.1245D * Math.exp((-0.10000000000000001D * d33) / d45) + 0.036499999999999998D * d49 * Math.exp(-d33 / d45));
            xjrelcoeff[i] = d5 / (1.0D + 1.6499999999999999D * Math.exp(d33 / 20D));
            if(Math.abs(d33) < 9.9999999999999995E-07D)
                xicakcoeff[i] = 317.10300000000001D;
            else
                xicakcoeff[i] = ((d4 / d12) * ((1000D * d33 * d10) / d45) * (d29 * Math.exp(d33 / d45) - d31)) / (Math.exp(d33 / d45) - 1.0D);
            xinacat1[i] = (d15 / (Math.pow(d18, 3D) + Math.pow(d30, 3D)) / (d19 + d32) / (1.0D + d14 * Math.exp((d33 * (d13 - 1.0D)) / d45))) * (Math.exp((d33 * d13) / d45) * Math.pow(d28, 3D) * d32);
            xinacat2[i] = (d15 / (Math.pow(d18, 3D) + Math.pow(d30, 3D)) / (d19 + d32) / (1.0D + d14 * Math.exp((d33 * (d13 - 1.0D)) / d45))) * (Math.exp((d33 * (d13 - 1.0D)) / d45) * Math.pow(d30, 3D));
            if(Math.abs(d33) < 9.9999999999999995E-07D)
            {
                xicabart1[i] = 0.0043416799999999997D * Math.exp((2D * d33) / d45);
                xicabart2[i] = 0.00148051288D * d32;
            } else
            {
                xicabart1[i] = (((d3 / d12) * 4D * d33 * d10) / d45 / (Math.exp((2D * d33) / d45) - 1.0D)) * Math.exp((2D * d33) / d45);
                xicabart2[i] = (((d3 / d12) * 4D * d33 * d10) / d45 / (Math.exp((2D * d33) / d45) - 1.0D)) * 0.34100000000000003D * d32;
            }
        }

        for(int j = 0; j < ctablesize; j++)
        {
            double d34 = cailo + (double)j * dcait;
            xipcat[j] = (d7 * d34) / (d22 + d34);
            ecat[j] = 0.5D * d45 * Math.log(d32 / d34);
            fcainf[j] = 1.0D / (1.0D + Math.pow(d34 / d16, 3D));
            bit[j] = 1.0D / (1.0D + (d24 * d25) / Math.pow(d25 + d34, 2D));
            xjupt[j] = d26 / (1.0D + Math.pow(d23 / d34, 2D));
        }

        stims1 = 430D;
        stims2 = 200D;
        nswitch = 0;
        ncounts1 = 1;
        ns1s = 2;
        sdur = stimdur;
        xnstims1 = stims1 + sdur;
        xnstims2 = stims1 * (double)ns1s + stims2 + sdur;
        endtime = xnstims2 + 650D;
        ttime = 0.0D;
        APD = 0.0D;
        nend = (int)(endtime / dt);
        istimdur = (int)(stimdur / dt);
        istimdelay = (int)(stimdelay / dt);
        ibcl = (int)(BCL / dt);
    }

    public void itemStateChanged(ItemEvent itemevent)
    {
        if(checkv.getState())
            senv = 10D;
        else
            senv = 0.0D;
        if(checkxd.getState())
            senxd = 10D;
        else
            senxd = 0.0D;
        if(checkxm.getState())
            senxm = 10D;
        else
            senxm = 0.0D;
        if(checkxh.getState())
            senxh = 10D;
        else
            senxh = 0.0D;
        if(checkxj.getState())
            senxj = 10D;
        else
            senxj = 0.0D;
        if(checkxfca.getState())
            senxfca = 10D;
        else
            senxfca = 0.0D;
        if(checkxkr.getState())
            senxkr = 10D;
        else
            senxkr = 0.0D;
        if(checkxks.getState())
            senxks = 10D;
        else
            senxks = 0.0D;
        if(checkxto.getState())
            senxto = 10D;
        else
            senxto = 0.0D;
        if(checkyto.getState())
            senyto = 10D;
        else
            senyto = 0.0D;
        if(checkccai.getState())
            senccai = 10D;
        else
            senccai = 0.0D;
        if(checkccasr.getState())
            senccasr = 10D;
        else
            senccasr = 0.0D;
        if(checkvarxf.getState())
            senvarxf = 10D;
        else
            senvarxf = 0.0D;
        if(itemevent.getItem().toString() == option1)
            gkrr = 1.0D;
        if(itemevent.getItem().toString() == option2)
            gkrr = 2D;
        if(plot_xna.getState() && sg1 == null)
        {
            float f = ntime;
            if(f >= 90000F)
                f = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af1[] = new float[nt_of_t];
            float af15[] = new float[nt_of_t];
            int j = -1;
            for(int l3 = 0; l3 < nt_of_t; l3++)
            {
                j++;
                af1[j] = xna_of_t[l3];
                af15[j] = t_of_t[l3];
            }

            sg1 = new Graphs(af1, af15, 0, j);
            sg1.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm1 {}

);
        }
        if(!plot_xna.getState() && sg1 != null)
        {
            sg1.dispose();
            sg1 = null;
        }
        if(plot_xto.getState() && sg2 == null)
        {
            float f1 = ntime;
            if(f1 >= 90000F)
                f1 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af2[] = new float[nt_of_t];
            float af16[] = new float[nt_of_t];
            int k = -1;
            for(int i4 = 0; i4 < nt_of_t; i4++)
            {
                k++;
                af2[k] = xto_of_t[i4];
                af16[k] = t_of_t[i4];
            }

            sg2 = new Graphs(af2, af16, 1, k);
            sg2.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm2 {}

);
        }
        if(!plot_xto.getState() && sg2 != null)
        {
            sg2.dispose();
            sg2 = null;
        }
        if(plot_xk1.getState() && sg3 == null)
        {
            float f2 = ntime;
            if(f2 >= 90000F)
                f2 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af3[] = new float[nt_of_t];
            float af17[] = new float[nt_of_t];
            int l = -1;
            for(int j4 = 0; j4 < nt_of_t; j4++)
            {
                l++;
                af3[l] = xk1_of_t[j4];
                af17[l] = t_of_t[j4];
            }

            sg3 = new Graphs(af3, af17, 2, l);
            sg3.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm3 {}

);
        }
        if(!plot_xk1.getState() && sg3 != null)
        {
            sg3.dispose();
            sg3 = null;
        }
        if(plot_xkp.getState() && sg4 == null)
        {
            float f3 = ntime;
            if(f3 >= 90000F)
                f3 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af4[] = new float[nt_of_t];
            float af18[] = new float[nt_of_t];
            int i1 = -1;
            for(int k4 = 0; k4 < nt_of_t; k4++)
            {
                i1++;
                af4[i1] = xkp_of_t[k4];
                af18[i1] = t_of_t[k4];
            }

            sg4 = new Graphs(af4, af18, 3, i1);
            sg4.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm4 {}

);
        }
        if(!plot_xkp.getState() && sg4 != null)
        {
            sg4.dispose();
            sg4 = null;
        }
        if(plot_xnab.getState() && sg5 == null)
        {
            float f4 = ntime;
            if(f4 >= 90000F)
                f4 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af5[] = new float[nt_of_t];
            float af19[] = new float[nt_of_t];
            int j1 = -1;
            for(int l4 = 0; l4 < nt_of_t; l4++)
            {
                j1++;
                af5[j1] = xnab_of_t[l4];
                af19[j1] = t_of_t[l4];
            }

            sg5 = new Graphs(af5, af19, 4, j1);
            sg5.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm5 {}

);
        }
        if(!plot_xnab.getState() && sg5 != null)
        {
            sg5.dispose();
            sg5 = null;
        }
        if(plot_xkr.getState() && sg6 == null)
        {
            float f5 = ntime;
            if(f5 >= 90000F)
                f5 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af6[] = new float[nt_of_t];
            float af20[] = new float[nt_of_t];
            int k1 = -1;
            for(int i5 = 0; i5 < nt_of_t; i5++)
            {
                k1++;
                af6[k1] = xkr_of_t[i5];
                af20[k1] = t_of_t[i5];
            }

            sg6 = new Graphs(af6, af20, 5, k1);
            sg6.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm6 {}

);
        }
        if(!plot_xkr.getState() && sg6 != null)
        {
            sg6.dispose();
            sg6 = null;
        }
        if(plot_xks.getState() && sg7 == null)
        {
            float f6 = ntime;
            if(f6 >= 90000F)
                f6 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af7[] = new float[nt_of_t];
            float af21[] = new float[nt_of_t];
            int l1 = -1;
            for(int j5 = 0; j5 < nt_of_t; j5++)
            {
                l1++;
                af7[l1] = xks_of_t[j5];
                af21[l1] = t_of_t[j5];
            }

            sg7 = new Graphs(af7, af21, 6, l1);
            sg7.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm7 {}

);
        }
        if(!plot_xks.getState() && sg7 != null)
        {
            sg7.dispose();
            sg7 = null;
        }
        if(plot_xcal.getState() && sg8 == null)
        {
            float f7 = ntime;
            if(f7 >= 90000F)
                f7 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af8[] = new float[nt_of_t];
            float af22[] = new float[nt_of_t];
            int i2 = -1;
            for(int k5 = 0; k5 < nt_of_t; k5++)
            {
                i2++;
                af8[i2] = xcal_of_t[k5];
                af22[i2] = t_of_t[k5];
            }

            sg8 = new Graphs(af8, af22, 7, i2);
            sg8.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm8 {}

);
        }
        if(!plot_xcal.getState() && sg8 != null)
        {
            sg8.dispose();
            sg8 = null;
        }
        if(plot_xnaca.getState() && sg9 == null)
        {
            float f8 = ntime;
            if(f8 >= 90000F)
                f8 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af9[] = new float[nt_of_t];
            float af23[] = new float[nt_of_t];
            int j2 = -1;
            for(int l5 = 0; l5 < nt_of_t; l5++)
            {
                j2++;
                af9[j2] = xnaca_of_t[l5];
                af23[j2] = t_of_t[l5];
            }

            sg9 = new Graphs(af9, af23, 8, j2);
            sg9.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm9 {}

);
        }
        if(!plot_xnaca.getState() && sg9 != null)
        {
            sg9.dispose();
            sg9 = null;
        }
        if(plot_xpca.getState() && sg10 == null)
        {
            float f9 = ntime;
            if(f9 >= 90000F)
                f9 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af10[] = new float[nt_of_t];
            float af24[] = new float[nt_of_t];
            int k2 = -1;
            for(int i6 = 0; i6 < nt_of_t; i6++)
            {
                k2++;
                af10[k2] = xpca_of_t[i6];
                af24[k2] = t_of_t[i6];
            }

            sg10 = new Graphs(af10, af24, 9, k2);
            sg10.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm10 {}

);
        }
        if(!plot_xpca.getState() && sg10 != null)
        {
            sg10.dispose();
            sg10 = null;
        }
        if(plot_xcab.getState() && sg11 == null)
        {
            float f10 = ntime;
            if(f10 >= 90000F)
                f10 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af11[] = new float[nt_of_t];
            float af25[] = new float[nt_of_t];
            int l2 = -1;
            for(int j6 = 0; j6 < nt_of_t; j6++)
            {
                l2++;
                af11[l2] = xcab_of_t[j6];
                af25[l2] = t_of_t[j6];
            }

            sg11 = new Graphs(af11, af25, 10, l2);
            sg11.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm11 {}

);
        }
        if(!plot_xcab.getState() && sg11 != null)
        {
            sg11.dispose();
            sg11 = null;
        }
        if(plot_xcak.getState() && sg12 == null)
        {
            float f11 = ntime;
            if(f11 >= 90000F)
                f11 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af12[] = new float[nt_of_t];
            float af26[] = new float[nt_of_t];
            int i3 = -1;
            for(int k6 = 0; k6 < nt_of_t; k6++)
            {
                i3++;
                af12[i3] = xcak_of_t[k6];
                af26[i3] = t_of_t[k6];
            }

            sg12 = new Graphs(af12, af26, 11, i3);
            sg12.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm12 {}

);
        }
        if(!plot_xcak.getState() && sg12 != null)
        {
            sg12.dispose();
            sg12 = null;
        }
        if(plot_xnak.getState() && sg13 == null)
        {
            float f12 = ntime;
            if(f12 >= 90000F)
                f12 = 90000F;
            if(nt_of_t >= 0x15f90)
                nt_of_t = 0x15f90;
            float af13[] = new float[nt_of_t];
            float af27[] = new float[nt_of_t];
            int j3 = -1;
            for(int l6 = 0; l6 < nt_of_t; l6++)
            {
                j3++;
                af13[j3] = xnak_of_t[l6];
                af27[j3] = t_of_t[l6];
            }

            sg13 = new Graphs(af13, af27, 12, j3);
            sg13.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm13 {}

);
        }
        if(!plot_xnak.getState() && sg13 != null)
        {
            sg13.dispose();
            sg13 = null;
        }
        if(dplot_vt.getState())
        {
            if(da == null)
            {
                float af[] = new float[nt_of_t];
                float af14[] = new float[nt_of_t];
                int i = -1;
                for(int k3 = 0; k3 < nt_of_t; k3++)
                {
                    i++;
                    nf.setMaximumFractionDigits(2);
                    float f13 = v_of_t[k3] * 100F;
                    int i7 = (int)f13;
                    float f14 = (float)i7 / 100F;
                    af[i] = f14;
                    af14[i] = t_of_t[k3];
                }

                da = new DataWin(af, af14, i);
                da.addWindowListener(new  Object()     /* anonymous class not found */
    class _anm14 {}

);
                return;
            }
        } else
        if(da != null)
        {
            da.dispose();
            da = null;
        }
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        stims1 = Double.valueOf(inputS1.getText()).doubleValue();
        ns1s = Double.valueOf(inputNS1.getText()).intValue();
        stims2 = Double.valueOf(inputS2.getText()).doubleValue();
        nswitch = 0;
        ncounts1 = 1;
        sdur = stimdur;
        xnstims1 = stims1 + sdur;
        xnstims2 = stims1 * (double)(ns1s - 1) + stims2 + sdur;
        endtime = xnstims2 + 250D;
        nend = (int)(endtime / dt);
        ttime = 0.0D;
        inputS1.setText(inputS1.getText());
        inputS2.setText(inputS2.getText());
        inputNS1.setText(inputNS1.getText());
        if(actionevent.getSource() == butp)
        {
            repaint();
            igraph = 1;
        }
        if(actionevent.getSource() == bgraph2)
        {
            igraph = 1;
            frame.dispose();
            if(sg1 != null)
            {
                sg1.dispose();
                sg1 = null;
                plot_xna.setState(false);
            }
            if(sg2 != null)
            {
                sg2.dispose();
                sg2 = null;
                plot_xto.setState(false);
            }
            if(sg3 != null)
            {
                sg3.dispose();
                sg3 = null;
                plot_xk1.setState(false);
            }
            if(sg4 != null)
            {
                sg4.dispose();
                sg4 = null;
                plot_xkp.setState(false);
            }
            if(sg5 != null)
            {
                sg5.dispose();
                sg5 = null;
                plot_xnab.setState(false);
            }
            if(sg6 != null)
            {
                sg6.dispose();
                sg6 = null;
                plot_xkr.setState(false);
            }
            if(sg7 != null)
            {
                sg7.dispose();
                sg7 = null;
                plot_xks.setState(false);
            }
            if(sg8 != null)
            {
                sg8.dispose();
                sg8 = null;
                plot_xcal.setState(false);
            }
            if(sg9 != null)
            {
                sg9.dispose();
                sg9 = null;
                plot_xnaca.setState(false);
            }
            if(sg10 != null)
            {
                sg10.dispose();
                sg10 = null;
                plot_xpca.setState(false);
            }
            if(sg11 != null)
            {
                sg11.dispose();
                sg11 = null;
                plot_xcab.setState(false);
            }
            if(sg12 != null)
            {
                sg12.dispose();
                sg12 = null;
                plot_xcak.setState(false);
            }
            if(sg13 != null)
            {
                sg13.dispose();
                sg13 = null;
                plot_xnak.setState(false);
            }
        }
        if(actionevent.getSource() == bgraph)
        {
            igraph = 1;
            frame = new Frame();
            frame.setLayout(null);
            frame.setResizable(true);
            frame.setTitle("Currents");
            frame.reshape(10, 10, 155, 540);
            bgraph2 = new Button("Dismiss Window");
            bgraph2.addActionListener(this);
            frame.add(bgraph2);
            bgraph2.reshape(7, 60, 140, 35);
            plot_xna = new Checkbox("Plot I_Na", false);
            plot_xna.addItemListener(this);
            frame.add(plot_xna);
            plot_xna.reshape(10, 85, 130, 35);
            plot_xto = new Checkbox("Plot  I_to", false);
            plot_xto.addItemListener(this);
            frame.add(plot_xto);
            plot_xto.reshape(10, 110, 130, 35);
            plot_xk1 = new Checkbox("Plot  I_K1", false);
            plot_xk1.addItemListener(this);
            frame.add(plot_xk1);
            plot_xk1.reshape(10, 135, 130, 35);
            plot_xkp = new Checkbox("Plot  I_Kp", false);
            plot_xkp.addItemListener(this);
            frame.add(plot_xkp);
            plot_xkp.reshape(10, 160, 130, 35);
            plot_xnab = new Checkbox("Plot  I_Nab", false);
            plot_xnab.addItemListener(this);
            frame.add(plot_xnab);
            plot_xnab.reshape(10, 185, 130, 35);
            plot_xkr = new Checkbox("Plot  I_Kr", false);
            plot_xkr.addItemListener(this);
            frame.add(plot_xkr);
            plot_xkr.reshape(10, 210, 130, 35);
            plot_xks = new Checkbox("Plot  I_Ks", false);
            plot_xks.addItemListener(this);
            frame.add(plot_xks);
            plot_xks.reshape(10, 235, 130, 35);
            plot_xcal = new Checkbox("Plot  I_Cal", false);
            plot_xcal.addItemListener(this);
            frame.add(plot_xcal);
            plot_xcal.reshape(10, 260, 130, 35);
            plot_xnaca = new Checkbox("Plot  I_NaCa", false);
            plot_xnaca.addItemListener(this);
            frame.add(plot_xnaca);
            plot_xnaca.reshape(10, 285, 130, 35);
            plot_xpca = new Checkbox("Plot  I_pCa", false);
            plot_xpca.addItemListener(this);
            frame.add(plot_xpca);
            plot_xpca.reshape(10, 310, 130, 35);
            plot_xcab = new Checkbox("Plot  I_bCa", false);
            plot_xcab.addItemListener(this);
            frame.add(plot_xcab);
            plot_xcab.reshape(10, 335, 130, 35);
            plot_xcak = new Checkbox("Plot  I_CaK", false);
            plot_xcak.addItemListener(this);
            frame.add(plot_xcak);
            plot_xcak.reshape(10, 360, 130, 35);
            plot_xnak = new Checkbox("Plot  I_NaK", false);
            plot_xnak.addItemListener(this);
            frame.add(plot_xnak);
            plot_xnak.reshape(10, 385, 130, 35);
            dplot_vt = new Checkbox("Ascii data (t,V)", false);
            dplot_vt.addItemListener(this);
            dplot_vt.setForeground(background2);
            frame.add(dplot_vt);
            dplot_vt.reshape(10, 460, 130, 35);
            frame.show();
        }
        if(actionevent.getSource() == butt)
            if(butt.getLabel().equals("Start"))
            {
                butt.setBackground(Color.lightGray);
                butt.setLabel("Reset");
                if(sg1 != null)
                {
                    sg1.dispose();
                    sg1 = null;
                    plot_xna.setState(false);
                }
                if(sg2 != null)
                {
                    sg2.dispose();
                    sg2 = null;
                    plot_xto.setState(false);
                }
                if(sg3 != null)
                {
                    sg3.dispose();
                    sg3 = null;
                    plot_xk1.setState(false);
                }
                if(sg4 != null)
                {
                    sg4.dispose();
                    sg4 = null;
                    plot_xkp.setState(false);
                }
                if(sg5 != null)
                {
                    sg5.dispose();
                    sg5 = null;
                    plot_xnab.setState(false);
                }
                if(sg6 != null)
                {
                    sg6.dispose();
                    sg6 = null;
                    plot_xkr.setState(false);
                }
                if(sg7 != null)
                {
                    sg7.dispose();
                    sg7 = null;
                    plot_xks.setState(false);
                }
                if(sg8 != null)
                {
                    sg8.dispose();
                    sg8 = null;
                    plot_xcal.setState(false);
                }
                if(sg9 != null)
                {
                    sg9.dispose();
                    sg9 = null;
                    plot_xnaca.setState(false);
                }
                if(sg10 != null)
                {
                    sg10.dispose();
                    sg10 = null;
                    plot_xpca.setState(false);
                }
                if(sg11 != null)
                {
                    sg11.dispose();
                    sg11 = null;
                    plot_xcab.setState(false);
                }
                if(sg12 != null)
                {
                    sg12.dispose();
                    sg12 = null;
                    plot_xcak.setState(false);
                }
                if(sg13 != null)
                {
                    sg13.dispose();
                    sg13 = null;
                    plot_xnak.setState(false);
                }
                firsttime = false;
                stims1 = 430D;
                stims2 = 200D;
                nswitch = 0;
                ncounts1 = 1;
                ns1s = 2;
                sdur = stimdur;
                xnstims1 = stims1 + sdur;
                xnstims2 = stims1 * (double)(ns1s - 1) + stims2 + sdur;
                endtime = xnstims2 + 250D;
                nend = (int)(endtime / dt);
                ttime = 0.0D;
                inputS1.setText("430");
                inputS2.setText("200");
                inputNS1.setText("2");
            } else
            {
                butt.setLabel("Start");
                if(sg1 != null)
                {
                    sg1.dispose();
                    sg1 = null;
                    plot_xna.setState(false);
                }
                if(sg2 != null)
                {
                    sg2.dispose();
                    sg2 = null;
                    plot_xto.setState(false);
                }
                if(sg3 != null)
                {
                    sg3.dispose();
                    sg3 = null;
                    plot_xk1.setState(false);
                }
                if(sg4 != null)
                {
                    sg4.dispose();
                    sg4 = null;
                    plot_xkp.setState(false);
                }
                if(sg5 != null)
                {
                    sg5.dispose();
                    sg5 = null;
                    plot_xnab.setState(false);
                }
                if(sg6 != null)
                {
                    sg6.dispose();
                    sg6 = null;
                    plot_xkr.setState(false);
                }
                if(sg7 != null)
                {
                    sg7.dispose();
                    sg7 = null;
                    plot_xks.setState(false);
                }
                if(sg8 != null)
                {
                    sg8.dispose();
                    sg8 = null;
                    plot_xcal.setState(false);
                }
                if(sg9 != null)
                {
                    sg9.dispose();
                    sg9 = null;
                    plot_xnaca.setState(false);
                }
                if(sg10 != null)
                {
                    sg10.dispose();
                    sg10 = null;
                    plot_xpca.setState(false);
                }
                if(sg11 != null)
                {
                    sg11.dispose();
                    sg11 = null;
                    plot_xcab.setState(false);
                }
                if(sg12 != null)
                {
                    sg12.dispose();
                    sg12 = null;
                    plot_xcak.setState(false);
                }
                if(sg13 != null)
                {
                    sg13.dispose();
                    sg13 = null;
                    plot_xnak.setState(false);
                }
                stims1 = 430D;
                stims2 = 200D;
                nswitch = 0;
                ncounts1 = 1;
                ns1s = 2;
                sdur = stimdur;
                xnstims1 = stims1 + sdur;
                xnstims2 = stims1 * (double)(ns1s - 1) + stims2 + sdur;
                endtime = xnstims2 + 250D;
                nend = (int)(endtime / dt);
                ttime = 0.0D;
                inputS1.setText("430");
                inputS2.setText("200");
                inputNS1.setText("2");
            }
        if(igraph == 0)
        {
            repaint();
            return;
        } else
        {
            igraph = 0;
            return;
        }
    }

    public foxtable10()
    {
        firsttime = true;
        s1 = 20D;
        s2 = 320D;
        time = 650D;
        nt = 1;
        gkrr = 1.0D;
        nf = NumberFormat.getInstance();
        gna = 4D;
        gnac = 0.0030000000000000001D;
        ena = 50D;
        gs = 0.089999999999999997D;
        senv = 10D;
        apdtime = new double[10];
        dt = 0.01D;
        endtime = 2400D;
        stimdur = 1.7D;
        stimdelay = 100D;
        nend = (int)(endtime / dt);
        istimdur = (int)(stimdur / dt);
        BCL = 1000D;
        stimstrength = -25D;
        cyclelength = 200D;
        bcl = 150;
        beats = 1018;
        option1 = "gkr=0.0136";
        option2 = "gkr=0.0272";
        vtablesize = 17000;
        ctablesize = 20000;
        xminf = new double[vtablesize];
        taum = new double[vtablesize];
        xhinf = new double[vtablesize];
        tauh = new double[vtablesize];
        xjinf = new double[vtablesize];
        tauj = new double[vtablesize];
        xrinf = new double[vtablesize];
        taukr = new double[vtablesize];
        xsinf = new double[vtablesize];
        tauks = new double[vtablesize];
        xtoinf = new double[vtablesize];
        tauxto = new double[vtablesize];
        ytoinf = new double[vtablesize];
        tauyto = new double[vtablesize];
        finf = new double[vtablesize];
        tauf = new double[vtablesize];
        dinf = new double[vtablesize];
        taud = new double[vtablesize];
        xik1t = new double[vtablesize];
        xikpt = new double[vtablesize];
        xinakt = new double[vtablesize];
        xjrelcoeff = new double[vtablesize];
        xikrcoeff = new double[vtablesize];
        xicakcoeff = new double[vtablesize];
        xinacat1 = new double[vtablesize];
        xinacat2 = new double[vtablesize];
        xicabart1 = new double[vtablesize];
        xicabart2 = new double[vtablesize];
        dvt = 0.01D;
        vlo = -100D;
        xipcat = new double[ctablesize];
        ecat = new double[ctablesize];
        fcainf = new double[ctablesize];
        bit = new double[ctablesize];
        xjupt = new double[ctablesize];
        dcait = 0.0001D;
        cailo = 0.001D;
        xna_of_t = new float[0x15f90];
        xto_of_t = new float[0x15f90];
        xk1_of_t = new float[0x15f90];
        xkp_of_t = new float[0x15f90];
        xnab_of_t = new float[0x15f90];
        xkr_of_t = new float[0x15f90];
        xks_of_t = new float[0x15f90];
        xcal_of_t = new float[0x15f90];
        xnaca_of_t = new float[0x15f90];
        xpca_of_t = new float[0x15f90];
        xcab_of_t = new float[0x15f90];
        xcak_of_t = new float[0x15f90];
        xnak_of_t = new float[0x15f90];
        t_of_t = new float[0x15f90];
        v_of_t = new float[0x15f90];
        xtotal_of_t = new float[0x15f90];
        nt_of_t = -1;
    }

    private Panel buttonPanel;
    private Panel checkPanel;
    private Panel downPanel;
    private Label prompt1;
    private Label prompt2;
    private Label prompt3;
    private Label prompt4;
    private Label prompt5;
    private Label promptg;
    private Label promptgg;
    private Label promptg2;
    private Label promptg3;
    private TextField input1;
    private TextField input2;
    private TextField input3;
    private TextField input4;
    private TextField input5;
    private Label prompts1;
    private Label prompttime;
    private Label prompta;
    private Label promptb;
    private Label promptc;
    private Label promptd;
    private Label prompte;
    private Label promptf;
    private Label prompth;
    private TextField inputs1;
    private TextField inputtime;
    private double result;
    Button butt;
    Button butp;
    Button butzoom;
    Choice options;
    private Label promptNS1;
    private Label promptS2;
    private Label promptS1;
    private TextField inputNS1;
    private TextField inputS2;
    private TextField inputS1;
    Checkbox checkv;
    Checkbox checkccai;
    Checkbox checkccasr;
    Checkbox checkvarxf;
    Checkbox checkxd;
    Checkbox checkxm;
    Checkbox checkxh;
    Checkbox checkxj;
    Checkbox checkxfca;
    Checkbox checkxkr;
    Checkbox checkxks;
    Checkbox checkxto;
    Checkbox checkyto;
    boolean firsttime;
    double s1;
    double s2;
    double time;
    double Itot;
    int is1;
    int is2;
    int ntime;
    int iis1;
    int iis2;
    int iiss;
    int nt;
    int xf;
    double gkrr;
    NumberFormat nf;
    Color background;
    Color background2;
    double v;
    double ccai;
    double ccasr;
    double varxf;
    double xd;
    double xm;
    double xh;
    double xj;
    double xfca;
    double xkr;
    double xks;
    double xto;
    double yto;
    double vt;
    double gna;
    double gnac;
    double ena;
    double gs;
    double senv;
    double senccai;
    double senccasr;
    double senvarxf;
    double senxd;
    double senxm;
    double senxh;
    double senxj;
    double senxfca;
    double senxkr;
    double senxks;
    double senxto;
    double senyto;
    double stims1;
    double stims2;
    double sdur;
    double xnstims1;
    double xnstims2;
    double ttime;
    int nswitch;
    int ncounts1;
    int ns1s;
    int napdd;
    double apdtime[];
    double APDD;
    double DII;
    double APD;
    double dt;
    double endtime;
    int iendtime;
    int ixs11;
    int ixs12;
    int ixs13;
    int ixs14;
    int ixs15;
    int ixs16;
    int ixs17;
    int ixs18;
    int ixs19;
    int ixs110;
    int ixs21;
    double stimdur;
    double stimdelay;
    int nend;
    int istimdur;
    double Istim;
    double BCL;
    int skip;
    int ncount;
    double stimstrength;
    double cyclelength;
    int istimdelay;
    int ibcl;
    double tapdi;
    double tapdf;
    double apdf;
    double stime;
    double ftime;
    double inttime;
    int bcl;
    int beats;
    double xbcl;
    double xbeats;
    String option1;
    String option2;
    int nexample;
    int vtablesize;
    int ctablesize;
    double xminf[];
    double taum[];
    double xhinf[];
    double tauh[];
    double xjinf[];
    double tauj[];
    double xrinf[];
    double taukr[];
    double xsinf[];
    double tauks[];
    double xtoinf[];
    double tauxto[];
    double ytoinf[];
    double tauyto[];
    double finf[];
    double tauf[];
    double dinf[];
    double taud[];
    double xik1t[];
    double xikpt[];
    double xinakt[];
    double xjrelcoeff[];
    double xikrcoeff[];
    double xicakcoeff[];
    double xinacat1[];
    double xinacat2[];
    double xicabart1[];
    double xicabart2[];
    double dvt;
    double vlo;
    double xipcat[];
    double ecat[];
    double fcainf[];
    double bit[];
    double xjupt[];
    double dcait;
    double cailo;
    int ntab;
    double tab;
    DataWin da;
    Graphs sg1;
    Graphs sg2;
    Graphs sg3;
    Graphs sg4;
    Graphs sg5;
    Graphs sg6;
    Graphs sg7;
    Graphs sg8;
    Graphs sg9;
    Graphs sg10;
    Graphs sg11;
    Graphs sg12;
    Graphs sg13;
    Graphs sg3a;
    Graphs sg3b;
    Button bgraph;
    Button bgraph2;
    Frame frame;
    Checkbox plot_xna;
    Checkbox plot_xto;
    Checkbox plot_xk1;
    Checkbox plot_xkp;
    Checkbox plot_xnab;
    Checkbox plot_xkr;
    Checkbox plot_xks;
    Checkbox plot_xcal;
    Checkbox plot_xnaca;
    Checkbox plot_xpca;
    Checkbox plot_xcab;
    Checkbox plot_xcak;
    Checkbox plot_xnak;
    Checkbox plot_xtotal;
    Checkbox dplot_vt;
    float xna_of_t[];
    float xto_of_t[];
    float xk1_of_t[];
    float xkp_of_t[];
    float xnab_of_t[];
    float xkr_of_t[];
    float xks_of_t[];
    float xcal_of_t[];
    float xnaca_of_t[];
    float xpca_of_t[];
    float xcab_of_t[];
    float xcak_of_t[];
    float xnak_of_t[];
    float t_of_t[];
    float v_of_t[];
    float xtotal_of_t[];
    int nt_of_t;
    int ksen;
    int ksen2;
    int igraph;
    double xtotal;
    int xpos;
}