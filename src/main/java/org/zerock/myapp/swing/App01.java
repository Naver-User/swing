package org.zerock.myapp.swing;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;


@Log4j2
public class App01 extends JFrame {


    public App01() {
        log.trace("Default Constructor invoked.");

        setTitle("App01");
        setSize(400, 400);

        // -----------------
        getContentPane().add(new JButton("OK"), BorderLayout.SOUTH);

        // -----------------
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                log.trace("windowClosing({}) invoked.", e);

                System.exit(0);
            } // windowClosing

        }); // addWindowListener

    } // Default Constructor

    public static void main(String... args) {
        log.trace("main({}) invoked.", Arrays.toString(args));

        App01 app = new App01();
        app.setVisible(true);
    } // main

} // Swing
