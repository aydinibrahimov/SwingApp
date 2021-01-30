package com.company.resume.main;

import com.company.entity.User;
import com.company.dao.inter.UserDaoInter;
import com.company.main.Context;
import static com.company.resume.main.Config.loggedInUser;

public class UserMain extends javax.swing.JFrame {

    private UserDaoInter userDao = Context.instanceUserDao();

    // User loggedInUser = Config.loggedInUser;
    public UserMain() {
        Config.loggedInUser = userDao.getById(6);
        initComponents();
        fillUserComponents();
        profilePane1.fillUserComponents();
        detailsPanel1.fillUserComponents();
        panelSkills.fillUserComponents();

    }

    public void fillUserComponents() {

        txtName.setText(loggedInUser.getName());
        txtSurname.setText(loggedInUser.getSurname());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUserInfo = new javax.swing.JPanel();
        labelname = new javax.swing.JLabel();
        labelsurname = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        profilePane1 = new com.company.resume.panel.ProfilePane();
        detailsPanel1 = new com.company.resume.panel.DetailsPanel();
        panelSkills = new com.company.resume.panel.SkillsPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelname.setText("Name");

        labelsurname.setText("Surname");

        txtName.setBackground(new java.awt.Color(204, 255, 255));

        txtSurname.setBackground(new java.awt.Color(204, 255, 255));
        txtSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurnameActionPerformed(evt);
            }
        });

        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUserInfoLayout = new javax.swing.GroupLayout(panelUserInfo);
        panelUserInfo.setLayout(panelUserInfoLayout);
        panelUserInfoLayout.setHorizontalGroup(
            panelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserInfoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelname)
                    .addComponent(labelsurname))
                .addGap(35, 35, 35)
                .addGroup(panelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelUserInfoLayout.setVerticalGroup(
            panelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserInfoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelname)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelsurname)
                    .addGroup(panelUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Profile", profilePane1);
        jTabbedPane2.addTab("Details", detailsPanel1);
        jTabbedPane2.addTab("Skills", panelSkills);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(548, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(panelUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String name = txtName.getText();
        String surname = txtSurname.getText();
        User user = loggedInUser;
        user.setName(name);
        user.setSurname(surname);
        profilePane1.fillUser(user);
        detailsPanel1.fillUser(user);

        userDao.updateUser(user);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurnameActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new UserMain().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private com.company.resume.panel.DetailsPanel detailsPanel1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelsurname;
    private com.company.resume.panel.SkillsPanel panelSkills;
    private javax.swing.JPanel panelUserInfo;
    private com.company.resume.panel.ProfilePane profilePane1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
