
import java.awt.Color;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    public login() {
        initComponents();
        
        Student s;
        try {
           Scanner x = new Scanner(new File("record.txt"));
           x.useDelimiter("[,\n]");
           
           while(x.hasNext())
           {
               s = new Student();
               s.fullName = x.next();
               s.age = Integer.parseInt(x.next());
               s.contact = Integer.parseInt(x.next());
               s.department = x.next();
               s.semester = x.next();
               s.section = x.next();            
               DataHandler.insert(s);
           }
           
           x.close();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error in Searching");
       }
       
       
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPage = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(661, 332));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login to Portal");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username: ");

        username.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        password.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        loginBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        message.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        message.setText(" ");
        message.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        loginPage.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPage.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPage.setLayer(username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPage.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPage.setLayer(password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPage.setLayer(loginBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPage.setLayer(message, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout loginPageLayout = new javax.swing.GroupLayout(loginPage);
        loginPage.setLayout(loginPageLayout);
        loginPageLayout.setHorizontalGroup(
            loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPageLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(147, 147, 147))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(207, 207, 207))
        );
        loginPageLayout.setVerticalGroup(
            loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPageLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(message)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
        
        FileOptions loginCheck = new FileOptions();
        
        //Checking if Username and password is empty
        if(username.getText().isEmpty() || password.getText().isEmpty()){
            message.setText("Enter Username and password!!");
            message.setForeground(Color.red);
        }else if(loginCheck.checkLogin(username.getText(), password.getText(), "login.txt")){ //Checking Valid username and pass           
            addStudent add = new addStudent();
            add.setVisible(true);
            this.setVisible(false);
        }else{
            message.setText("Invalid Username and Password!!");
            message.setForeground(Color.red);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JDesktopPane loginPage;
    private javax.swing.JLabel message;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
