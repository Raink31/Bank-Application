package org.karmelcafe.bankingapp.guis;

import org.karmelcafe.bankingapp.db_objs.User;

import javax.swing.*;

public abstract class BaseFrame extends JFrame {
    // Store user information
    protected User user;

    public BaseFrame(String title){
        initialize(title);
    }
    public BaseFrame(String title, User user) {
        // Initialize user
        this.user = user;

        initialize(title);
    }

    private void initialize(String title) {
        // Instantiate JFrame properties and add title to the bar
        setTitle(title);

        // Set size in pixels
        setSize(420, 600);

        // Shutdown program when the gui is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Layout to null to manually specify size and positions
        setLayout(null);

        // No resizing
        setResizable(false);

        // Launch GUI in the center of the screen
        setLocationRelativeTo(null);

        // Call on the subclass's addGuiComponent
        addGuiComponents();
    }

    // This method needs to be defined by subclasses when it is being inherited from
    protected abstract void addGuiComponents();

}
