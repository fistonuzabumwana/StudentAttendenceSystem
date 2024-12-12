/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.student.attendence.studentattendencesystem.views;


import java.awt.*;
import java.sql.*;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.swing.JOptionPane.showMessageDialog;

public class    LoginView extends javax.swing.JFrame {
    private final String url = "jdbc:mysql://localhost/SAS";
    private final String username = "root";
    private final String password = "";



    public LoginView() {
		initComponents();
	}


	@SuppressWarnings("unchecked")
        private void initComponents() {

                LoginPanel = new javax.swing.JPanel();
                logoIconLabel = new javax.swing.JLabel();
                usernameLabel = new javax.swing.JLabel();
                usernameTextField = new javax.swing.JTextField();
                passwordLabel = new javax.swing.JLabel();
                forgotPasswordLabel = new javax.swing.JLabel();
                staffCheckBox = new javax.swing.JCheckBox();
                signInButton = new javax.swing.JButton();
                dhaLabel = new javax.swing.JLabel();
                signUpLabel = new javax.swing.JLabel();
                passwordTextField = new javax.swing.JPasswordField();
                backgroundIconLabel = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                LoginPanel.setBackground(new java.awt.Color(255, 255, 255));

                logoIconLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Desktop/AUCA/Java Programming/Final project/StudentAttendenceSystem/src/main/resources/logo3.png")); // NOI18N

                usernameLabel.setText("Enter your Email or ID");

                usernameTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                usernameTextFieldActionPerformed(evt);
                        }
                });

                passwordLabel.setText("Password");

                forgotPasswordLabel.setBackground(new java.awt.Color(255, 255, 255));
                forgotPasswordLabel.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
                forgotPasswordLabel.setForeground(new java.awt.Color(102, 102, 102));
                forgotPasswordLabel.setText("Forgot password");
                forgotPasswordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                forgotPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                forgotPasswordLabelMouseClicked(evt);
                        }
                });

                staffCheckBox.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
                staffCheckBox.setText("I am a staff");
                staffCheckBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                staffCheckBoxActionPerformed(evt);
                        }
                });

                signInButton.setBackground(new java.awt.Color(48, 100, 159));
                signInButton.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
                signInButton.setForeground(new java.awt.Color(255, 255, 255));
                signInButton.setText("Sign In");
                signInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                signInButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
                signInButton.setIconTextGap(0);
                signInButton.setName(""); // NOI18N
                signInButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                signInButtonActionPerformed(evt);
                        }
                });

                dhaLabel.setForeground(new java.awt.Color(51, 51, 51));
                dhaLabel.setText("Don't have an account?");

                signUpLabel.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
                signUpLabel.setForeground(new java.awt.Color(53, 116, 255));
                signUpLabel.setText("Sign Up");
                signUpLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                signUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                signUpLabelMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
                LoginPanel.setLayout(LoginPanelLayout);
                LoginPanelLayout.setHorizontalGroup(
                        LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                                .addGap(0, 149, Short.MAX_VALUE)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(usernameTextField)
                                                        .addComponent(usernameLabel)
                                                        .addComponent(passwordLabel)
                                                        .addComponent(forgotPasswordLabel)
                                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(LoginPanelLayout.createSequentialGroup()
                                                        .addGap(64, 64, 64)
                                                        .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(logoIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(142, 142, 142))
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(LoginPanelLayout.createSequentialGroup()
                                                .addGap(185, 185, 185)
                                                .addComponent(staffCheckBox))
                                        .addGroup(LoginPanelLayout.createSequentialGroup()
                                                .addGap(170, 170, 170)
                                                .addComponent(dhaLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(signUpLabel)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                LoginPanelLayout.setVerticalGroup(
                        LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(logoIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(usernameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passwordLabel)
                                .addGap(8, 8, 8)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(forgotPasswordLabel)
                                .addGap(18, 18, 18)
                                .addComponent(staffCheckBox)
                                .addGap(32, 32, 32)
                                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(signUpLabel)
                                        .addComponent(dhaLabel))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                backgroundIconLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/loginBackground.png")); // NOI18N

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backgroundIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(backgroundIconLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                pack();
        }

        private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
                // TODO add your handling code here:
        }

        private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed

        String userID = usernameTextField.getText();
        String passwd = passwordTextField.getText();
        String query = "SELECT LastName FROM SAS.Users WHERE UserID = ? AND Password = ?";

            try(Connection con = DriverManager.getConnection(url,username,password);
                PreparedStatement retrieve = con.prepareStatement(query)) {
                retrieve.setString(1, userID);
                retrieve.setString(2, passwd);

                ResultSet resultSet = retrieve.executeQuery();

                if(resultSet.next()){
                   // this.loggedInUser = resultSet.getString("LastName");
                    //SessionControl sessionControl = new SessionControl();
                    String sessionToken = UUID.randomUUID().toString(); // Generate a unique session token

                    String sessionQuery = "INSERT INTO SAS.Session (StudentID, SessionToken) VALUES (?, ?)";

                    try (Connection connection = DriverManager.getConnection(this.url, this.username, this.password);
                         PreparedStatement stmt = connection.prepareStatement(sessionQuery)) {

                        stmt.setString(1, userID);
                        stmt.setString(2, sessionToken);

                        int rowsInserted = stmt.executeUpdate();
                        if (rowsInserted > 0) {
                            System.out.println("Session created successfully for StudentID: " + userID);
                        }

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    //sessionControl.setCurrentLoggedInUser(resultSet.getString("LastName"));
                    DashboardView dash = new DashboardView();
                    dash.setVisible(true);

                    dispose();
                }

            }catch (SQLException e){
                Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);
                showMessageDialog(this, "Error retrieve data: " + e.getMessage());

            }
        }


        private void forgotPasswordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordLabelMouseClicked
            // TODO add your handling code here:
        }
        private void signUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseClicked
            SignUpView signUp = new SignUpView();
            signUp.setVisible(true);
            dispose();

    }

        private void staffCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffCheckBoxActionPerformed
                // TODO add your handling code here:
        }

	/**
	 * @param args the command line arguments
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
			java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginView().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel LoginPanel;
        private javax.swing.JLabel backgroundIconLabel;
        private javax.swing.JLabel dhaLabel;
        private javax.swing.JLabel forgotPasswordLabel;
        private javax.swing.JLabel logoIconLabel;
        private javax.swing.JLabel passwordLabel;
        private javax.swing.JPasswordField passwordTextField;
        private javax.swing.JButton signInButton;
        private javax.swing.JLabel signUpLabel;
        private javax.swing.JCheckBox staffCheckBox;
        private javax.swing.JLabel usernameLabel;
        private javax.swing.JTextField usernameTextField;
}
