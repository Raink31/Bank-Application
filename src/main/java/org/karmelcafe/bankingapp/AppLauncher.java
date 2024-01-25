package org.karmelcafe.bankingapp;

import org.karmelcafe.bankingapp.guis.LoginGui;
import org.karmelcafe.bankingapp.guis.RegisterGui;

import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        // Use invokeLater to make updates to the GUI more thread safe
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                new LoginGui().setVisible(true);
                new RegisterGui().setVisible(true);
            }
        });
    }
}
