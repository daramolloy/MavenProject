package com.mycompany.mavenproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daram
 */
public class JUnitTest {

    @Test
    public void TestingUsername() {
        Student Dara = new Student("DaraMolloy", "30/12/1996", 14500023);
        assertEquals("DaraMolloy20",Dara.getUsername());
    }
}
