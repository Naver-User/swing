package org.zerock.myapp.swing;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Objects;


@Log4j2
public class App04 extends JWindow {


    public App04() {
        log.trace("Default constructor invoked.");

        // -----------------
        Icon icon = new ImageIcon(this.getClass().getResource("/game.png"));
        setSize(icon.getIconWidth(), icon.getIconHeight());
        log.info("\t+ icon: width({}), height({})", icon.getIconWidth(), icon.getIconHeight());

        // -----------------
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        setLocation(centerPoint.x - getWidth()/2, centerPoint.y - getHeight()/2);

        // -----------------
        JLabel label = new JLabel();
        label.setIcon(icon);  // .setIcon

        getContentPane().add(label, BorderLayout.CENTER);

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

        SwingUtilities.invokeLater(() -> {
            log.trace("run() invoked.");

            App04 app = new App04();
            app.setVisible(true);
        }); // .invokeLater
    } // main

} // end class
