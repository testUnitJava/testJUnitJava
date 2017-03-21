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
public class LlenarDatosCamionTest {
    
    public LlenarDatosCamionTest() {
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
     * Test of comprobarNumeroEntero method, of class LlenarDatosCamion.
     */
    @Test
    public void testComprobarNumeroEntero() {
        System.out.println("comprobarNumeroEntero");
        String valordado = "";
        LlenarDatosCamion instance = new LlenarDatosCamion();
        Aparcamiento a = new Aparcamiento(200);
        instance.guardarBaseDatos(a);
        
        
    }

    /**
     * Test of main method, of class LlenarDatosCamion.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LlenarDatosCamion.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
