/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba4;

import static laba4.Laba4.f;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author 1710502
 */
public class NewEmptyJUnitTest {
    private Random rnd = new Random();
    private int n;
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n = rnd.nextInt((10 - 1) + 1) + 1;               
    }
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testFib1() {
        int fn = Laba4.f(n);		
        System.out.println(n + " - " + fn);
    }
    @Test
    public void testFib2() {
        int fn = Laba4.f(n);		
        System.out.println(n + " - " + fn);
    }
}
