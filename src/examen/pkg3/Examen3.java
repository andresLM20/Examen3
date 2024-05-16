package examen.pkg3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
        String filePath = "archivo.txt";

        try {
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder contenido = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
            br.close();
            String contenidoString = contenido.toString();
            String[] lines = contenidoString.split("\n");
            String cadena2="";
            for (String line : lines) {
                cadena2 = cadena2 + line + " <SaltoDeLinea> ";
            }
            cadena3 = cadena2.split("\\s");
            System.out.println("Tokens:");
            for (String elemento : cadena3) {
                System.out.println(elemento);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Valido valido = cadena.analizar(cadena3);
        System.out.println(CadenaSalida);  
        System.out.println("La direccion es: "+valido);
    }
}
