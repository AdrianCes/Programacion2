package com.programacion.boletin2;
import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        String superficie;
        float lado , base , altura , radio , area1 , area2 , area3;

        superficie = JOptionPane.showInputDialog("Elige un número para hacer el área de una de estas superficies: \n 1 Cuadrado \n 2 Triángulo \n 3 Círculo");


        switch(superficie){
            case "1":
                lado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del lado del cuadrado"));

                JOptionPane.showMessageDialog(null,"El área del cuadrado es " + (area1 = lado*lado));
                break;
            case "2":
                base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la base del triángulo"));
                altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la altura del triángulo"));

                JOptionPane.showMessageDialog(null,"El área del triángulo es " + (area2 = (base * altura)/2));
                break;
            case "3":
                radio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del radio del círculo"));

                JOptionPane.showMessageDialog(null,"El área del círculo es " + (area3 = (float) Math.PI*(radio*radio)));
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCION INCORRECTA", "Failure", JOptionPane.ERROR_MESSAGE);




        }
    }
}
