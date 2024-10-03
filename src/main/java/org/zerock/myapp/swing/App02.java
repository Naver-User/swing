package org.zerock.myapp.swing;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;


@Log4j2
public class App02 extends JFrame {


    public App02() {
        log.trace("Default Constructor Invoked.");

        setTitle("App02 - " + Thread.currentThread().getName());
        setSize(500, 300);

        // -----------------
        setJMenuBar(new JMenuBar());

        // -----------------
        JButton jButton = new JButton("Confirm");

        jButton.addActionListener(e -> {
            log.trace("actionPerformed({}) invoked.", e);

//            System.exit(0);
            setVisible(false);
            dispose();
        }); // .addActionListener

        getContentPane().add(jButton, BorderLayout.SOUTH);

        // -----------------
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                log.trace("windowClosing({}) invoked.", e);

//                System.exit(0);
                setVisible(false);
                dispose();
            } // windowClosing
        }); // addWindowListener
    } // Default Constructor

    public static void main(String... args) {
        log.trace("main({}) invoked.", Arrays.toString(args));

        // Append runnable task into jobQ with "SwingUtilities.invokeLater" method.
        SwingUtilities.invokeLater(() -> {
            log.trace("run() invoked.");

            App02 app = new App02();
            app.setVisible(true);
        }); // .invokeLater
    } // main

} // App02
