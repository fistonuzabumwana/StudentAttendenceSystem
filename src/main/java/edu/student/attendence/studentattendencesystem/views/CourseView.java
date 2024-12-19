/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.student.attendence.studentattendencesystem.views;

import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author fiston
 */
public class CourseView extends javax.swing.JFrame {
        private final String url = "jdbc:mysql://localhost/SAS";
        private final String username = "root";
        private final String password = "";

	/**
	 * Creates new form DashboardView
	 */
	public CourseView() {
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
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                courseTableModel = new DefaultTableModel();
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
                groupDownSeparator = new javax.swing.JSeparator();
                groupInfoLabel = new javax.swing.JLabel();
                usernameTitlePanel = new javax.swing.JPanel();
                usernameHeadLabel = new javax.swing.JLabel();
                usernameTitleLabel = new javax.swing.JLabel();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
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
                                .addContainerGap(271, Short.MAX_VALUE)
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

                groupInfoLabel.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
                groupInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
                groupInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                groupInfoLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/administrator-2-24.png")); // NOI18N
                groupInfoLabel.setText("Admin");
                groupInfoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                groupInfoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                groupInfoLabelMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout menuSidePanelLayout = new javax.swing.GroupLayout(menuSidePanel);
                menuSidePanel.setLayout(menuSidePanelLayout);
                menuSidePanelLayout.setHorizontalGroup(
                        menuSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dashDownSeparator)
                        .addComponent(attendenceInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(courseInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(attendenceDownSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(menuSidePanelLayout.createSequentialGroup()
                                .addGroup(menuSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dashboardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(courseDownSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(menuSidePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(menuSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(studentDownSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(reportDownSeparator)
                                                        .addComponent(groupDownSeparator)
                                                        .addComponent(reportInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                                        .addGroup(menuSidePanelLayout.createSequentialGroup()
                                                .addComponent(groupInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
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
                                .addGap(3, 3, 3)
                                .addComponent(attendenceInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(groupDownSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reportInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(attendenceDownSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(groupInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(reportDownSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                usernameTitleLabel.setText("Registered Course Information");

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

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "No", "Course Code", "Course Name", "Group(s)", "A", "B", "C", "D", "E"
                        }

                ) {
                        Class[] types = new Class [] {
                                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }
                });

               String  courseTableQuery = "SELECT SAS.Students.StudentID, SAS.Students.FirstName, SAS.Students.LastName, SAS.Courses.CourseName, SAS.`Groups`.GroupName from SAS.Students INNER JOIN SAS.Enrollments on SAS.Students.StudentID = SAS.Enrollments.StudentID INNER JOIN SAS.Courses ON SAS.Enrollments.CourseCode = SAS.Courses.CourseCode INNER JOIN SAS.`Groups` ON SAS.Courses.CourseCode = SAS.`Groups`.CourseCode";

        try(Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement retrieve = con.prepareStatement(courseTableQuery)) {

            ResultSet resultSet = retrieve.executeQuery();

            int rows = 0;
            while(resultSet.next()){
                int StudentID = resultSet.getInt("StudentID");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                String courseName = resultSet.getString("CourseName");
                String groupName = resultSet.getString("GroupName");

                Object[] studentDetails = {StudentID, firstName, lastName, courseName,groupName};

                courseTableModel = (DefaultTableModel) jTable1.getModel();

                if(rows < courseTableModel.getRowCount()){
                    for(int col = 0; col < 5; col++){
                        courseTableModel.setValueAt(studentDetails[col], rows, col);
                    }
                }else {
                    courseTableModel.addRow(studentDetails);
                }
                rows++;


            }


        }catch (SQLException e){
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);
            showMessageDialog(this, "Error retrieve data: " + e.getMessage());

        }
                jScrollPane1.setViewportView(jTable1);
                if (jTable1.getColumnModel().getColumnCount() > 0) {
                        jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
                        jTable1.getColumnModel().getColumn(3).setPreferredWidth(2);
                        jTable1.getColumnModel().getColumn(4).setPreferredWidth(1);
                        jTable1.getColumnModel().getColumn(5).setPreferredWidth(1);
                        jTable1.getColumnModel().getColumn(6).setPreferredWidth(1);
                        jTable1.getColumnModel().getColumn(7).setPreferredWidth(1);
                        jTable1.getColumnModel().getColumn(8).setPreferredWidth(1);
                }

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernameTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(menuSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(203, 203, 203)
                                                                .addComponent(usernameTitleLabel)))
                                                .addGap(7, 7, 7))))
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
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(406, 406, 406))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jButton4ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jButton3ActionPerformed

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
        private void groupInfoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groupInfoLabelMouseClicked
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
			java.util.logging.Logger.getLogger(CourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CourseView().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JMenuItem aboutHelpMenuItem;
        private javax.swing.JMenu adminMenu;
        private javax.swing.JSeparator attendenceDownSeparator;
        private javax.swing.JMenuItem attendenceEditMenuItem;
        private javax.swing.JLabel attendenceInfoLabel;
        private javax.swing.JMenuItem backupToolMenuItem;
        private javax.swing.JMenuItem classViewMenuItem;
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
        private javax.swing.JSeparator groupDownSeparator;
        private javax.swing.JMenuItem groupEditMenuItem;
        private javax.swing.JLabel groupInfoLabel;
        private javax.swing.JMenu helpMenu;
        private javax.swing.JMenuItem importToolMenuItem;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenu jMenu2;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JMenuBar jMenuBar3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JButton logoutButton;
        private javax.swing.JPanel menuSidePanel;
        private javax.swing.JMenuItem narFileMenuItem;
        private javax.swing.JMenuItem overViewMenuItem;
        private javax.swing.JMenuItem pdfReportMenuItem;
        private javax.swing.JMenuItem profileViewMenuItem;
        private javax.swing.JSeparator reportDownSeparator;
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
        private DefaultTableModel courseTableModel;
        // End of variables declaration//GEN-END:variables
}
