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
public class VerListasCochesTest {
    
    public VerListasCochesTest() {
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
     * Test of iniciarTabla method, of class VerListasCoches.
     */
    @Test
    public void testIniciarTabla() {
        System.out.println("iniciarTabla");
        VerListasCoches instance = new VerListasCoches();
        instance.iniciarTabla();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of crearFactura method, of class VerListasCoches.
     */
    @Test
    public void testCrearFactura() {
        System.out.println("crearFactura");
        Vehiculo v = null;
        VerListasCoches instance = new VerListasCoches();
        instance.crearFactura(v);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class VerListasCoches.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VerListasCoches.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
