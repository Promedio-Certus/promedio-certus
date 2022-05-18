/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import java.awt.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author canow
 */
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = new Usuario();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidoPaterno method, of class Usuario.
     */
    @Test
    public void testGetApellidoPaterno() {
        System.out.println("getApellidoPaterno");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getApellidoPaterno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidoPaterno method, of class Usuario.
     */
    @Test
    public void testSetApellidoPaterno() {
        System.out.println("setApellidoPaterno");
        String apellidoPaterno = "";
        Usuario instance = new Usuario();
        instance.setApellidoPaterno(apellidoPaterno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class Usuario.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDni method, of class Usuario.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        int dni = 0;
        Usuario instance = new Usuario();
        instance.setDni(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Usuario.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Usuario.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Usuario instance = new Usuario();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContraseña method, of class Usuario.
     */
    @Test
    public void testGetContraseña() {
        System.out.println("getContrase\u00f1a");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getContraseña();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContraseña method, of class Usuario.
     */
    @Test
    public void testSetContraseña() {
        System.out.println("setContrase\u00f1a");
        String contraseña = "";
        Usuario instance = new Usuario();
        instance.setContraseña(contraseña);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPeriodo method, of class Usuario.
     */
    @Test
    public void testGetIdPeriodo() {
        System.out.println("getIdPeriodo");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getIdPeriodo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPeriodo method, of class Usuario.
     */
    @Test
    public void testSetIdPeriodo() {
        System.out.println("setIdPeriodo");
        int idPeriodo = 0;
        Usuario instance = new Usuario();
        instance.setIdPeriodo(idPeriodo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCurso method, of class Usuario.
     */
    @Test
    public void testGetIdCurso() {
        System.out.println("getIdCurso");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getIdCurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCurso method, of class Usuario.
     */
    @Test
    public void testSetIdCurso() {
        System.out.println("setIdCurso");
        int idCurso = 0;
        Usuario instance = new Usuario();
        instance.setIdCurso(idCurso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCarrera method, of class Usuario.
     */
    @Test
    public void testGetIdCarrera() {
        System.out.println("getIdCarrera");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getIdCarrera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCarrera method, of class Usuario.
     */
    @Test
    public void testSetIdCarrera() {
        System.out.println("setIdCarrera");
        int idCarrera = 0;
        Usuario instance = new Usuario();
        instance.setIdCarrera(idCarrera);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MediaAritmentica method, of class Usuario.
     */
    @Test
    public void testMediaAritmentica() {
        System.out.println("MediaAritmentica");
        List nota = null;
        Usuario instance = new Usuario();
        double expResult = 0.0;
        double result = instance.MediaAritmentica(nota);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
    
}
