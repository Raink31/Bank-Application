package org.karmelcafe.bankingapp.guis;

import javax.swing.*;
import java.awt.*;

public class RegisterGui extends BaseFrame {

    public RegisterGui() {
        super("Banking App Register");
    }
    @Override
    protected void addGuiComponents() {
        // Create banking app label
        JLabel bankingAppLabel = new JLabel("Banking App Register");
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


        // Confirm Password Label
        JLabel confirmPasswordLabel = new JLabel("Confirm it :");
        confirmPasswordLabel.setBounds(20, 240, super.getWidth() - 30, 24);
        confirmPasswordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(confirmPasswordLabel);


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


        // Password field
        JPasswordField confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(140, 238, super.getWidth() - 200, 30);
        confirmPasswordField.setFont(new Font("Dialog", Font.PLAIN, 24));
        add(confirmPasswordField);


        // Register Button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(150, 300, super.getWidth() - 320, 30);
        registerButton.setFont(new Font("Dialog", Font.BOLD, 14));
        registerButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(registerButton);


        // Login Label
        JLabel loginLabel = new JLabel("<html><a href=\"#\">Have an account ? Sign-in here !</a></html>");
        loginLabel.setBounds(40, 340, super.getWidth() - 100, 30);
        loginLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(loginLabel);
    }
}
