package org.zerock.myapp.swing;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;


@Log4j2
public class App03 extends JWindow {


    public App03() {
        log.trace("Default constructor invoked.");

        // -----------------
        setSize(450, 450);

        // -----------------
//        setLocation(500, 300);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        setLocation(centerPoint.x - getWidth()/2, centerPoint.y - getHeight()/2);

        // -----------------
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                log.trace("mouseClicked({}) invoked.", e);
                setVisible(false); dispose();
            } // mouseClicked
        }); // .addMouseListener
    } // Default Constructor

    public static void main(String... args) {
        log.trace("main({}) invoked.", Arrays.toString(args));

        App03 app = new App03();
        app.setVisible(true);
    } // main

} // end class
