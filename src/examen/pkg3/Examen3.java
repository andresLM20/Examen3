/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkg3;

import java.util.Scanner;

public class Examen3{
    private enum Estado {
        q0,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14
    }
    
    private enum Valido{
        CORRECTO, INCORRECTO
    }
    
    private Estado estadoActual;
    private static String CadenaSalida = "q0 ";
    
    public Examen3(){
        this.estadoActual = Estado.q0;
    }
    
    public Valido analizar (String entrada){
        for (char caracter : entrada.toCharArray()) {
            transicion(caracter);
        }
        switch (estadoActual) {
            case q0:
                return Valido.INCORRECTO;
            case q1:
                return Valido.INCORRECTO;
            case q2:
                return Valido.INCORRECTO;
            case q3:
                return Valido.INCORRECTO;
            case q4:
                return Valido.INCORRECTO;
            case q5:
                return Valido.INCORRECTO;
            case q6:
                return Valido.INCORRECTO;
            case q7:
                return Valido.INCORRECTO;
            case q8:
                return Valido.INCORRECTO;
            case q9:
                return Valido.INCORRECTO;
            case q10:
                return Valido.INCORRECTO;
            case q11:
                return Valido.INCORRECTO;
            case q12:
                return Valido.INCORRECTO;
            case q13:
                return Valido.INCORRECTO;
            case q14:
                return Valido.CORRECTO;
            default:
                return null;
        }
    }
    
    private void transicion(char caracter){
        switch (estadoActual) {
            case q0:
                if (caracter == 'd') {
                    estadoActual = Estado.q1;
                    CadenaSalida = CadenaSalida + "q1 ";
                    
                } else if (caracter == 'e'){
                    estadoActual = Estado.q2;
                    CadenaSalida = CadenaSalida + "q2 ";
                }
                break;
            case q1:
                if (caracter == 'd') {
                    estadoActual = Estado.q1;
                    CadenaSalida = CadenaSalida + "q1 ";
                    
                } else if (caracter == 'a'){
                    estadoActual = Estado.q3;
                    CadenaSalida = CadenaSalida + "q3 ";
                } else if (caracter == 'e'){
                    estadoActual = Estado.q2;
                    CadenaSalida = CadenaSalida + "q2 ";
                }
                break;
            case q2:
                if (caracter == 'e') {
                    estadoActual = Estado.q2;
                    CadenaSalida = CadenaSalida + "q2 ";
                    
                } else if (caracter == 'd'){
                    estadoActual = Estado.q1;
                    CadenaSalida = CadenaSalida + "q1 ";
                } else if (caracter == 'a'){
                    estadoActual = Estado.q3;
                    CadenaSalida = CadenaSalida + "q3 ";
                }
                break;
            case q3:
                if (caracter == 'b') {
                    estadoActual = Estado.q4;
                    CadenaSalida = CadenaSalida + "q4 ";
                    
                } else if (caracter == 'c'){
                    estadoActual = Estado.q5;
                    CadenaSalida = CadenaSalida + "q5 ";
                }
                break;
            case q4:
                if (caracter == 'c') {
                    estadoActual = Estado.q5;
                    CadenaSalida = CadenaSalida + "q5 ";
                    
                }
                break;
            case q5:
                if (caracter == 'f') {
                    estadoActual = Estado.q6;
                    CadenaSalida = CadenaSalida + "q6 ";
                    
                } else if (caracter == 'g'){
                    estadoActual = Estado.q7;
                    CadenaSalida = CadenaSalida + "q7 ";
                }
                break;
            case q6:
                if (caracter == 'g') {
                    estadoActual = Estado.q7;
                    CadenaSalida = CadenaSalida + "q7 ";
                    
                }
                break;
            case q7:
                if (caracter == 'h') {
                    estadoActual = Estado.q8;
                    CadenaSalida = CadenaSalida + "q8 ";
                    
                }
                break;
            case q8:
                if (caracter == 'c') {
                    estadoActual = Estado.q9;
                    CadenaSalida = CadenaSalida + "q9 ";
                    
                } 
                break;
            case q9:
                if (caracter == 'i') {
                    estadoActual = Estado.q10;
                    CadenaSalida = CadenaSalida + "q10 ";
                    
                } 
                break;
            case q10:
                if (caracter == ',') {
                    estadoActual = Estado.q11;
                    CadenaSalida = CadenaSalida + "q11 ";
                    
                } 
                break;
            case q11:
                if (caracter == 'k') {
                    estadoActual = Estado.q12;
                    CadenaSalida = CadenaSalida + "q12 ";
                    
                } 
                break;
            case q12:
                if (caracter == 'j') {
                    estadoActual = Estado.q13;
                    CadenaSalida = CadenaSalida + "q13 ";
                    
                } 
                break;
            case q13:
                if (caracter == 'c') {
                    estadoActual = Estado.q14;
                    CadenaSalida = CadenaSalida + "q14 ";
                    
                } 
                break;
        }
    }

    public static void main(String[] args) {
        Examen3 cadena = new Examen3();
        Scanner leer=new Scanner(System.in);
        String entrada;
            entrada=leer.nextLine();
            Valido valido = cadena.analizar(entrada);
            System.out.println(CadenaSalida);  
            System.out.println(valido);
    }
}
