package org.zerock.myapp.swing;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;


@Log4j2
public class App07 extends JFrame {


    App07() {
        log.trace("Default constructor invoked.");

        setSize(400, 300);
        setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        setTitle("App07");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        int leftTopX = centerPoint.x - getWidth()/2;
        int leftTopY = centerPoint.y - getHeight()/2;
        log.info("\t+ Width({}), Height({}), centerPoint({})", getWidth(), getHeight(), centerPoint);

//        setLocation(centerPoint);
        setLocation(leftTopX, leftTopY);
    } // Default Constructor

    public static void main(String... args) {
        log.trace("main({}) invoked.", Arrays.toString(args));

        SwingUtilities.invokeLater(() -> {
            App07 app = new App07();
            app.setVisible(true);
        }); // invokeLater
    } // main

} // end class
