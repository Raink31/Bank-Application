package org.karmelcafe.bankingapp.guis;

import javax.swing.*;

public abstract class BaseFrame extends JFrame {

    public BaseFrame(String title){
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

    // THis method needs to be defined by subclasses when it is being inherited from
    protected abstract void addGuiComponents();

}
