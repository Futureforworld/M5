/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zamor
 */
public class MovimentoIT {
    
    public MovimentoIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Movimento.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Movimento instance = new Movimento();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Movimento.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Movimento instance = new Movimento();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Movimento.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Movimento instance = new Movimento();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Movimento.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        Movimento instance = new Movimento();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Movimento.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Movimento instance = new Movimento();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Movimento.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Movimento instance = new Movimento();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPessoa method, of class Movimento.
     */
    @Test
    public void testGetIdPessoa() {
        System.out.println("getIdPessoa");
        Movimento instance = new Movimento();
        int expResult = 0;
        int result = instance.getIdPessoa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPessoa method, of class Movimento.
     */
    @Test
    public void testSetIdPessoa() {
        System.out.println("setIdPessoa");
        int idPessoa = 0;
        Movimento instance = new Movimento();
        instance.setIdPessoa(idPessoa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProduto method, of class Movimento.
     */
    @Test
    public void testGetIdProduto() {
        System.out.println("getIdProduto");
        Movimento instance = new Movimento();
        int expResult = 0;
        int result = instance.getIdProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdProduto method, of class Movimento.
     */
    @Test
    public void testSetIdProduto() {
        System.out.println("setIdProduto");
        int idProduto = 0;
        Movimento instance = new Movimento();
        instance.setIdProduto(idProduto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Movimento.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Movimento instance = new Movimento();
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Movimento.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int quantidade = 0;
        Movimento instance = new Movimento();
        instance.setQuantidade(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorUnitario method, of class Movimento.
     */
    @Test
    public void testGetValorUnitario() {
        System.out.println("getValorUnitario");
        Movimento instance = new Movimento();
        double expResult = 0.0;
        double result = instance.getValorUnitario();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorUnitario method, of class Movimento.
     */
    @Test
    public void testSetValorUnitario() {
        System.out.println("setValorUnitario");
        double valorUnitario = 0.0;
        Movimento instance = new Movimento();
        instance.setValorUnitario(valorUnitario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Movimento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Movimento instance = new Movimento();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
