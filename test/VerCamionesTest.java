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
public class VerCamionesTest {
    
    public VerCamionesTest() {
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
     * Test of crearFactura method, of class VerCamiones.
     */
    @Test
    public void testCrearFactura() {
        System.out.println("crearFactura");
        Vehiculo v = null;
        VerCamiones instance = new VerCamiones();
        instance.crearFactura(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class VerCamiones.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VerCamiones.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
