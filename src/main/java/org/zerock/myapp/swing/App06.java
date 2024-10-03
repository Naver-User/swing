package org.zerock.myapp.swing;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;


@Log4j2
public class App06 extends JFrame {

    App06() {
        log.trace("Default constructor invoked.");

        setTitle("App06");
        setSize(300, 300);

        // -----------------
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());

        // -----------------
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        setLocation(centerPoint.x - getWidth()/2, centerPoint.y - getHeight()/2);

        // -----------------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // Default Constructor

    public static void main(String... args) {
        log.trace("main({}) invoked.", Arrays.toString(args));

        SwingUtilities.invokeLater(() -> {
            App06 app = new App06();
            app.setVisible(true);
        }); // .invokeLater
    } // main

} // end class
