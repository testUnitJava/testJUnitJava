/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class CochesTest {
    
    public CochesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAncho method, of class Coches.
     */
    @Test
    public void testGetAncho() {
        System.out.println("getAncho");
        Coches instance = new Coches("CLDJ'", true, 10,20);
        double expResult = 0.0;
        double result = instance.getAncho();
 
    }

    
    
    

    /**
     * Test of setAlto method, of class Coches.
     */
   

    /**
     * Test of calcularImporte method, of class Coches.
     */
    @Test
    public void testCalcularImporte() {
        System.out.println("calcularImporte");
        double min = 0.0;
         Coches instance = new Coches("CLDJ'", true, 10,20);
        double expResult = 0.0;
        double result = instance.calcularImporte(10);
      
    }

    /**
     * Test of anchoOruedas method, of class Coches.
     */
   

    /**
     * Test of alto method, of class Coches.
     */


 
}
