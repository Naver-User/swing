package org.zerock.myapp;

import lombok.extern.log4j.Log4j2;
import java.util.Arrays;


/**
 * Hello world!
 *
 */
@Log4j2
public class App {

    public static void main( String[] args ) {
        log.trace("main({}) invoked.", Arrays.toString(args));

        log.info( "Hello World!" );
    } // main

} // end class