package org.zerock.myapp;

import lombok.extern.log4j.Log4j2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
@Log4j2
public class AppTest {


    @Before
    public void before() {
        log.trace("before() invoked.");

    } // before

    @After
    public void after() {
        log.trace("after() invoked.");

    } // after

    @Test(timeout = 1000 * 1)
    public void contextLoads() {
        log.trace("contextLoads() invoked.");

    } // contextLoads

} // AppTest
