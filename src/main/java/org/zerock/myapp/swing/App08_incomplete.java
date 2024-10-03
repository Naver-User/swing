package org.zerock.myapp.swing;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.util.Arrays;


@Log4j2
public class App08_incomplete extends JFrame {


    App08_incomplete() {
        log.trace("Default constructor invoked.");

        setTitle("App08");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setTabPlacement(
            JTabbedPane.TOP
//            JTabbedPane.BOTTOM
//            JTabbedPane.LEFT
//            JTabbedPane.RIGHT
        );

        getContentPane().add("Center", tabbedPane);
        tabbedPane.addTab("TabName1", null);
        tabbedPane.addTab("TabName2", null);

    } // Default Constructor

    public static void main(String... args) {
        log.trace("main({}) invoked.", Arrays.toString(args));

        SwingUtilities.invokeLater(() -> {
            App08_incomplete app = new App08_incomplete();
            app.setVisible(true);
        });
    } // main

} // end class
