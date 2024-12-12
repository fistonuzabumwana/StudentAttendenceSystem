
package edu.student.attendence.studentattendencesystem.views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.swing.JOptionPane.showMessageDialog;

public class StudentView extends javax.swing.JFrame {
        private final String url = "jdbc:mysql://localhost/SAS";
        private final String username = "root";
        private final String password = "";


	public StudentView() {

		initComponents();
            this.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                            clearSession();
                            System.out.println("DashboardView closed. Session cleared.");
                            System.exit(0); // Exit the application
                    }
            });
	}


	@SuppressWarnings("unchecked")
        private void initComponents() {

                jMenuBar1 = new javax.swing.JMenuBar();
                jMenu1 = new javax.swing.JMenu();
                jMenu2 = new javax.swing.JMenu();
                jPanel1 = new javax.swing.JPanel();
                titlePanel = new javax.swing.JPanel();
                logoutButton = new javax.swing.JButton();
                sasTitleLabel = new javax.swing.JLabel();
                menuSidePanel = new javax.swing.JPanel();
                dashboardLabel = new javax.swing.JLabel();
                dashDownSeparator = new javax.swing.JSeparator();
                courseInfoLabel = new javax.swing.JLabel();
                courseDownSeparator = new javax.swing.JSeparator();
                attendenceInfoLabel = new javax.swing.JLabel();
                attendenceDownSeparator = new javax.swing.JSeparator();
                reportDownSeparator = new javax.swing.JSeparator();
                reportInfoLabel = new javax.swing.JLabel();
                studentDownSeparator = new javax.swing.JSeparator();
                studentInfoLabel = new javax.swing.JLabel();
                groupInfoLabel1 = new javax.swing.JLabel();
                reportDownSeparator1 = new javax.swing.JSeparator();
                usernameTitlePanel = new javax.swing.JPanel();
                usernameHeadLabel = new javax.swing.JLabel();
                usernameTitleLabel = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jComboBox1 = new javax.swing.JComboBox<>();
                jButton2 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jComboBox2 = new javax.swing.JComboBox<>();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                firstNameAddTextField = new javax.swing.JTextField();
                lastNameAddTextField = new javax.swing.JTextField();
                idAddTextField = new javax.swing.JTextField();
                jButton6 = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                courseAddComboBox = new javax.swing.JComboBox<>();
                courseAddComboBox1 = new javax.swing.JComboBox<>();
                jMenuBar3 = new javax.swing.JMenuBar();
                fileMenu = new javax.swing.JMenu();
                narFileMenuItem = new javax.swing.JMenuItem();
                saveFileMenuItem = new javax.swing.JMenuItem();
                saveAsFileMenuItem = new javax.swing.JMenuItem();
                exportFileMenuItem = new javax.swing.JMenuItem();
                exitFileMenuItem = new javax.swing.JMenuItem();
                editMenu = new javax.swing.JMenu();
                studentEditMenuItem = new javax.swing.JMenuItem();
                courseEditMenuItem = new javax.swing.JMenuItem();
                groupEditMenuItem = new javax.swing.JMenuItem();
                attendenceEditMenuItem = new javax.swing.JMenuItem();
                viewMenu = new javax.swing.JMenu();
                overViewMenuItem = new javax.swing.JMenuItem();
                profileViewMenuItem = new javax.swing.JMenuItem();
                classViewMenuItem = new javax.swing.JMenuItem();
                reportMenu = new javax.swing.JMenu();
                pdfReportMenuItem = new javax.swing.JMenuItem();
                customReportsMenuItem = new javax.swing.JMenuItem();
                emailReportMenuItem = new javax.swing.JMenuItem();
                toolMenu = new javax.swing.JMenu();
                importToolMenuItem = new javax.swing.JMenuItem();
                backupToolMenuItem = new javax.swing.JMenuItem();
                restoreToolMenuItem = new javax.swing.JMenuItem();
                settingToolMenuItem = new javax.swing.JMenuItem();
                helpMenu = new javax.swing.JMenu();
                userHelpMenuItem = new javax.swing.JMenuItem();
                aboutHelpMenuItem = new javax.swing.JMenuItem();
                supportHelpMenuItem = new javax.swing.JMenuItem();
                adminMenu = new javax.swing.JMenu();
                userAdminMenuItem = new javax.swing.JMenuItem();
                studentModelTable = new DefaultTableModel();


                jMenu1.setText("File");
                jMenuBar1.add(jMenu1);

                jMenu2.setText("Edit");
                jMenuBar1.add(jMenu2);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                titlePanel.setBackground(new java.awt.Color(3, 44, 106));
                titlePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

                logoutButton.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
                logoutButton.setForeground(new java.awt.Color(3, 44, 106));
                logoutButton.setText("Logout");
                logoutButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                logoutButtonActionPerformed(evt);
                        }
                });

                sasTitleLabel.setFont(new java.awt.Font("Liberation Sans", 1, 28)); // NOI18N
                sasTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
                sasTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                sasTitleLabel.setText("STUDENT ATTENDENCE SYSTEM");

                javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
                titlePanel.setLayout(titlePanelLayout);
                titlePanelLayout.setHorizontalGroup(
                        titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sasTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(logoutButton)
                                .addGap(21, 21, 21))
                );
                titlePanelLayout.setVerticalGroup(
                        titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(titlePanelLayout.createSequentialGroup()
                                                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                                .addGap(11, 11, 11))
                                        .addGroup(titlePanelLayout.createSequentialGroup()
                                                .addComponent(sasTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
                );

                menuSidePanel.setBackground(new java.awt.Color(3, 44, 106));

                dashboardLabel.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
                dashboardLabel.setForeground(new java.awt.Color(255, 255, 255));
                dashboardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                dashboardLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/dashboard-24.png")); // NOI18N
                dashboardLabel.setText("DASHBOARD");
                dashboardLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                dashboardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                dashboardLabelMouseClicked(evt);
                        }
                });

                courseInfoLabel.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
                courseInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
                courseInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                courseInfoLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/book-16-24 (1).png")); // NOI18N
                courseInfoLabel.setText("COURSE INFO");
                courseInfoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                courseInfoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                courseInfoLabelMouseClicked(evt);
                        }
                });

                attendenceInfoLabel.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
                attendenceInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
                attendenceInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                attendenceInfoLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/checked-user-24.png")); // NOI18N
                attendenceInfoLabel.setText("ATTENDENCE");
                attendenceInfoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                attendenceInfoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                attendenceInfoLabelMouseClicked(evt);
                        }
                });

                reportInfoLabel.setBackground(new java.awt.Color(3, 44, 106));
                reportInfoLabel.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
                reportInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
                reportInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                reportInfoLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/report-3-24.png")); // NOI18N
                reportInfoLabel.setText("REPORT INFO");
                reportInfoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                reportInfoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                reportInfoLabelMouseClicked(evt);
                        }
                });

                studentInfoLabel.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
                studentInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
                studentInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                studentInfoLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/student-24.png")); // NOI18N
                studentInfoLabel.setText("STUDENT INFO");
                studentInfoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                studentInfoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                studentInfoLabelMouseClicked(evt);
                        }
                });

                groupInfoLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
                groupInfoLabel1.setForeground(new java.awt.Color(255, 255, 255));
                groupInfoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                groupInfoLabel1.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/administrator-2-24.png")); // NOI18N
                groupInfoLabel1.setText("Admin");
                groupInfoLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                groupInfoLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                groupInfoLabel1MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout menuSidePanelLayout = new javax.swing.GroupLayout(menuSidePanel);
                menuSidePanel.setLayout(menuSidePanelLayout);
                menuSidePanelLayout.setHorizontalGroup(
                        menuSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dashDownSeparator)
                        .addComponent(courseInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addGroup(menuSidePanelLayout.createSequentialGroup()
                                .addGroup(menuSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dashboardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(courseDownSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(menuSidePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(studentDownSeparator))
                                        .addComponent(attendenceInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(attendenceDownSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(menuSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(reportInfoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(menuSidePanelLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(reportDownSeparator))
                                                .addComponent(reportDownSeparator1)
                                                .addGroup(menuSidePanelLayout.createSequentialGroup()
                                                        .addComponent(groupInfoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                .addContainerGap())
                );
                menuSidePanelLayout.setVerticalGroup(
                        menuSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menuSidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dashboardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dashDownSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(studentDownSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courseInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courseDownSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(attendenceInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(attendenceDownSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reportInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reportDownSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(groupInfoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(reportDownSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                usernameTitlePanel.setBackground(new java.awt.Color(255, 255, 255));
                usernameTitlePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

                usernameHeadLabel.setBackground(new java.awt.Color(3, 44, 10));
                usernameHeadLabel.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
                usernameHeadLabel.setForeground(new java.awt.Color(3, 44, 106));
                usernameHeadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            String studentIdQuery = "SELECT SAS.Users.LastName FROM SAS.Session inner join SAS.Users ON SAS.Session.StudentID = SAS.Users.UserID ";

            try(Connection con = DriverManager.getConnection(url,username,password);
                PreparedStatement retrieve = con.prepareStatement(studentIdQuery)) {


                    ResultSet resultSet = retrieve.executeQuery();
                    while(resultSet.next()){
                            usernameHeadLabel.setText(resultSet.getString("LastName"));
                    }


            }catch (SQLException e){
                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);
                    showMessageDialog(this, "Error retrieve data: " + e.getMessage());

            }


                javax.swing.GroupLayout usernameTitlePanelLayout = new javax.swing.GroupLayout(usernameTitlePanel);
                usernameTitlePanel.setLayout(usernameTitlePanelLayout);
                usernameTitlePanelLayout.setHorizontalGroup(
                        usernameTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usernameHeadLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                usernameTitlePanelLayout.setVerticalGroup(
                        usernameTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usernameHeadLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                usernameTitleLabel.setFont(new java.awt.Font("Liberation Sans", 1, 28)); // NOI18N
                usernameTitleLabel.setForeground(new java.awt.Color(3, 44, 106));
                usernameTitleLabel.setText("Student Information Management");

                jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabel1.setText("Class Group :");

                jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "select Group...","A","B","C","D","E" }));
                jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox1ActionPerformed(evt);
                        }
                });

                jButton2.setBackground(new java.awt.Color(51, 153, 0));
                jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
                jButton2.setForeground(new java.awt.Color(255, 255, 255));
                jButton2.setText("Go");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
                jLabel2.setText("Course Name :");

                //jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "", "All Groups" }));

                jComboBox2.addItem("Select course..."); // Default first item

                loadCourses(jComboBox2);

                jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox2ActionPerformed(evt);
                        }
                });

                jButton3.setBackground(new java.awt.Color(51, 153, 0));
                jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
                jButton3.setForeground(new java.awt.Color(255, 255, 255));
                jButton3.setText("UPDATE");
                jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                jButton3.setName(""); // NOI18N
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton4.setBackground(new java.awt.Color(255, 51, 0));
                jButton4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
                jButton4.setForeground(new java.awt.Color(255, 255, 255));
                jButton4.setText("DELETE");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

        firstNameAddTextField.setText("..FirstName..");
        firstNameAddTextField.setToolTipText("");
        firstNameAddTextField.setName("");
                firstNameAddTextField.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                firstNameAddTextFieldFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                firstNameAddTextFieldFocusLost(evt);
                        }
                });
                firstNameAddTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                firstNameAddTextFieldActionPerformed(evt);
                        }
                });

        lastNameAddTextField.setText("..LastName..");
        lastNameAddTextField.setToolTipText("");
        lastNameAddTextField.setName("");

                lastNameAddTextField.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                lastNameAddTextFieldFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                lastNameAddTextFieldFocusLost(evt);
                        }
                });
                lastNameAddTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                lastNameAddTextFieldActionPerformed(evt);
                        }
                });

                idAddTextField.setText("..StudentID..");
                idAddTextField.setToolTipText("");
                idAddTextField.setName("");
                idAddTextField.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                idAddTextFieldFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                idAddTextFieldFocusLost(evt);
                        }
                });
                idAddTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                idAddTextFieldActionPerformed(evt);
                        }
                });

                jButton6.setBackground(new java.awt.Color(51, 153, 0));
                jButton6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
                jButton6.setForeground(new java.awt.Color(255, 255, 255));
                jButton6.setText("ADD STUDENT");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
                        }
                });

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null}
                        },
                        new String [] {
                                "Student ID", "First Name", "Last Name", "Course Name", "Group"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(jTable1);

                //courseAddComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "select course..", "Item 2", "Item 3", "Item 4" }));

                courseAddComboBox.addItem("Select course...");
                loadCourses(courseAddComboBox);

                courseAddComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "select group", "A", "B", "C", "D", "E" }));
                courseAddComboBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                courseAddComboBox1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernameTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(menuSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(197, 197, 197)
                                                                .addComponent(usernameTitleLabel))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(idAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(firstNameAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lastNameAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(courseAddComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(courseAddComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(101, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernameTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(menuSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(usernameTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton2))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(firstNameAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lastNameAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(idAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton6)
                                                        .addComponent(courseAddComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(courseAddComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(62, 62, 62))))))
                );

                fileMenu.setText("File");

                narFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
                narFileMenuItem.setText("New Attendence Record");
                narFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                narFileMenuItemActionPerformed(evt);
                        }
                });
                fileMenu.add(narFileMenuItem);

                saveFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
                saveFileMenuItem.setText("Save ");
                saveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                saveFileMenuItemActionPerformed(evt);
                        }
                });
                fileMenu.add(saveFileMenuItem);

                saveAsFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
                saveAsFileMenuItem.setText("Save as ....");
                fileMenu.add(saveAsFileMenuItem);

                exportFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
                exportFileMenuItem.setText("Export");
                fileMenu.add(exportFileMenuItem);

                exitFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
                exitFileMenuItem.setText("Exit");
                exitFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                exitFileMenuItemActionPerformed(evt);
                        }
                });
                fileMenu.add(exitFileMenuItem);

                jMenuBar3.add(fileMenu);

                editMenu.setText("Edit");

                studentEditMenuItem.setText("Edit student info");
                editMenu.add(studentEditMenuItem);

                courseEditMenuItem.setText("Edit course info");
                editMenu.add(courseEditMenuItem);

                groupEditMenuItem.setText("Edit groups");
                editMenu.add(groupEditMenuItem);

                attendenceEditMenuItem.setText("Edit attendence");
                editMenu.add(attendenceEditMenuItem);

                jMenuBar3.add(editMenu);

                viewMenu.setText("View");

                overViewMenuItem.setText("Attendance Overview");
                viewMenu.add(overViewMenuItem);

                profileViewMenuItem.setText("Student Profiles");
                viewMenu.add(profileViewMenuItem);

                classViewMenuItem.setText("Class Performance");
                viewMenu.add(classViewMenuItem);

                jMenuBar3.add(viewMenu);

                reportMenu.setText("Reports");

                pdfReportMenuItem.setText("Generate PDF attendence");
                reportMenu.add(pdfReportMenuItem);

                customReportsMenuItem.setText("Custom reports");
                reportMenu.add(customReportsMenuItem);

                emailReportMenuItem.setText("Email reports");
                reportMenu.add(emailReportMenuItem);

                jMenuBar3.add(reportMenu);

                toolMenu.setText("Tools");

                importToolMenuItem.setText("import data");
                toolMenu.add(importToolMenuItem);

                backupToolMenuItem.setText("Backup database");
                toolMenu.add(backupToolMenuItem);

                restoreToolMenuItem.setText("Restore database");
                toolMenu.add(restoreToolMenuItem);

                settingToolMenuItem.setText("settings");
                toolMenu.add(settingToolMenuItem);

                jMenuBar3.add(toolMenu);

                helpMenu.setText("Help");

                userHelpMenuItem.setText("user guide");
                helpMenu.add(userHelpMenuItem);

                aboutHelpMenuItem.setText("about");
                aboutHelpMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                aboutHelpMenuItemActionPerformed(evt);
                        }
                });
                helpMenu.add(aboutHelpMenuItem);

                supportHelpMenuItem.setText("Contact support");
                helpMenu.add(supportHelpMenuItem);

                jMenuBar3.add(helpMenu);

                adminMenu.setText("Admin");

                userAdminMenuItem.setText("User Management");
                adminMenu.add(userAdminMenuItem);

                jMenuBar3.add(adminMenu);

                setJMenuBar(jMenuBar3);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
                LoginView loginView =new LoginView();
                clearSession();
                loginView.setVisible(true);
                this.dispose();
    }

        private void exitFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileMenuItemActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_exitFileMenuItemActionPerformed

        private void narFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narFileMenuItemActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_narFileMenuItemActionPerformed

        private void saveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileMenuItemActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_saveFileMenuItemActionPerformed

        private void aboutHelpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutHelpMenuItemActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_aboutHelpMenuItemActionPerformed

        private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jComboBox1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                String courseNameCombo = String.valueOf(jComboBox2.getSelectedItem());
                String groupNameCombo = String.valueOf(jComboBox1.getSelectedItem());
                String studentIdTableQuery;

                if(groupNameCombo.equals("select Group...") && courseNameCombo.equals("Select course...")){
                    studentIdTableQuery = "SELECT SAS.Students.StudentID, SAS.Students.FirstName, SAS.Students.LastName, SAS.Courses.CourseName, SAS.`Groups`.GroupName from SAS.Students INNER JOIN SAS.Enrollments on SAS.Students.StudentID = SAS.Enrollments.StudentID INNER JOIN SAS.Courses ON SAS.Enrollments.CourseCode = SAS.Courses.CourseCode INNER JOIN SAS.`Groups` ON SAS.Courses.CourseCode = SAS.`Groups`.CourseCode";

                    try(Connection con = DriverManager.getConnection(url,username,password);
                        PreparedStatement retrieve = con.prepareStatement(studentIdTableQuery)) {

                        ResultSet resultSet = retrieve.executeQuery();

                        int rows = 0;
                        while(resultSet.next()){
                            int StudentID = resultSet.getInt("StudentID");
                            String firstName = resultSet.getString("FirstName");
                            String lastName = resultSet.getString("LastName");
                            String courseName = resultSet.getString("CourseName");
                            String groupName = resultSet.getString("GroupName");

                            Object[] studentDetails = {StudentID, firstName, lastName, courseName,groupName};

                            studentModelTable = (DefaultTableModel) jTable1.getModel();

                            if(rows < studentModelTable.getRowCount()){
                                for(int col = 0; col < 5; col++){
                                    studentModelTable.setValueAt(studentDetails[col], rows, col);
                                }
                            }else {
                                studentModelTable.addRow(studentDetails);
                            }
                            rows++;


                        }


                    }catch (SQLException e){
                        Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);
                        showMessageDialog(this, "Error retrieve data: " + e.getMessage());

                    }
                } else {
                    studentIdTableQuery = "SELECT SAS.Students.StudentID, SAS.Students.FirstName, SAS.Students.LastName, SAS.Courses.CourseName, SAS.`Groups`.GroupName from SAS.Students INNER JOIN SAS.Enrollments on SAS.Students.StudentID = SAS.Enrollments.StudentID INNER JOIN SAS.Courses ON SAS.Enrollments.CourseCode = SAS.Courses.CourseCode INNER JOIN SAS.`Groups` ON SAS.Courses.CourseCode = SAS.`Groups`.CourseCode where SAS.Courses.CourseName = ? AND SAS.`Groups`.GroupName = ?";
                    try(Connection con = DriverManager.getConnection(url,username,password);
                        PreparedStatement retrieve = con.prepareStatement(studentIdTableQuery)) {
                        retrieve.setString(1, courseNameCombo);
                        retrieve.setString(2, groupNameCombo);

                        ResultSet resultSet = retrieve.executeQuery();

                        int rows = 0;
                        while(resultSet.next()){
                            int StudentID = resultSet.getInt("StudentID");
                            String firstName = resultSet.getString("FirstName");
                            String lastName = resultSet.getString("LastName");
                            String courseName = resultSet.getString("CourseName");
                            String groupName = resultSet.getString("GroupName");

                            Object[] studentDetails = {StudentID, firstName, lastName, courseName,groupName};

                            studentModelTable = (DefaultTableModel) jTable1.getModel();

                            if(rows < studentModelTable.getRowCount()){
                                for(int col = 0; col < 5; col++){
                                    studentModelTable.setValueAt(studentDetails[col], rows, col);
                                }
                            }else {
                                studentModelTable.addRow(studentDetails);
                            }
                            rows++;


                        }


                    }catch (SQLException e){
                        Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);
                        showMessageDialog(this, "Error retrieve data: " + e.getMessage());

                    }

                }



            try(Connection con = DriverManager.getConnection(url,username,password);
                PreparedStatement retrieve = con.prepareStatement(studentIdTableQuery)) {
                retrieve.setString(1, courseNameCombo);
                retrieve.setString(2, groupNameCombo);

                ResultSet resultSet = retrieve.executeQuery();

                int rows = 0;
                while(resultSet.next()){
                    int StudentID = resultSet.getInt("StudentID");
                    String firstName = resultSet.getString("FirstName");
                    String lastName = resultSet.getString("LastName");
                    String courseName = resultSet.getString("CourseName");
                    String groupName = resultSet.getString("GroupName");

                    Object[] studentDetails = {StudentID, firstName, lastName, courseName,groupName};

                    studentModelTable = (DefaultTableModel) jTable1.getModel();

                    if(rows < studentModelTable.getRowCount()){
                            for(int col = 0; col < 5; col++){
                                studentModelTable.setValueAt(studentDetails[col], rows, col);
                            }
                    }else {
                        studentModelTable.addRow(studentDetails);
                    }
                    rows++;


                }


            }catch (SQLException e){
                Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);
                showMessageDialog(this, "Error retrieve data: " + e.getMessage());

            }


        }

        private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jComboBox2ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jButton4ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jButton3ActionPerformed

        private void firstNameAddTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameAddTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_firstNameAddTextFieldActionPerformed

        private void lastNameAddTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameAddTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_lastNameAddTextFieldActionPerformed

        private void idAddTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAddTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_idAddTextFieldActionPerformed

        private void idAddTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idAddTextFieldFocusGained
  	            if(idAddTextField.getText().equals("..StudentID..")){
		           idAddTextField.setText(null);
                  }
        }//GEN-LAST:event_idAddTextFieldFocusGained

        private void idAddTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idAddTextFieldFocusLost
		if(idAddTextField.getText().isEmpty()){
		idAddTextField.setText("..StudentID..");
		}
		
		// TODO add your handling code here:
        }//GEN-LAST:event_idAddTextFieldFocusLost

        private void firstNameAddTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameAddTextFieldFocusGained
            if(firstNameAddTextField.getText().equals("..FirstName..")){
                firstNameAddTextField.setText(null);
            }
    }

        private void firstNameAddTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameAddTextFieldFocusLost
            if(firstNameAddTextField.getText().isEmpty()){
                firstNameAddTextField.setText("..FirstName..");
            }
    }

        private void lastNameAddTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameAddTextFieldFocusGained
                // TODO add your handling code here:
            if(lastNameAddTextField.getText().equals("..LastName..")){
                lastNameAddTextField.setText(null);
            }
        }//GEN-LAST:event_lastNameAddTextFieldFocusGained

        private void lastNameAddTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameAddTextFieldFocusLost
                // TODO add your handling code here:
            if(lastNameAddTextField.getText().isEmpty()){
                lastNameAddTextField.setText("..LastName..");
            }
        }//GEN-LAST:event_lastNameAddTextFieldFocusLost

        private void courseAddComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseAddComboBox1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_courseAddComboBox1ActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jButton6ActionPerformed

        private void dashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLabelMouseClicked
                DashboardView dashboardView = new DashboardView();
                dashboardView.setVisible(true);
                this.dispose();
    }

        private void studentInfoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentInfoLabelMouseClicked

                StudentView studentView = new StudentView();
                studentView.setVisible(true);
                this.dispose();

    }

        private void courseInfoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseInfoLabelMouseClicked

                CourseView courseView = new CourseView();
                courseView.setVisible(true);
                this.dispose();
    }

        private void attendenceInfoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendenceInfoLabelMouseClicked

                AttendenceView attendenceView = new AttendenceView();
                attendenceView.setVisible(true);
                this.dispose();
        }


        private void reportInfoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportInfoLabelMouseClicked
                ReportView reportView = new ReportView();
                reportView.setVisible(true);
                this.dispose();
    }

        private void groupInfoLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groupInfoLabel1MouseClicked
                AdminView adminView =new AdminView();
                adminView.setVisible(true);
                this.dispose();
    }

        public void clearSession() {
                String query12 = "DELETE FROM SAS.Session";

                try (Connection connection = DriverManager.getConnection(this.url, this.username, this.password);
                     PreparedStatement stmt = connection.prepareStatement(query12)) {

                        int ro = stmt.executeUpdate();
                        if(ro>0){
                                System.out.println("session cleared");
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

    private void loadCourses(JComboBox<String> comboBox) {


        String query = "SELECT CourseName FROM SAS.Courses";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Add courses to the combo box
            while (rs.next()) {
                String courseName = rs.getString("CourseName");
                comboBox.addItem(courseName);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading courses: " + e.getMessage());
        }
    }

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {


		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}


		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new StudentView().setVisible(true);
			}
		});
	}

        private javax.swing.JMenuItem aboutHelpMenuItem;
        private javax.swing.JMenu adminMenu;
        private javax.swing.JSeparator attendenceDownSeparator;
        private javax.swing.JMenuItem attendenceEditMenuItem;
        private javax.swing.JLabel attendenceInfoLabel;
        private javax.swing.JMenuItem backupToolMenuItem;
        private javax.swing.JMenuItem classViewMenuItem;
        private javax.swing.JComboBox<String> courseAddComboBox;
        private javax.swing.JComboBox<String> courseAddComboBox1;
        private javax.swing.JSeparator courseDownSeparator;
        private javax.swing.JMenuItem courseEditMenuItem;
        private javax.swing.JLabel courseInfoLabel;
        private javax.swing.JMenuItem customReportsMenuItem;
        private javax.swing.JSeparator dashDownSeparator;
        private javax.swing.JLabel dashboardLabel;
        private javax.swing.JMenu editMenu;
        private javax.swing.JMenuItem emailReportMenuItem;
        private javax.swing.JMenuItem exitFileMenuItem;
        private javax.swing.JMenuItem exportFileMenuItem;
        private javax.swing.JMenu fileMenu;
        private javax.swing.JTextField firstNameAddTextField;
        private javax.swing.JMenuItem groupEditMenuItem;
        private javax.swing.JLabel groupInfoLabel1;
        private javax.swing.JMenu helpMenu;
        private javax.swing.JTextField idAddTextField;
        private javax.swing.JMenuItem importToolMenuItem;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton6;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenu jMenu2;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JMenuBar jMenuBar3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField lastNameAddTextField;
        private javax.swing.JButton logoutButton;
        private javax.swing.JPanel menuSidePanel;
        private javax.swing.JMenuItem narFileMenuItem;
        private javax.swing.JMenuItem overViewMenuItem;
        private javax.swing.JMenuItem pdfReportMenuItem;
        private javax.swing.JMenuItem profileViewMenuItem;
        private javax.swing.JSeparator reportDownSeparator;
        private javax.swing.JSeparator reportDownSeparator1;
        private javax.swing.JLabel reportInfoLabel;
        private javax.swing.JMenu reportMenu;
        private javax.swing.JMenuItem restoreToolMenuItem;
        private javax.swing.JLabel sasTitleLabel;
        private javax.swing.JMenuItem saveAsFileMenuItem;
        private javax.swing.JMenuItem saveFileMenuItem;
        private javax.swing.JMenuItem settingToolMenuItem;
        private javax.swing.JSeparator studentDownSeparator;
        private javax.swing.JMenuItem studentEditMenuItem;
        private javax.swing.JLabel studentInfoLabel;
        private javax.swing.JMenuItem supportHelpMenuItem;
        private javax.swing.JPanel titlePanel;
        private javax.swing.JMenu toolMenu;
        private javax.swing.JMenuItem userAdminMenuItem;
        private javax.swing.JMenuItem userHelpMenuItem;
        private javax.swing.JLabel usernameHeadLabel;
        private javax.swing.JLabel usernameTitleLabel;
        private javax.swing.JPanel usernameTitlePanel;
        private javax.swing.JMenu viewMenu;
        private DefaultTableModel studentModelTable;
}
