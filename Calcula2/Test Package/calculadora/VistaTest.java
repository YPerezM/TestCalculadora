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
public class VistaTest extends TestCase {
    
    public VistaTest(String testName) {
        super(testName);
    }

    /**
     * Test of introducir method, of class Vista.
     */
    public void testIntroducir() {
        System.out.println("introducir");
        Modelo mo = null;
        Vista.introducir(mo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class Vista.
     */
    public void testImprimir() {
        System.out.println("imprimir");
        Modelo mo = null;
        Vista.imprimir(mo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
