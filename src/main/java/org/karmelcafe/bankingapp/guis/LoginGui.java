package org.karmelcafe.bankingapp.guis;

import javax.swing.*;
import java.awt.*;

// Allow user to log in or launch the register gui
public class LoginGui extends BaseFrame {
    public LoginGui() {
        super("Banking App Login");
    }
    @Override
    protected void addGuiComponents() {
        // Create banking app label
        JLabel bankingAppLabel = new JLabel("Banking Application Login");

        // Set the location and the size of the GUI component
        bankingAppLabel.setBounds(-7, 16, super.getWidth(), 40);

        // Change the font style
        bankingAppLabel.setFont(new Font("Dialog", Font.BOLD, 30));

        // Center the text in JLabel
        bankingAppLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add to GUI
        add(bankingAppLabel);


        // Username Label
        JLabel usernameLabel = new JLabel("Username :");
        usernameLabel.setBounds(20, 120, super.getWidth() - 30, 24);
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(usernameLabel);


        // Password Label
        JLabel passwordLabel = new JLabel("Password :");
        passwordLabel.setBounds(20, 180, super.getWidth() - 30, 24);
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(passwordLabel);


        // Username field
        JTextField usernameField = new JTextField();
        usernameField.setBounds(140, 118, super.getWidth() - 200, 30);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(usernameField);


        // Password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(140, 178, super.getWidth() - 200, 30);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(passwordField);


        // Login Button
        JButton loginButton = new JButton("Log In");
        loginButton.setBounds(150, 240, super.getWidth() - 320, 30);
        loginButton.setFont(new Font("Dialog", Font.BOLD, 14));
        loginButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(loginButton);


        // Register Label
        JLabel registerLabel = new JLabel("<html><a href=\"#\">Don't have an account ? Register here !</a></html>");
        registerLabel.setBounds(40, 280, super.getWidth() - 100, 30);
        registerLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(registerLabel);

    }
}
