/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.exercicijunit_alejandro_lopez;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alexl
 */
public class UserValidatorTest {

    public UserValidatorTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of validaDNI method, of class UserValidator.
     */
    @org.junit.jupiter.api.Test
    public void testValidaDNI1() {
        System.out.println("validaDNI - Cas 1");
        String dni = "48719239H";
        UserValidator instance = new UserValidator();
        boolean expResult = true;
        boolean result = instance.validaDNI(dni);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValidaDNI2() {
        System.out.println("validaDNI - Cas 2");
        String dni = "6745J ";
        UserValidator instance = new UserValidator();
        boolean expResult = false;
        boolean result = instance.validaDNI(dni);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValidaDNI3() {
        System.out.println("validaDNI - Cas 3");
        String dni = "48719239GT ";
        UserValidator instance = new UserValidator();
        boolean expResult = false;
        boolean result = instance.validaDNI(dni);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValidaDNI4() {
        System.out.println("validaDNI - Cas 4");
        String dni = "";
        UserValidator instance = new UserValidator();
        boolean expResult = false;
        boolean result = instance.validaDNI(dni);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValidaDNI5() {
        System.out.println("validaDNI - Cas 5");
        String dni = "45327856 ";
        UserValidator instance = new UserValidator();
        boolean expResult = false;
        boolean result = instance.validaDNI(dni);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValidaDNI6() {
        System.out.println("validaDNI - Cas 6");
        String dni = "573+/G ";
        UserValidator instance = new UserValidator();
        boolean expResult = false;
        boolean result = instance.validaDNI(dni);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaNIA method, of class UserValidator.
     */
    @org.junit.jupiter.api.Test
    public void testValidaNIA1() {
        System.out.println("validaNIA - Cas 1");
        String nia = "4871923";
        UserValidator instance = new UserValidator();
        boolean expResult = true;
        boolean result = instance.validaNIA(nia);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValidaNIA2() {
        System.out.println("validaNIA - Cas 2");
        String nia = "6745";
        UserValidator instance = new UserValidator();
        boolean expResult = false;
        boolean result = instance.validaNIA(nia);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValidaNIA3() {
        System.out.println("validaNIA - Cas 3");
        String nia = "";
        UserValidator instance = new UserValidator();
        boolean expResult = false;
        boolean result = instance.validaNIA(nia);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValidaNIA4() {
        System.out.println("validaNIA - Cas 4");
        String nia = "58917/5";
        UserValidator instance = new UserValidator();
        boolean expResult = false;
        boolean result = instance.validaNIA(nia);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaUsuario method, of class UserValidator.
     */
    public boolean mockValidaDNIT(String DNI) {
        return true;
    }

    public boolean mockValidaNIAT(String NIA) {
        return true;
    }

    public boolean mockValidaDNIF(String DNI) {
        return false;
    }

    public boolean mockValidaNIAF(String NIA) {
        return false;
    }

    @org.junit.jupiter.api.Test
    public void testValidaUsuario1() {
        System.out.println("validaUsuario - Cas 1");
        String dni = "";
        String nia = "";
        String password = "12345678";
        UserValidator instance = new UserValidator() {
            @Override
            public boolean validaDNI(String dni) {
                return mockValidaDNIT(dni);
            }

            @Override
            public boolean validaNIA(String nia) {
                return mockValidaNIAT(nia);
            }
        };
        boolean expResult = true;
        boolean result = instance.validaUsuario(dni, nia, password);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValidaUsuario2() {
        System.out.println("validaUsuario - Cas 2");
        String dni = "";
        String nia = "";
        String password = "12345678";
        UserValidator instance = new UserValidator() {
            @Override
            public boolean validaDNI(String dni) {
                return mockValidaDNIF(dni);
            }

            @Override
            public boolean validaNIA(String nia) {
                return mockValidaNIAT(nia);
            }
        };
        boolean expResult = false;
        boolean result = instance.validaUsuario(dni, nia, password);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValidaUsuario3() {
        System.out.println("validaUsuario - Cas 3");
        String dni = "";
        String nia = "";
        String password = "12345678";
        UserValidator instance = new UserValidator() {
            @Override
            public boolean validaDNI(String dni) {
                return mockValidaDNIT(dni);
            }

            @Override
            public boolean validaNIA(String nia) {
                return mockValidaNIAF(nia);
            }
        };
        boolean expResult = false;
        boolean result = instance.validaUsuario(dni, nia, password);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testValidaUsuario4() {
        System.out.println("validaUsuario - Cas 4");
        String dni = "";
        String nia = "";
        String password = "1234";
        UserValidator instance = new UserValidator() {
            @Override
            public boolean validaDNI(String dni) {
                return mockValidaDNIT(dni);
            }

            @Override
            public boolean validaNIA(String nia) {
                return mockValidaNIAT(nia);
            }
        };
        boolean expResult = false;
        boolean result = instance.validaUsuario(dni, nia, password);
        assertEquals(expResult, result);
    }

}
