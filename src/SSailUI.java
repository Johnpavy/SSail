
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
 
        
public class SSailUI extends javax.swing.JFrame {
    User user1 = new User("John", "Pavelchak", "password".toCharArray(), "johnpavelchak");
    char[] password;
    String login;
    boolean correctInfo = false;
    databaseConnect database = new databaseConnect();

    /**
     * Creates new form SSailUI
     */
    public SSailUI() {
        initComponents();
       
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        passwordBox = new javax.swing.JPasswordField();
        userNameBox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to SSail, the school planning tool! ");
        jLabel1.setToolTipText("");

        passwordBox.setText("Password");
        passwordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordBoxActionPerformed(evt);
            }
        });

        userNameBox.setText("User Name");
        userNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter your user name and password below");

        jButton2.setText("New User");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(userNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(userNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(127, 127, 127))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login = userNameBox.getText();
        password = passwordBox.getPassword();
        correctInfo = user1.infoCheck(password, login);
        if(correctInfo == true)
        {
            
            /*JFrame1.
            jframe.setContentPane(your_new_panel);
            jframe.invalidate();
            jframe.validate();*/
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            /*try{
            String host = "jdbc:derby://localhost:1527/SchoolDB"; 
            String uName = "johnpavelchak";
            String uPass = "5rdx%RDX";
           Connection con = DriverManager.getConnection(host, uName, uPass );
            }
            catch(SQLException err){
                System.out.println(err.getMessage());
            }*/
        
        //</editor-fold>
        databaseConnect database = new databaseConnect();
        
        database.createConnection();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SSailUI().setVisible(true);
            }
        });
        CreateInstructorDatabase instructors = new CreateInstructorDatabase();
        instructors.openInstructorConnection(database);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordBox;
    private javax.swing.JTextField userNameBox;
    // End of variables declaration//GEN-END:variables
}
