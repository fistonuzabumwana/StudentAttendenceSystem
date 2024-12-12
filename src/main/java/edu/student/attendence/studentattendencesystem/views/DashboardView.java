
package edu.student.attendence.studentattendencesystem.views;


import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Runtime;



import static javax.swing.JOptionPane.showMessageDialog;

public class DashboardView extends javax.swing.JFrame {
        private final String url = "jdbc:mysql://localhost/SAS";
        private final String username = "root";
        private final String password = "";


	public DashboardView() {
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
                jMenu1 = new JMenu();
                jMenu2 = new JMenu();
                jPanel1 = new javax.swing.JPanel();
                titlePanel = new javax.swing.JPanel();
                logoutButton = new javax.swing.JButton();
                sasTitleLabel = new JLabel();
                menuSidePanel = new javax.swing.JPanel();
                dashboardLabel = new JLabel();
                dashDownSeparator = new javax.swing.JSeparator();
                courseInfoLabel = new JLabel();
                courseDownSeparator = new javax.swing.JSeparator();
                attendenceInfoLabel = new JLabel();
                attendenceDownSeparator = new javax.swing.JSeparator();
                reportDownSeparator = new javax.swing.JSeparator();
                reportInfoLabel = new JLabel();
                studentDownSeparator = new javax.swing.JSeparator();
                studentInfoLabel = new JLabel();
                groupInfoLabel1 = new JLabel();
                reportDownSeparator1 = new javax.swing.JSeparator();
                usernameTitlePanel = new javax.swing.JPanel();
                usernameHeadLabel = new JLabel();
                logoPanel = new javax.swing.JPanel();
                logoIconLabel = new JLabel();
                studentDataIconLabel = new JLabel();
                studentDataLabel = new JLabel();
                attendenceDataIconLabel = new JLabel();
                attendenceDataLabel = new JLabel();
                classDataIconLabel = new JLabel();
                classDataLabel = new JLabel();
                usernameTitleLabel = new JLabel();
                courseDataLabel = new JLabel();
                courseDataIconLabel = new JLabel();
                dayDataLabel = new JLabel();
                dayDataIconLabel = new JLabel();
                jMenuBar3 = new javax.swing.JMenuBar();
                fileMenu = new JMenu();
                narFileMenuItem = new JMenuItem();
                saveFileMenuItem = new JMenuItem();
                saveAsFileMenuItem = new JMenuItem();
                exportFileMenuItem = new JMenuItem();
                exitFileMenuItem = new JMenuItem();
                editMenu = new JMenu();
                studentEditMenuItem = new JMenuItem();
                courseEditMenuItem = new JMenuItem();
                groupEditMenuItem = new JMenuItem();
                attendenceEditMenuItem = new JMenuItem();
                viewMenu = new JMenu();
                overViewMenuItem = new JMenuItem();
                profileViewMenuItem = new JMenuItem();
                classViewMenuItem = new JMenuItem();
                reportMenu = new JMenu();
                pdfReportMenuItem = new JMenuItem();
                customReportsMenuItem = new JMenuItem();
                emailReportMenuItem = new JMenuItem();
                toolMenu = new JMenu();
                importToolMenuItem = new JMenuItem();
                backupToolMenuItem = new JMenuItem();
                restoreToolMenuItem = new JMenuItem();
                settingToolMenuItem = new JMenuItem();
                helpMenu = new JMenu();
                userHelpMenuItem = new JMenuItem();
                aboutHelpMenuItem = new JMenuItem();
                supportHelpMenuItem = new JMenuItem();
                adminMenu = new JMenu();
                userAdminMenuItem = new JMenuItem();

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
                        .addComponent(studentInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                        .addGroup(menuSidePanelLayout.createSequentialGroup()
                                .addGroup(menuSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dashboardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(courseDownSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(menuSidePanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(studentDownSeparator))
                                        .addComponent(attendenceInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(menuSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(reportInfoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(menuSidePanelLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(reportDownSeparator))
                                                .addComponent(reportDownSeparator1)
                                                .addGroup(menuSidePanelLayout.createSequentialGroup()
                                                        .addComponent(groupInfoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                        .addComponent(attendenceDownSeparator, javax.swing.GroupLayout.Alignment.TRAILING))
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
                        .addComponent(usernameHeadLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                );
                usernameTitlePanelLayout.setVerticalGroup(
                        usernameTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usernameHeadLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                logoPanel.setBackground(new java.awt.Color(255, 255, 255));
                logoPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

                logoIconLabel.setBackground(new java.awt.Color(255, 255, 255));
                logoIconLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Desktop/AUCA/Java Programming/Final project/StudentAttendenceSystem/src/main/resources/cropped-AUCA-logo-wide-webblue-2-1-1.png")); // NOI18N

                javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
                logoPanel.setLayout(logoPanelLayout);
                logoPanelLayout.setHorizontalGroup(
                        logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(logoPanelLayout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(logoIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                logoPanelLayout.setVerticalGroup(
                        logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(logoPanelLayout.createSequentialGroup()
                                .addComponent(logoIconLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                studentDataIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                studentDataIconLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/conference-128.png")); // NOI18N
                studentDataIconLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

                studentDataLabel.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
                studentDataLabel.setForeground(new java.awt.Color(3, 44, 106));
                studentDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);


            String studentQuery = "SELECT * FROM SAS.Students";

            try(Connection con = DriverManager.getConnection(url,username,password);
                PreparedStatement retrieve = con.prepareStatement(studentQuery)) {


                    ResultSet resultSet = retrieve.executeQuery();
                        int rows = 0;
                    while(resultSet.next()){
                            rows++;
                    }
                    studentDataLabel.setText(rows+" Student");

            }catch (SQLException e){
                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);
                    showMessageDialog(this, "Error retrieve data: " + e.getMessage());

            }

            studentDataLabel.setAlignmentY(0.0F);

            attendenceDataIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            attendenceDataIconLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/statistics-128.png")); // NOI18N
            attendenceDataIconLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

            attendenceDataLabel.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
            attendenceDataLabel.setForeground(new java.awt.Color(3, 44, 106));
            attendenceDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            String attendenceQuery = "SELECT * FROM SAS.Attendance where Status = 1";

            try(Connection con = DriverManager.getConnection(url,username,password);
                PreparedStatement retrieve = con.prepareStatement(attendenceQuery)) {

                    String attendenceQuery1 = "SELECT * FROM SAS.Attendance";
                    PreparedStatement retrieve1 = con.prepareStatement(attendenceQuery1);


                    ResultSet resultSetPresent = retrieve.executeQuery();
                    ResultSet resultSetWhole = retrieve1.executeQuery();
                    int rows = 0, rows2 = 0;
                    while(resultSetPresent.next()){
                            rows++;
                    }
                    while (resultSetWhole.next()){
                            rows2++;
                    }
                    //double percentage = (rows/rows2) * 100;

                    attendenceDataLabel.setText(rows+"% Attendence");

            }catch (SQLException e){
                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);
                    showMessageDialog(this, "Error retrieve data: " + e.getMessage());

            }

                attendenceDataLabel.setAlignmentY(0.0F);

                classDataIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                classDataIconLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/classroom-128.png")); // NOI18N
                classDataIconLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

                classDataLabel.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
                classDataLabel.setForeground(new java.awt.Color(3, 44, 106));
                classDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            String classQuery = "SELECT * FROM SAS.Enrollments";

            try(Connection con = DriverManager.getConnection(url,username,password);
                PreparedStatement retrieve = con.prepareStatement(classQuery)) {


                    ResultSet resultSet = retrieve.executeQuery();
                    int rows = 0;
                    while(resultSet.next()){
                            rows++;
                    }
                    classDataLabel.setText(rows+" Class(s)");

            }catch (SQLException e){
                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);
                    showMessageDialog(this, "Error retrieve data: " + e.getMessage());

            }

                classDataLabel.setAlignmentY(0.0F);

                usernameTitleLabel.setFont(new java.awt.Font("Liberation Sans", 1, 28)); // NOI18N
                usernameTitleLabel.setForeground(new java.awt.Color(3, 44, 106));


        String studentIdQuery2 = "SELECT SAS.Users.LastName FROM SAS.Session inner join SAS.Users ON SAS.Session.StudentID = SAS.Users.UserID ";

        try(Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement retrieve = con.prepareStatement(studentIdQuery2)) {


            ResultSet resultSet = retrieve.executeQuery();
            while(resultSet.next()){
                usernameTitleLabel.setText("Welcome, "+resultSet.getString("LastName"));
            }


        }catch (SQLException e){
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);
            showMessageDialog(this, "Error retrieve data: " + e.getMessage());

        }



                courseDataLabel.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
                courseDataLabel.setForeground(new java.awt.Color(3, 44, 106));
                courseDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            String courseQuery = "SELECT * FROM SAS.Courses";

            try(Connection con = DriverManager.getConnection(url,username,password);
                PreparedStatement retrieve = con.prepareStatement(courseQuery)) {


                    ResultSet resultSet = retrieve.executeQuery();
                    int rows = 0;
                    while(resultSet.next()){
                            rows++;
                    }
                    courseDataLabel.setText(rows+" Course");

            }catch (SQLException e){
                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, e);
                    showMessageDialog(this, "Error retrieve data: " + e.getMessage());

            }
                courseDataLabel.setAlignmentY(0.0F);

                courseDataIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                courseDataIconLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/literature-128.png")); // NOI18N
                courseDataIconLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

                dayDataLabel.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
                dayDataLabel.setForeground(new java.awt.Color(3, 44, 106));
                dayDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                dayDataLabel.setText("0/15 Day(s)");
                dayDataLabel.setAlignmentY(0.0F);

                dayDataIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                dayDataIconLabel.setIcon(new javax.swing.ImageIcon("/home/fiston/Documents/today-128.png")); // NOI18N
                dayDataIconLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(menuSidePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(studentDataIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(studentDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(attendenceDataIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(attendenceDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(144, 144, 144)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(classDataIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(classDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(107, 107, 107))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(96, 96, 96)
                                                                .addComponent(usernameTitleLabel)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(213, 213, 213)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(courseDataIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(courseDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(133, 133, 133)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dayDataIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dayDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernameTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47)
                                                .addComponent(usernameTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(attendenceDataIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(attendenceDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(studentDataIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(studentDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(classDataIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(classDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(courseDataIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dayDataIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(courseDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dayDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30))
                                        .addComponent(menuSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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



    public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}


		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DashboardView().setVisible(true);
			}
		});

	}

        private JMenuItem aboutHelpMenuItem;
        private JMenu adminMenu;
        private JLabel attendenceDataIconLabel;
        private JLabel attendenceDataLabel;
        private javax.swing.JSeparator attendenceDownSeparator;
        private JMenuItem attendenceEditMenuItem;
        private JLabel attendenceInfoLabel;
        private JMenuItem backupToolMenuItem;
        private JLabel classDataIconLabel;
        private JLabel classDataLabel;
        private JMenuItem classViewMenuItem;
        private JLabel courseDataIconLabel;
        private JLabel courseDataLabel;
        private javax.swing.JSeparator courseDownSeparator;
        private JMenuItem courseEditMenuItem;
        private JLabel courseInfoLabel;
        private JMenuItem customReportsMenuItem;
        private javax.swing.JSeparator dashDownSeparator;
        private JLabel dashboardLabel;
        private JLabel dayDataIconLabel;
        private JLabel dayDataLabel;
        private JMenu editMenu;
        private JMenuItem emailReportMenuItem;
        private JMenuItem exitFileMenuItem;
        private JMenuItem exportFileMenuItem;
        private JMenu fileMenu;
        private JMenuItem groupEditMenuItem;
        private JLabel groupInfoLabel1;
        private JMenu helpMenu;
        private JMenuItem importToolMenuItem;
        private JMenu jMenu1;
        private JMenu jMenu2;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JMenuBar jMenuBar3;
        private javax.swing.JPanel jPanel1;
        private JLabel logoIconLabel;
        private javax.swing.JPanel logoPanel;
        private javax.swing.JButton logoutButton;
        private javax.swing.JPanel menuSidePanel;
        private JMenuItem narFileMenuItem;
        private JMenuItem overViewMenuItem;
        private JMenuItem pdfReportMenuItem;
        private JMenuItem profileViewMenuItem;
        private javax.swing.JSeparator reportDownSeparator;
        private javax.swing.JSeparator reportDownSeparator1;
        private JLabel reportInfoLabel;
        private JMenu reportMenu;
        private JMenuItem restoreToolMenuItem;
        private JLabel sasTitleLabel;
        private JMenuItem saveAsFileMenuItem;
        private JMenuItem saveFileMenuItem;
        private JMenuItem settingToolMenuItem;
        private JLabel studentDataIconLabel;
        private JLabel studentDataLabel;
        private javax.swing.JSeparator studentDownSeparator;
        private JMenuItem studentEditMenuItem;
        private JLabel studentInfoLabel;
        private JMenuItem supportHelpMenuItem;
        private javax.swing.JPanel titlePanel;
        private JMenu toolMenu;
        private JMenuItem userAdminMenuItem;
        private JMenuItem userHelpMenuItem;
        private JLabel usernameHeadLabel;
        private JLabel usernameTitleLabel;
        private javax.swing.JPanel usernameTitlePanel;
        private JMenu viewMenu;
}
