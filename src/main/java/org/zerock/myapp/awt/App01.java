package org.zerock.myapp.awt;

import lombok.extern.log4j.Log4j2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;


@Log4j2
public class App01 extends Frame {


    public App01() {
        setTitle("App01");
        setSize(400, 400);

        // -----------------
        add(new Button("NORTH"), BorderLayout.NORTH);
        add(new Button("SOUTH"), BorderLayout.SOUTH);
        add(new Button("EAST"), BorderLayout.EAST);
        add(new Button("WEST"), BorderLayout.WEST);
        add(new Button("CENTER"), BorderLayout.CENTER);

        // -----------------
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                log.trace("windowClosing({}) invoked.", e);

                System.exit(0);
            } // windowClosing

        }); // addWindowListener
    } // default constructor

    public static void main(String[] args) {
        log.trace("main({}) invoked.", Arrays.toString(args));

        App01 app = new App01();
        app.setVisible(true);
    } // main

} // end class
