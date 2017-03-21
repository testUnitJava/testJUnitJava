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
public class LlenarDatosCocheTest {
    
    public LlenarDatosCocheTest() {
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
     * Test of comprobarNumero method, of class LlenarDatosCoche.
     */
    @Test
    public void testComprobarNumero() {
        System.out.println("comprobarNumero");
        String valordado = "";
        LlenarDatosCoche instance = new LlenarDatosCoche();
        boolean expResult = false;
        boolean result = instance.comprobarNumero(valordado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class LlenarDatosCoche.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LlenarDatosCoche.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
