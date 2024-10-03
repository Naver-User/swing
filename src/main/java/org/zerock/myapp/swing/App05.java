package org.zerock.myapp.swing;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;


@Log4j2
public class App05 extends JFrame {

    public App05() {
       log.trace("Default constructor invoked.");

        // -----------------
        Image iconImage = new ImageIcon(getClass().getResource("/icon.png")).getImage();
        setIconImage(iconImage);

        // -----------------
        setTitle("App05");
        setSize(600, 400);

        // -----------------
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        setLocation(centerPoint.x - getWidth()/2, centerPoint.y - getHeight()/2);

        // -----------------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
//        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    } // Default Constructor

    public static void main(String[] args) {
        log.trace("main({}) invoked.", Arrays.toString(args));

        // -----------------
        SwingUtilities.invokeLater(() -> {
            App05 app = new App05();
            app.setVisible(true);
        }); // .invokeLater
    } // main

} // end class
