package com.example.javaestudio.prueba;

public class PruebaOtroMas {

    public static void main(String[] args) {

        PruebaOtro persona1 = new PruebaOtro();
        persona1.nombre = "Violeta España";
        persona1.ciudad = "Paipa";
        persona1.profesion = "Ingeniera de vías";
        persona1.edad = 26;
        persona1.amigaDeMilton = true;

        persona1.imprimirPersona();

        if (persona1.amigaDeMilton == true  ) {
            System.out.println("Puedes verse, salir a comer helado");
        } else if (persona1.amigaDeMilton == false  ) {
            System.out.println("Lo siente no puedes verlo");
        }

    }

}
