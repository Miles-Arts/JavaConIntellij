package com.example.javaestudio.prueba;

public class OtroUsuario {

    public static void main(String[] args) {

        PruebaOtro persona2 = new PruebaOtro();
        persona2.nombre = "Luisa Jimenez";
        persona2.ciudad = "Tunja";
        persona2.profesion = "Estudiante de sistemas";
        persona2.edad = 22;
        persona2.amigaDeMilton = true;

        persona2.imprimirPersona();

        if (persona2.amigaDeMilton == true  ) {
            System.out.println("Puedes verse, salir a comer helado");
        } else {
            System.out.println("Lo siente no puedes verlo");
        }

    }
}
