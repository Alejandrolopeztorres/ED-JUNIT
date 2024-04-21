package com.mycompany.exercicijunit_alejandro_lopez;

import java.util.regex.Pattern;

public class UserValidator {

    /**
     * Método para validar un número de DNI español.
     *
     * @param dni Número de DNI a validar.
     * @return true si el DNI es válido, false si no lo es.
     */
    public boolean validaDNI(String dni) {
// Validación simple: un DNI español debe tener 8 dígitos y una letra.
        return Pattern.matches("\\d{8}[A-Za-z]", dni);
    }

    /**
     * Método para validar un número de NIA (Número de Identificación del
     * Alumno).
     *
     * @param nia Número de NIA a validar.
     * @return true si el NIA es válido, false si no lo es.
     */
    public boolean validaNIA(String nia) {
// Validación simple: un NIA debe tener 7 dígitos.
        return Pattern.matches("\\d{7}", nia);
    }



    /**
     * Método para validar un usuario con DNI, NIA y contraseña.
     *
     * @param dni Número de DNI a validar.
     * @param nia Número de NIA a validar.
     * @param password Contraseña a validar.
     * @return true si el usuario es válido, false si no lo es.
     */
    public boolean validaUsuario(String dni, String nia, String password) {
// Validación simple: el DNI y el NIA deben ser válidos, y la contraseña debe tener al menos 8 caracteres.
        return validaDNI(dni) && validaNIA(nia) && password.length() >= 8;
    }
}
