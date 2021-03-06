package parte;

/**
 *
 * @author Jordan Hennell n8331472
 * @author Michael Clark n8583331
 */
public class PartE extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public PartE() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        circuitBoard2 = new Digital.CircuitBoard();
        switch2 = new Digital.Switch();
        lED2 = new Digital.LED();
        switch1 = new Digital.Switch();
        aNDGate1 = new Digital.ANDGate();
        nOTGate1 = new Digital.NOTGate();
        oRGate1 = new Digital.ORGate();
        xORGate1 = new Digital.XORGate();
        pin1 = new Digital.Pin();
        lED1 = new Digital.LED();
        lED3 = new Digital.LED();
        lED4 = new Digital.LED();
        lED5 = new Digital.LED();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        circuitBoard2.setLayout(null);
        circuitBoard2.add(switch2);
        switch2.setBounds(190, 310, 35, 39);

        lED2.setInput(aNDGate1.getOutput());

        javax.swing.GroupLayout lED2Layout = new javax.swing.GroupLayout(lED2);
        lED2.setLayout(lED2Layout);
        lED2Layout.setHorizontalGroup(
            lED2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        lED2Layout.setVerticalGroup(
            lED2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        circuitBoard2.add(lED2);
        lED2.setBounds(430, 130, 30, 35);
        circuitBoard2.add(switch1);
        switch1.setBounds(190, 180, 35, 39);

        aNDGate1.setInput0(switch1.getOutput());
        aNDGate1.setInput1(switch2.getOutput());

        javax.swing.GroupLayout aNDGate1Layout = new javax.swing.GroupLayout(aNDGate1);
        aNDGate1.setLayout(aNDGate1Layout);
        aNDGate1Layout.setHorizontalGroup(
            aNDGate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        aNDGate1Layout.setVerticalGroup(
            aNDGate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        circuitBoard2.add(aNDGate1);
        aNDGate1.setBounds(340, 140, 48, 20);

        nOTGate1.setInput0(switch1.getOutput());

        javax.swing.GroupLayout nOTGate1Layout = new javax.swing.GroupLayout(nOTGate1);
        nOTGate1.setLayout(nOTGate1Layout);
        nOTGate1Layout.setHorizontalGroup(
            nOTGate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        nOTGate1Layout.setVerticalGroup(
            nOTGate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        circuitBoard2.add(nOTGate1);
        nOTGate1.setBounds(340, 300, 48, 20);

        oRGate1.setInput0(switch1.getOutput());
        oRGate1.setInput1(switch2.getOutput());

        javax.swing.GroupLayout oRGate1Layout = new javax.swing.GroupLayout(oRGate1);
        oRGate1.setLayout(oRGate1Layout);
        oRGate1Layout.setHorizontalGroup(
            oRGate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        oRGate1Layout.setVerticalGroup(
            oRGate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        circuitBoard2.add(oRGate1);
        oRGate1.setBounds(340, 190, 48, 20);

        xORGate1.setInput0(switch1.getOutput());
        xORGate1.setInput1(switch2.getOutput());

        javax.swing.GroupLayout xORGate1Layout = new javax.swing.GroupLayout(xORGate1);
        xORGate1.setLayout(xORGate1Layout);
        xORGate1Layout.setHorizontalGroup(
            xORGate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        xORGate1Layout.setVerticalGroup(
            xORGate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        circuitBoard2.add(xORGate1);
        xORGate1.setBounds(340, 240, 48, 20);

        pin1.setInput0(switch1.getOutput());

        javax.swing.GroupLayout pin1Layout = new javax.swing.GroupLayout(pin1);
        pin1.setLayout(pin1Layout);
        pin1Layout.setHorizontalGroup(
            pin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pin1Layout.setVerticalGroup(
            pin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        circuitBoard2.add(pin1);
        pin1.setBounds(350, 360, 10, 20);

        lED1.setInput(oRGate1.getOutput());

        javax.swing.GroupLayout lED1Layout = new javax.swing.GroupLayout(lED1);
        lED1.setLayout(lED1Layout);
        lED1Layout.setHorizontalGroup(
            lED1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        lED1Layout.setVerticalGroup(
            lED1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        circuitBoard2.add(lED1);
        lED1.setBounds(430, 180, 30, 35);

        lED3.setInput(xORGate1.getOutput());

        javax.swing.GroupLayout lED3Layout = new javax.swing.GroupLayout(lED3);
        lED3.setLayout(lED3Layout);
        lED3Layout.setHorizontalGroup(
            lED3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        lED3Layout.setVerticalGroup(
            lED3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        circuitBoard2.add(lED3);
        lED3.setBounds(430, 230, 30, 35);

        lED4.setInput(nOTGate1.getOutput());

        javax.swing.GroupLayout lED4Layout = new javax.swing.GroupLayout(lED4);
        lED4.setLayout(lED4Layout);
        lED4Layout.setHorizontalGroup(
            lED4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        lED4Layout.setVerticalGroup(
            lED4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        circuitBoard2.add(lED4);
        lED4.setBounds(430, 290, 30, 35);

        lED5.setInput(pin1.getOutput());

        javax.swing.GroupLayout lED5Layout = new javax.swing.GroupLayout(lED5);
        lED5.setLayout(lED5Layout);
        lED5Layout.setHorizontalGroup(
            lED5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        lED5Layout.setVerticalGroup(
            lED5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        circuitBoard2.add(lED5);
        lED5.setBounds(430, 350, 30, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circuitBoard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(circuitBoard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Digital.ANDGate aNDGate1;
    private Digital.CircuitBoard circuitBoard2;
    private Digital.LED lED1;
    private Digital.LED lED2;
    private Digital.LED lED3;
    private Digital.LED lED4;
    private Digital.LED lED5;
    private Digital.NOTGate nOTGate1;
    private Digital.ORGate oRGate1;
    private Digital.Pin pin1;
    private Digital.Switch switch1;
    private Digital.Switch switch2;
    private Digital.XORGate xORGate1;
    // End of variables declaration//GEN-END:variables
}
