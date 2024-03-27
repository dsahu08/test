package com.tempconv;

public class Temperature_converter extends javax.swing.JFrame {
	
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JCheckBox jCheckbox1;
	private javax.swing.JCheckBox jCheckbox2;
	private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JSpinner jSpinner1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	
	public Temperature_converter() {
		initComponents();
	}
	
	private void initComponents() {
		 jCheckbox2 = new javax.swing.JCheckBox();
	        jSpinner1 = new javax.swing.JSpinner();
	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jComboBox1 = new javax.swing.JComboBox<>();
	        jComboBox2 = new javax.swing.JComboBox<>();
	        jTextField1 = new javax.swing.JTextField();
	        jTextField2 = new javax.swing.JTextField();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        
	        jCheckbox2.setText("jCheckBox2");

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Tempertaure Converter");
	        
	        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

	        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
	        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel1.setText("Temperature Converter ");
	        
	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(142, 142, 142)
	                .addComponent(jLabel1)
	                .addContainerGap(161, Short.MAX_VALUE))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(19, 19, 19)
	                .addComponent(jLabel1)
	                .addContainerGap(23, Short.MAX_VALUE))
	        );

	        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit" }));

	        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit" }));

	        jTextField2.setEditable(false);
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(50, 50, 50)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jComboBox1, 0, 116, Short.MAX_VALUE))
	                .addGap(133, 133, 133)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jButton1)
	                .addGap(30, 30, 30)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jButton3)
	                    .addComponent(jButton2))
	                .addGap(29, 29, 29))
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGap(46, 46, 46)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGap(3, 3, 3)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jButton1)
	                        .addComponent(jButton2))
	                    .addGap(18, 18, 18)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jButton3)
	                    .addGap(37, 37, 37))
	            );
	        pack();
	}
	
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextField1.setText("");
        jTextField2.setText("");
    }     
	
	 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        String val1=(String)jComboBox1.getSelectedItem();
	        String val2=(String)jComboBox2.getSelectedItem();
	        
	        if(val1.equals("Celsius") && val2.equals("Fahrenheit")){
	            double cel = Double.parseDouble(jTextField1.getText());
	            double fah = (double)((9.0/5.0)*cel + 32);
	            
	            jTextField2.setText(String.valueOf(fah));
	        }else if(val1.equals("Celsius") && val2.equals("Celsius"))
	        {
	            double c = Double.parseDouble(jTextField1.getText());
	          
	            jTextField2.setText(String.valueOf(c));
	        }
	         if(val1.equals("Fahrenheit") && val2.equals("Celsius"))
	        {
	            double f = Double.parseDouble(jTextField1.getText());
	            
	            double c = (double)((f - 32)*(5.0/9.0));
	            
	            jTextField2.setText(String.valueOf(Math.round(c)));
	        } 
	         else if(val1.equals("Fahrenheit") && val2.equals("Fahrenheit"))
	        {
	            double f = Double.parseDouble(jTextField1.getText());
	          
	            jTextField2.setText(String.valueOf(Math.round(f)));
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
	        } 
	        catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(Temperature_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Temperature_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Temperature_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } 
	        catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Temperature_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        java.awt.EventQueue.invokeLater(new Runnable() {
	        public void run() {
	               new Temperature_converter().setVisible(true);
	        }
	        });
	    }
	

}
