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
public class VehiculoTest {
    
    public VehiculoTest() {
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
     * Test of getMatricula method, of class Vehiculo.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.getMatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getFecha method, of class Vehiculo.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMinutos method, of class Vehiculo.
     */
    @Test
    public void testGetMinutos() {
        System.out.println("getMinutos");
        Vehiculo instance = null;
        long expResult = 0L;
        long result = instance.getMinutos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMatricula method, of class Vehiculo.
     */
    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        String matricula = "";
        Vehiculo instance = null;
        instance.setMatricula(matricula);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of isAbono method, of class Vehiculo.
     */
    @Test
    public void testIsAbono() {
        System.out.println("isAbono");
        Vehiculo instance = null;
        boolean expResult = false;
        boolean result = instance.isAbono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of siono method, of class Vehiculo.
     */
    @Test
    public void testSiono() {
        System.out.println("siono");
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.siono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setAbono method, of class Vehiculo.
     */
    @Test
    public void testSetAbono() {
        System.out.println("setAbono");
        boolean abono = false;
        Vehiculo instance = null;
        instance.setAbono(abono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularImporte method, of class Vehiculo.
     */
    @Test
    public void testCalcularImporte() {
        System.out.println("calcularImporte");
        double min = 0.0;
        Vehiculo instance = null;
        double expResult = 0.0;
        double result = instance.calcularImporte(min);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of anchoOruedas method, of class Vehiculo.
     */
    @Test
    public void testAnchoOruedas() {
        System.out.println("anchoOruedas");
        Vehiculo instance = null;
        double expResult = 0.0;
        double result = instance.anchoOruedas();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of alto method, of class Vehiculo.
     */
    @Test
    public void testAlto() {
        System.out.println("alto");
        Vehiculo instance = null;
        double expResult = 0.0;
        double result = instance.alto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getIdentificador method, of class Vehiculo.
     */
    @Test
    public void testGetIdentificador() {
        System.out.println("getIdentificador");
        Vehiculo instance = null;
        int expResult = 0;
        int result = instance.getIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of toString method, of class Vehiculo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vehiculo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    public class VehiculoImpl extends Vehiculo {

        public VehiculoImpl() {
            super("", false);
        }

        public double calcularImporte(double min) {
            return 0.0;
        }

        public double anchoOruedas() {
            return 0.0;
        }

        public double alto() {
            return 0.0;
        }
    }
    
}
