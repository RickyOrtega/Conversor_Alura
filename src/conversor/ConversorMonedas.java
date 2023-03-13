package conversor;

import java.text.DecimalFormat;

public class ConversorMonedas extends javax.swing.JFrame {
    
    Moneda[] monedas = new Moneda[5];

    public ConversorMonedas() {
        
        monedas = new Moneda[5];
        monedas[0]= new Moneda(4722.83,0.00021,"USD");
        monedas[1]= new Moneda(5028.16,0.00020,"EUR");
        monedas[2]= new Moneda(5683.45,0.00018,"GBP");
        monedas[3]= new Moneda(34.99,0.029,"JPY");
        monedas[4]= new Moneda(3.58,0.28,"KRW");
        
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selectorMonedaDestino = new javax.swing.JComboBox<>();
        entradaMoneda = new javax.swing.JTextField();
        salidaMoneda = new javax.swing.JTextField();
        divisaOrigen = new javax.swing.JLabel();
        divisaDestino = new javax.swing.JLabel();
        alerta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor Monedas");
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elige el tipo de convesión que quieres realizar: ");

        selectorMonedaDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesos colombianos - Dólar", "Pesos colombianos -Euro", "Pesos colombianos -Libras", "Pesos colombianos -Yen", "Pesos colombianos - Won Coreano", "Dólar - Pesos colombianos", "Euro - Pesos colombianos", "Libras - Pesos colombianos", "Yen - Pesos colombianos", "Won Coreano - Pesos colombianos" }));
        selectorMonedaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorMonedaDestinoActionPerformed(evt);
            }
        });

        entradaMoneda.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                entradaMonedaCaretUpdate(evt);
            }
        });

        salidaMoneda.setEnabled(false);

        divisaOrigen.setText("COP:");

        divisaDestino.setText("USD:");

        alerta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(selectorMonedaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(divisaDestino)
                                    .addComponent(divisaOrigen))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(entradaMoneda)
                                    .addComponent(salidaMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(selectorMonedaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alerta)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisaOrigen))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisaDestino)
                    .addComponent(salidaMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(238, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectorMonedaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorMonedaDestinoActionPerformed
        int monedaSelect = selectorMonedaDestino.getSelectedIndex();
        
        if(monedaSelect>=0 && monedaSelect<5){
            divisaOrigen.setText("COP");
            divisaDestino.setText(monedas[monedaSelect].getNombreDivisa());
        } else {
            System.out.println(monedaSelect-5);
            divisaOrigen.setText(monedas[monedaSelect-5].getNombreDivisa());
            divisaDestino.setText("COP");
        }
    }//GEN-LAST:event_selectorMonedaDestinoActionPerformed

    private void entradaMonedaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_entradaMonedaCaretUpdate
        convertirMoneda();
    }//GEN-LAST:event_entradaMonedaCaretUpdate

    private void convertirMoneda(){
        alerta.setText(comprobarDinero(Integer.parseInt(this.entradaMoneda.getText())));
        int monedaSelect = selectorMonedaDestino.getSelectedIndex();
        String patron="###,####.##";
        DecimalFormat objDF = new DecimalFormat(patron);
        
        if(alerta.getText().equals("")){
            if(monedaSelect>=0 && monedaSelect<5){
                double valor = monedas[monedaSelect].getValorCOPEnMonedaDestino()*Double.parseDouble(entradaMoneda.getText());
                String cadena = objDF.format(valor);
                salidaMoneda.setText(cadena);
            }else {
                double valor = monedas[monedaSelect-5].getValorUnitarioEnCOP()*Double.parseDouble(entradaMoneda.getText());
                String cadena = objDF.format(valor);
                salidaMoneda.setText(cadena);
            }
        }
    }
    
    private String comprobarDinero(double dinero){
        if(dinero<=0){
            return "No se pueden ingresar números negativos.";
        } else {
            return "";
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorMonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alerta;
    private javax.swing.JLabel divisaDestino;
    private javax.swing.JLabel divisaOrigen;
    private javax.swing.JTextField entradaMoneda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField salidaMoneda;
    private javax.swing.JComboBox<String> selectorMonedaDestino;
    // End of variables declaration//GEN-END:variables
}
