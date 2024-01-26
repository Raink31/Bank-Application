package org.karmelcafe.bankingapp.guis;

import org.karmelcafe.bankingapp.db_objs.User;

import javax.swing.*;
import java.awt.*;

// Performs banking functions : depositing, withdrawing, seeing past transactions
public class BankingAppGui extends BaseFrame{
    private JTextField currentBalanceField;
    public JTextField getCurrentBalanceField() {return currentBalanceField;}

    public BankingAppGui(User user) {
        super("Banking App", user);
    }
    @Override
    protected void addGuiComponents() {
        // Create welcome message
        String welcomeMessage = "<html>" +
                "<body style='text-align:center'>" +
                "<b>Hello " + user.getUsername() + "</b><br />" +
                "What would you like to do today?</body></html>";
        JLabel welcomeMessageLabel = new JLabel(welcomeMessage);
        welcomeMessageLabel.setBounds(0, 30, getWidth() - 10, 40);
        welcomeMessageLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
        welcomeMessageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(welcomeMessageLabel);

        // Create current balance label
        JLabel currentBalanceLabel = new JLabel("Current Balance");
        currentBalanceLabel.setBounds(0, 80, getWidth() - 10, 30);
        currentBalanceLabel.setFont(new Font("Dialog", Font.BOLD, 22));
        currentBalanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(currentBalanceLabel);

        // Create current balance field
        currentBalanceField = new JTextField("€" + user.getCurrentBalance());
        currentBalanceField.setBounds(15, 120, getWidth() - 50, 40);
        currentBalanceField.setFont(new Font("Dialog", Font.BOLD, 28));
        currentBalanceField.setHorizontalAlignment(SwingConstants.RIGHT);
        currentBalanceField.setEditable(false);
        add(currentBalanceField);

        // Create deposit button
        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(15, 180, getWidth() - 50, 50);
        depositButton.setFont(new Font("Dialog", Font.BOLD, 22));
        add(depositButton);

        // Create withdraw button
        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(15, 250, getWidth() - 50, 50);
        withdrawButton.setFont(new Font("Dialog", Font.BOLD, 22));
        add(withdrawButton);

        // Create past transaction button
        JButton pastTransactionButton = new JButton("Past Transaction");
        pastTransactionButton.setBounds(15, 320, getWidth() - 50, 50);
        pastTransactionButton.setFont(new Font("Dialog", Font.BOLD, 22));
        add(pastTransactionButton);

        // Create transfer button
        JButton transferButton = new JButton("Transfer");
        transferButton.setBounds(15, 390, getWidth() - 50, 50);
        transferButton.setFont(new Font("Dialog", Font.BOLD, 22));
        add(transferButton);

        // Create log out button
        JButton logoutButton = new JButton("Log out");
        logoutButton.setBounds(15, 500, getWidth() - 50, 50);
        logoutButton.setFont(new Font("Dialog", Font.BOLD, 22));
        add(logoutButton);
    }
}
