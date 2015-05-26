/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import junit.framework.TestCase;

/**
 *
 * @author yperezmartinez
 */
public class ModeloTest extends TestCase {
    
    public ModeloTest(String testName) {
        super(testName);
    }

    /**
     * Test of getNum1 method, of class Modelo.
     */
    public void testGetNum1() {
        System.out.println("getNum1");
        Modelo instance = new Modelo();
        float expResult = 0.0F;
        float result = instance.getNum1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum1 method, of class Modelo.
     */
    public void testSetNum1() {
        System.out.println("setNum1");
        float num1 = 0.0F;
        Modelo instance = new Modelo();
        instance.setNum1(num1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum2 method, of class Modelo.
     */
    public void testGetNum2() {
        System.out.println("getNum2");
        Modelo instance = new Modelo();
        float expResult = 0.0F;
        float result = instance.getNum2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum2 method, of class Modelo.
     */
    public void testSetNum2() {
        System.out.println("setNum2");
        float num2 = 0.0F;
        Modelo instance = new Modelo();
        instance.setNum2(num2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class Modelo.
     */
    public void testGetResultado() {
        System.out.println("getResultado");
        Modelo instance = new Modelo();
        float expResult = 0.0F;
        float result = instance.getResultado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResultado method, of class Modelo.
     */
    public void testSetResultado() {
        System.out.println("setResultado");
        float resultado = 0.0F;
        Modelo instance = new Modelo();
        instance.setResultado(resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperacion method, of class Modelo.
     */
    public void testGetOperacion() {
        System.out.println("getOperacion");
        Modelo instance = new Modelo();
        String expResult = "";
        String result = instance.getOperacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperacion method, of class Modelo.
     */
    public void testSetOperacion() {
        System.out.println("setOperacion");
        String operacion = "";
        Modelo instance = new Modelo();
        instance.setOperacion(operacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Modelo.
     */
    public void testToString() {
        System.out.println("toString");
        Modelo instance = new Modelo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
