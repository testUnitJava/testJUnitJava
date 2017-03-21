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
public class AparcamientoTest {
    
    public AparcamientoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Coches c = new  Coches(null, true, 100, 200);
        c.getAlto();
        if(c.getAlto()>0)
            System.out.println("Bien");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getContador method, of class Aparcamiento.
     */
    @Test
    public void testGetContador() {
        System.out.println("getContador");
        Aparcamiento instance = new Aparcamiento(136);
     
        int result = instance.getContador();
        assertNotNull( result);
 
    }

    /**
     * Test of getCapacidad method, of class Aparcamiento.
     */
    @Test
    public void testGetCapacidad() {
        System.out.println("getCapacidad");
        Aparcamiento instance = new Aparcamiento(100);
        int expResult = 100;
        int result = instance.getCapacidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCapacidad method, of class Aparcamiento.
     */
    @Test
    public void testSetCapacidad() {
        System.out.println("setCapacidad");
        int capacidad = 0;
        Aparcamiento instance = new Aparcamiento(2000);
        instance.setCapacidad(20);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of introducirVehiculo method, of class Aparcamiento.
     */
    @Test
    public void testIntroducirVehiculo() {
        System.out.println("introducirVehiculo");
        Coches c = new Coches("X85452", true, 100, 200);
        Aparcamiento instance = new Aparcamiento(200);
        instance.introducirVehiculo(c);
       
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of sacarVehículo method, of class Aparcamiento.
     */
    @Test
    public void testSacarVehículo() {
        System.out.println("sacarVeh\u00edculo");
        String matricula = "";
        Aparcamiento instance = new Aparcamiento(1000);
        String result = instance.sacarVehículo(matricula);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
