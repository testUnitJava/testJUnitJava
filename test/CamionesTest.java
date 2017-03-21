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
public class CamionesTest {
    
    public CamionesTest() {
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
     * Test of getRuedas method, of class Camiones.
     */
    @Test
    public void testGetRuedas() {
        System.out.println("getRuedas");
         Camiones instance = new Camiones("C088IJ", true, 10);
        int expResult = 0;
        int result = instance.getRuedas();
       
    }

    /**
     * Test of setRuedas method, of class Camiones.
     */
    @Test
    public void testSetRuedas() {
        System.out.println("setRuedas");
        int ruedas = 3;
        Camiones instance = new Camiones("C088IJ", true, 10);
        instance.setRuedas(ruedas);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of calcularImporte method, of class Camiones.
     */
    @Test
    public void testCalcularImporte() {
        System.out.println("calcularImporte");
        double min = 10.1;
        Camiones instance = new Camiones("C088IJ", true, 10);
        double expResult = 0.0;
        double result = instance.calcularImporte(min);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of anchoOruedas method, of class Camiones.
     */
    @Test
    public void testAnchoOruedas() {
        System.out.println("anchoOruedas");
        Camiones instance = new Camiones("C088IJ", true, 10);
        double expResult = 0.0;
        double result = instance.anchoOruedas();
       
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of alto method, of class Camiones.
     */
    @Test
    public void testAlto() {
        System.out.println("alto");
         Camiones instance = new Camiones("C088IJ", true, 10);
        double expResult = 0.0;
        double result = instance.alto();
       
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getIdentificador method, of class Camiones.
     */
    @Test
    public void testGetIdentificador() {
        System.out.println("getIdentificador");
        Camiones instance = new Camiones("C088IJ", true, 10);
        int expResult = 0;
        int result = instance.getIdentificador();
        
        
    }

    /**
     * Test of toString method, of class Camiones.
     */
  
}
