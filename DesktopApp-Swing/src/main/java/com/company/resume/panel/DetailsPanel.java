/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.resume.panel;

import com.company.dao.inter.CountryDaoInter;
import com.company.entity.Country;
import com.company.entity.User;
import com.company.main.Context;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import com.company.resume.main.Config;

/**
 *
 * @author hp
 */
public class DetailsPanel extends javax.swing.JPanel {

    private CountryDaoInter countryDao = Context.instanceCountryDao();

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public void fillUserComponents() {
        fillWindow();
        User loggedInUser = Config.loggedInUser;
         

        phoneTxt.setText(loggedInUser.getPhone());
        
        Date dt = loggedInUser.getBirthDate();
        String dtSt = sdf.format(dt);
        birthdateTxt.setText(dtSt);


        emailTxt.setText(loggedInUser.getEmail());

        birthplaceCB.setSelectedItem(loggedInUser.getBirthPlace());
        
    }

    public void fillUser(User user) {

        try {
            String birthDate = birthdateTxt.getText();
            String phone = phoneTxt.getText();
            String email = emailTxt.getText();
            java.util.Date dtUtil = sdf.parse(birthDate);
            long l = dtUtil.getTime();
            java.sql.Date db = new java.sql.Date(l);
            
            user.setBirthDate(db);
            user.setEmail(email);
            user.setPhone(phone);
            user.setBirthPlace((Country) birthplaceCB.getSelectedItem());

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public DetailsPanel() {
        initComponents();

    }

    private void fillWindow() {
        List<Country> countries = countryDao.getAll();
        for (Country c : countries) {
            birthplaceCB.addItem(c);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adresLbl = new javax.swing.JLabel();
        phoneLbl = new javax.swing.JLabel();
        birthplaceLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        nationalityLbl = new javax.swing.JLabel();
        birthdateLbl = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        birthdateTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        birthplaceCB = new javax.swing.JComboBox<>();
        nationalityCB = new javax.swing.JComboBox<>();

        adresLbl.setBackground(new java.awt.Color(153, 204, 255));
        adresLbl.setText("Adress");

        phoneLbl.setText("Phone");

        birthplaceLbl.setText("Birthplace");

        emailLbl.setText("Email");

        nationalityLbl.setText("Nationality");

        birthdateLbl.setText("Birthdate");

        jTextField1.setText("jTextField1");
        jTextField1.setBorder(new javax.swing.border.MatteBorder(null));

        emailTxt.setText("jTextField1");

        birthdateTxt.setText("jTextField1");

        nationalityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azerbaijani", "American" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nationalityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(nationalityCB, 0, 97, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthplaceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(birthdateTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthplaceCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(439, 452, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adresLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(phoneTxt)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(emailTxt)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthdateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(birthdateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthplaceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(birthplaceCB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationalityCB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresLbl;
    private javax.swing.JLabel birthdateLbl;
    private javax.swing.JTextField birthdateTxt;
    private javax.swing.JComboBox<Country> birthplaceCB;
    private javax.swing.JLabel birthplaceLbl;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> nationalityCB;
    private javax.swing.JLabel nationalityLbl;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTxt;
    // End of variables declaration//GEN-END:variables
}
