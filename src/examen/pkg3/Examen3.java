/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkg3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Examen3{
    private enum Estado {
        q0,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14
    }
    
    private enum Valido{
        CORRECTA, INCORRECTA
    }
    
    private Estado estadoActual;
    private static String CadenaSalida = "q0 ";
    
    public Examen3(){
        this.estadoActual = Estado.q0;
    }
    
    public Valido analizar (String[] entrada){
        for (String elemento : entrada) {
            transicion(elemento);
        }
        switch (estadoActual) {
            case q0:
                return Valido.INCORRECTA;
            case q1:
                return Valido.INCORRECTA;
            case q2:
                return Valido.INCORRECTA;
            case q3:
                return Valido.INCORRECTA;
            case q4:
                return Valido.INCORRECTA;
            case q5:
                return Valido.INCORRECTA;
            case q6:
                return Valido.INCORRECTA;
            case q7:
                return Valido.INCORRECTA;
            case q8:
                return Valido.INCORRECTA;
            case q9:
                return Valido.INCORRECTA;
            case q10:
                return Valido.INCORRECTA;
            case q11:
                return Valido.INCORRECTA;
            case q12:
                return Valido.INCORRECTA;
            case q13:
                return Valido.INCORRECTA;
            case q14:
                return Valido.CORRECTA;
            default:
                return null;
        }
    }
    
    private void transicion(String elemento){
        switch (estadoActual) {
            case q0:
                if (elemento.matches("^[A-Z][a-zA-Z]+$")) {
                    estadoActual = Estado.q1;
                    CadenaSalida = CadenaSalida + "q1 ";
                    
                } else if (elemento.matches("^[A-Z]+\\.$")){
                    estadoActual = Estado.q2;
                    CadenaSalida = CadenaSalida + "q2 ";
                }
                break;
            case q1:
                if (elemento.matches("^[A-Z][a-zA-Z]+$")) {
                    estadoActual = Estado.q1;
                    CadenaSalida = CadenaSalida + "q1 ";
                    
                } else if (elemento.matches("^[A-Z][a-zA-Z]+\\.$")){
                    estadoActual = Estado.q3;
                    CadenaSalida = CadenaSalida + "q3 ";
                } else if (elemento.matches("^[A-Z]+\\.$")){
                    estadoActual = Estado.q2;
                    CadenaSalida = CadenaSalida + "q2 ";
                }
                break;
            case q2:
                if (elemento.matches("^[A-Z]+\\.$")) {
                    estadoActual = Estado.q2;
                    CadenaSalida = CadenaSalida + "q2 ";
                    
                } else if (elemento.matches("^[A-Z][a-zA-Z]+$")){
                    estadoActual = Estado.q1;
                    CadenaSalida = CadenaSalida + "q1 ";
                } else if (elemento.matches("^[A-Z][a-zA-Z]+\\.$")){
                    estadoActual = Estado.q3;
                    CadenaSalida = CadenaSalida + "q3 ";
                }
                break;
            case q3:
                if (elemento.matches("^[A-Z][a-zA-Z]+\\.$")) {
                    estadoActual = Estado.q4;
                    CadenaSalida = CadenaSalida + "q4 ";
                    
                } else if (elemento.equals("<SaltoDeLinea>")){
                    estadoActual = Estado.q5;
                    CadenaSalida = CadenaSalida + "q5 ";
                }
                break;
            case q4:
                if (elemento.equals("<SaltoDeLinea>")) {
                    estadoActual = Estado.q5;
                    CadenaSalida = CadenaSalida + "q5 ";
                    
                }
                break;
            case q5:
                if (elemento.matches("^[A-Z][a-zA-Z]+$")) {
                    estadoActual = Estado.q6;
                    CadenaSalida = CadenaSalida + "q6 ";
                    
                } else if (elemento.matches("^#[0-9]+$")){
                    estadoActual = Estado.q7;
                    CadenaSalida = CadenaSalida + "q7 ";
                }
                break;
            case q6:
                if (elemento.matches("^#[0-9]+$")) {
                    estadoActual = Estado.q7;
                    CadenaSalida = CadenaSalida + "q7 ";
                    
                }
                break;
            case q7:
                if (elemento.matches("^[A-Z][a-zA-Z]+$")) {
                    estadoActual = Estado.q8;
                    CadenaSalida = CadenaSalida + "q8 ";
                    
                }
                break;
            case q8:
                if (elemento.equals("<SaltoDeLinea>")) {
                    estadoActual = Estado.q9;
                    CadenaSalida = CadenaSalida + "q9 ";
                    
                } 
                break;
            case q9:
                if (elemento.matches("^[A-Z][a-zA-Z]+,$")) {
                    estadoActual = Estado.q11;
                    CadenaSalida = CadenaSalida + "q11 ";
                    
                } 
                break;
//            case q10:
//                if (elemento.matches("")) {
//                    estadoActual = Estado.q11;
//                    CadenaSalida = CadenaSalida + "q11 ";
//                    
//                } 
//                break;
            case q11:
                if (elemento.matches("^[A-Z]{2}$")) {
                    estadoActual = Estado.q12;
                    CadenaSalida = CadenaSalida + "q12 ";
                    
                } 
                break;
            case q12:
                if (elemento.matches("^[0-9]{5}$")) {
                    estadoActual = Estado.q13;
                    CadenaSalida = CadenaSalida + "q13 ";
                    
                } 
                break;
            case q13:
                if (elemento.equals("<SaltoDeLinea>")) {
                    estadoActual = Estado.q14;
                    CadenaSalida = CadenaSalida + "q14 ";
                    
                } 
                break;
        }
    }

    public static void main(String[] args) {
        Examen3 cadena = new Examen3();
        String[] cadena3 = {};
//        Scanner leer=new Scanner(System.in);
//        String entrada;
//        entrada=leer.nextLine();
//        
//        String[] elementos = entrada.split("\\s+|\n");

        // Mostrar los elementos
//        System.out.println("Elementos separados:");
//        for (String elemento : elementos) {
//            System.out.println(elemento);
//        }
        String filePath = "archivo.txt";

        try {
            // Crear un objeto File que representa el archivo de texto
            File file = new File(filePath);

            // Crear un objeto FileReader para leer el archivo
            FileReader fr = new FileReader(file);

            // Crear un objeto BufferedReader para leer líneas de texto de manera eficiente
            BufferedReader br = new BufferedReader(fr);

            // Variable para almacenar el contenido del archivo
            StringBuilder contenido = new StringBuilder();

            // Leer el archivo línea por línea y almacenar el contenido en el StringBuilder
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }

            // Cerrar el BufferedReader
            br.close();

            // Convertir el contenido a una cadena de strings
            String contenidoString = contenido.toString();

            // Mostrar el contenido del archivo
            //System.out.println("Contenido del archivo:");
            //System.out.println(contenidoString);

            // Separar la cadena en un arreglo de strings
            String[] lines = contenidoString.split("\n");
            String cadena2="";
            //System.out.println("lineas separadas:");
            for (String line : lines) {
                //System.out.println(line);
                cadena2 = cadena2 + line + " <SaltoDeLinea> ";
            }
            //System.out.println("");
            //System.out.println(cadena2);
            //System.out.println("");
            cadena3 = cadena2.split("\\s");
            // Mostrar los elementos
            System.out.println("Elementos separados:");
            for (String elemento : cadena3) {
                System.out.println(elemento);
            }
        } catch (IOException e) {
            // Manejar posibles excepciones de E/S
            e.printStackTrace();
        }
        
        
        Valido valido = cadena.analizar(cadena3);
        System.out.println(CadenaSalida);  
        System.out.println("La direccion es: "+valido);
    }
}
