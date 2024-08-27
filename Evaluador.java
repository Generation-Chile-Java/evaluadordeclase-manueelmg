package C27082024;

import java.util.Scanner;

public class Evaluador {

        public static void main(String[] args) {
            Scanner notas = new Scanner(System.in);
            System.out.print("Ingrese la primera nota: ");
            int nota1 = notas.nextInt();

            System.out.print("Ingrese la segunda nota: ");
            int nota2 = notas.nextInt();

            System.out.print("Ingrese la tercera nota: ");
            int nota3 = notas.nextInt();

            double promedio = (nota1 + nota2 + nota3) / 3.0;
            System.out.println("Promedio: " + promedio);
            if (promedio < 0 || promedio > 10) {
                System.out.println("Error. Las notas deben estar entre 0 y 10.");
            } else if (promedio <= 3) {
                System.out.println("No Aprobado");
            } else if (promedio > 3 && promedio <= 5) {
                System.out.println("Insuficiente");
            } else if (promedio > 5 && promedio <= 8) {
                System.out.println("Aceptable");
            } else if (promedio > 8 && promedio < 10) {
                System.out.println("Sobresaliente");
            } else if (promedio == 10) {
                System.out.println("Excelente");
            }

            notas.close();



        }
    }

