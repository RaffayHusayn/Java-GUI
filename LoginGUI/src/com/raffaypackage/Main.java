package com.raffaypackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    public static void main(String[] args) {

        //frame
        JFrame frame = new JFrame();
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        //JLabel
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(50,20,80,25);
        panel.add(userLabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(30,60,120,25);
        panel.add(passLabel);
        JTextField passText = new JPasswordField(20);
        passText.setBounds(100,60,165,25);
        panel.add(passText);
        JLabel message = new JLabel("");
        message.setBounds(10,150,300,25);
        panel.add(message);

        //JButton
        JButton login = new JButton(new AbstractAction("Login") {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(userText.getText().equals("raffay")&& passText.getText().equals("123123")){
                   message.setText("Logged In");
               }
               else{
                   message.setText("Incorrect credentials");
               }
            }
        });
        login.setBounds(180,100,80,25);

        panel.add(login);

        frame.setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
