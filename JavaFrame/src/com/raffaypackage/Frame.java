package com.raffaypackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Frame extends JFrame implements ActionListener {
    private JLabel text;
    private JPanel panel;
    private int count= 0 ;


    public Frame(){
        super("Title");
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        panel.setLayout(new GridLayout(0,1));

        JButton button = new JButton(new AbstractAction("Click me!!") {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                text.setText("No of clicks : "+ count );
            }
        });
        JButton resetButton = new JButton(new AbstractAction("Reset Count") {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = 0;
                text.setText("No of clicks : "+ count);
            }
            });


        text = new JLabel("No of Clicks : " + count);

        panel.add(button);
        panel.add(resetButton);
        panel.add(text);


        this.add(panel, BorderLayout.CENTER);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        text.setText("No of Clicks : "+ count);
    }
}
