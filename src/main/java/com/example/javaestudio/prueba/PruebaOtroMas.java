package com.example.javaestudio.prueba;

public class PruebaOtroMas {

    public static void main(String[] args) {

        PruebaOtro persona1 = new PruebaOtro();
        persona1.nombre = "Violeta España";
        persona1.ciudad = "Paipa";
        persona1.profesion = "Ingeniera de vías";
        persona1.edad = 26;
        persona1.amigaDeMilton = true;
        persona1.mesa = 7.0;
        persona1.hora = 11;
        persona1.dia = 4;

        persona1.imprimirPersona();

        if (persona1.amigaDeMilton == true  ) {
            System.out.println("Puedes verse, salir a comer helado");
        } else if (persona1.amigaDeMilton == false  ) {
            System.out.println("Lo siente no puedes verlo");
        }

        //bucle o lops

        for( int i = 9;  i < persona1.hora; i++ ) {
            System.out.println("Hora de la cita: " + i + "am");
        }

        if ( persona1.mesa == 7.0 ) {
            System.out.println("tu mesa ya está reservada");
        } else if ( persona1.mesa == 30 ) {
            System.out.println("Lo sentimos llegaste tarde");
        }

        // while loop

        while ( persona1.dia < 5 ) {
            System.out.println("El " + persona1.dia  + " es Martes, buen día para vernos " );
            persona1.dia++;
        }

        //Excepciones
        /**
         * Hola
         */

        int x = 0;
        int z = 5;

        try {
            System.out.println(z/x);
        } catch (Exception exception) {
            System.out.println("Usuario es imposible dividir en 0");
        }



    }

}
