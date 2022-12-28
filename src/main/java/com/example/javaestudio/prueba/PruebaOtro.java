package com.example.javaestudio.prueba;

public class PruebaOtro {


        String nombre;
        String ciudad;
        String profesion;
        boolean amigaDeMilton;
        int edad;

    void imprimirPersona() {

        System.out.println(nombre);
        System.out.println(ciudad);
        System.out.println(profesion);
        System.out.println(edad);
    }

    public static void main(String[] args) {

        PruebaOtro persona = new PruebaOtro();

        persona.nombre = "Milton Figueredo";
        persona.ciudad = "Tuta";
        persona.profesion = "Programador en Java";
        persona.edad = 38;

        persona.imprimirPersona();
        //System.out.println(persona.nombre);
    }


}
