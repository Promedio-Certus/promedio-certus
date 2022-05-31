/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
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

    @Test
    public void testMediaAritmentica_001() {
        System.out.println("MediaAritmentica");
        Usuario instance = new Usuario();

        instance.listarNotas("15");
        instance.listarNotas("13");
        instance.listarNotas("14");
        instance.listarNotas("18");
        instance.listarNotas("20");
        instance.MediaAritmentica();

        double ResultadoEsperado = 16.0;
        double result = instance.getPromedio();

        if (instance.getError().length() < 0) {
            System.out.println("Detalle de error: " + instance.getError());
        }

        assertEquals(ResultadoEsperado, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMediaAritmentica_002() {
        System.out.println("MediaAritmentica");
        Usuario instance = new Usuario();

        instance.listarNotas("tres");
        instance.listarNotas("dos");
        instance.listarNotas("dos");
        instance.listarNotas("cero");
        instance.listarNotas("once");
        instance.MediaAritmentica();
        
        boolean errorResultado = false;
        if(instance.getError().length()>0){
            errorResultado = true;
        }
        
        boolean errorEsperado = true ;
        
        if (instance.getError().length() < 0) {
            System.out.println("Detalle de error: " + instance.getError());
        }
        
        assertEquals(errorEsperado, errorResultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMediaAritmentica_003() {
        System.out.println("MediaAritmentica");
        Usuario instance = new Usuario();

        instance.listarNotas("");
        instance.listarNotas("null");
        instance.listarNotas("undefined");
        
        boolean errorResultado = false;
        if(instance.getError().length()>0){
            errorResultado = true;
        }
        
        boolean errorEsperado = true ;
        
        if (instance.getError().length() < 0) {
            System.out.println("Detalle de error: " + instance.getError());
        }
        
        assertEquals(errorEsperado, errorResultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMediaAritmentica_004() {
        System.out.println("MediaAritmentica");
        Usuario instance = new Usuario();

        instance.listarNotas("-20.1");
        instance.listarNotas("1");
        instance.listarNotas("-1");
        instance.listarNotas("20.1");
        instance.MediaAritmentica();

         boolean errorResultado = false;
        if(instance.getError().length()>0){
            errorResultado = true;
        }
        
        boolean errorEsperado = true ;
        
        if (instance.getError().length() < 0) {
            System.out.println("Detalle de error: " + instance.getError());
        }
        
        assertEquals(errorEsperado, errorResultado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
