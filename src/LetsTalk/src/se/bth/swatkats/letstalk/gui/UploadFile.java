package se.bth.swatkats.letstalk.gui;

import java.awt.Toolkit;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * This class provides the window which shows the user the progress of a file
 * when it is uploaded.
 * 
 * @author Sokratis Papadopoulos and David Alarcon Prada.
 */
public class UploadFile extends javax.swing.JFrame {

    /**
     * Creates new form UploadFile
     */
    public UploadFile() {
        initComponents();
        myInitComponents();
    }

     /**
     * Provides modifications written by us.
     */
    private void myInitComponents(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img/iconHead.png")));
    }  
    
    /**
     * This method changes the appearance of the progress bar.
     * 
     * @param value - New value of the progress bar.
     */
    public void setProgressValue(int value){
        progressBar.setValue(value);
    }
    
    /**
     * This method notified when the file is uploaded and close the window.
     */
    public void fileUploaded(){
        showMessageDialog(null, "File successfully uploaded!");
        this.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newConversationPanel = new javax.swing.JPanel();
        createNewConversationLabel = new javax.swing.JLabel();
        selectUserPanel = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        addDeleteUserIcon1 = new javax.swing.JLabel();

        newConversationPanel.setBackground(new java.awt.Color(247, 247, 247));

        createNewConversationLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createNewConversationLabel.setText("Uploading file...");

        selectUserPanel.setBackground(new java.awt.Color(237, 237, 255));
        selectUserPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("file is on its way to the server...");

        javax.swing.GroupLayout selectUserPanelLayout = new javax.swing.GroupLayout(selectUserPanel);
        selectUserPanel.setLayout(selectUserPanelLayout);
        selectUserPanelLayout.setHorizontalGroup(
            selectUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectUserPanelLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(selectUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectUserPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectUserPanelLayout.createSequentialGroup()
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        selectUserPanelLayout.setVerticalGroup(
            selectUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectUserPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        addDeleteUserIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se/bth/swatkats/letstalk/gui/img/upload-icon.png"))); // NOI18N

        javax.swing.GroupLayout newConversationPanelLayout = new javax.swing.GroupLayout(newConversationPanel);
        newConversationPanel.setLayout(newConversationPanelLayout);
        newConversationPanelLayout.setHorizontalGroup(
            newConversationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newConversationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addDeleteUserIcon1)
                .addGap(18, 18, 18)
                .addComponent(createNewConversationLabel)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newConversationPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(selectUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        newConversationPanelLayout.setVerticalGroup(
            newConversationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newConversationPanelLayout.createSequentialGroup()
                .addGroup(newConversationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newConversationPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(createNewConversationLabel)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newConversationPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addDeleteUserIcon1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(selectUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newConversationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(newConversationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Main method which starts the class.
     * 
     * @param args the command line arguments.
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UploadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadFile().setVisible(true);
                
            }
        });
               
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addDeleteUserIcon1;
    private javax.swing.JLabel createNewConversationLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel newConversationPanel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JPanel selectUserPanel;
    // End of variables declaration//GEN-END:variables
    
}
