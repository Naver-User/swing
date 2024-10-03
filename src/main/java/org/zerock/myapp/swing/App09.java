package org.zerock.myapp.swing;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.util.Arrays;


@Log4j2
public class App09 extends JFrame {

    App09() {
        log.trace("Default constructor invoked.");

        setTitle("App09");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // The components which acquires JScrollPane:
        // JLabel, JTextArea, JList, JTable, JList, JTree

//        JScrollPane scrollPane = new JScrollPane(jLabel);
//        JScrollPane scrollPane = new JScrollPane(jTextArea);
//        JScrollPane scrollPane = new JScrollPane(jList);
//        JScrollPane scrollPane = new JScrollPane(jTable);
//        JScrollPane scrollPane = new JScrollPane(jTree);
    } // default constructor

    public static void main(String... args) {
        log.trace("main({}) invoked.", Arrays.toString(args));

        SwingUtilities.invokeLater(() -> {
            App09 app = new App09();
            app.setVisible(true);
        }); // .invokeLater
    } // main

} // end class
