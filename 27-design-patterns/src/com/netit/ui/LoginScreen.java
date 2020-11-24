package com.netit.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginScreen extends JFrame {

    public LoginScreen() {
        show();
        setSize(300, 300);

        new BoxLayout(this, BoxLayout.Y_AXIS);
        JButton jButton = new JButton("Press me!");

        jButton.addActionListener(e -> {
            if(e.equals(ActionEvent.ACTION_PERFORMED)) {
                new JDialog(LoginScreen.this, "ALerttt!").show();
            }
        });

//        jButton.addChangeListener(e -> {
//            new JDialog(LoginScreen.this, "ALerttt!").show();
//        });

        add(jButton);
    }
}
