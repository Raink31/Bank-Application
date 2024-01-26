package org.karmelcafe.bankingapp;

import org.karmelcafe.bankingapp.db_objs.User;
import org.karmelcafe.bankingapp.guis.BankingAppGui;
import org.karmelcafe.bankingapp.guis.LoginGui;
import org.karmelcafe.bankingapp.guis.RegisterGui;

import javax.swing.*;
import java.math.BigDecimal;

public class AppLauncher {
    public static void main(String[] args) {
        // Use invokeLater to make updates to the GUI more thread safe
        SwingUtilities.invokeLater(() -> {
//                new LoginGui().setVisible(true);
//                new RegisterGui().setVisible(true);
            new BankingAppGui(
                    new User(1, "username", "password", new BigDecimal("20.00"))
            ).setVisible(true);
        });
    }
}
