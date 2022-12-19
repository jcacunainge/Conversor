package Conversor;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        //Creamos las instacias para poder acceder a los elementos de las clases especificas
        FunctionMonedas monedas = new FunctionMonedas();
        FunctionTemperatura temperatura = new FunctionTemperatura();

        String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversion",
                "Menu", JOptionPane.QUESTION_MESSAGE, null,
                new Object[] {"Conversor de moneda", "Conversor de temperatura"},
                "Seleccion")).toString();

        //Dependiendo de la opcion que elija el usuario en este caso conversor de monedad o conversor de temperatura

        //Usamos la sentencia SWITCH y evaluamos los casos
        switch (opciones){
            case  "Conversor de moneda": {
                //Crear un cuadro de dialogo en el que podamos ingresar un valor
                String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
                Double valorRecibido = Double.parseDouble(input);
                monedas.ConvertirMonedas(valorRecibido);
                //boolean acceso = false;
                int result = JOptionPane.showConfirmDialog(null,
                        "¿Desea continuar usando el programa?",
                        "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    // Llevar al usuario de nuevo al menú principal

                } else if (result == JOptionPane.NO_OPTION) {
                    // Mostrar un mensaje de "Programa Finalizado"
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                } else {
                    // Mostrar un mensaje de "Programa Finalizado
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    }
                }

                break;
            case "Conversor de temperatura":{
                //Recuerda el input que es el valor a convertir
                String input2 = JOptionPane.showInputDialog("Ingrese el valor a convertir");

                Double valorIngresado = Double.parseDouble(input2);
                temperatura.ConvertirTemperatura(valorIngresado);
                int result = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);

                if (result == JOptionPane.YES_OPTION){
                    // Llevar al usuario de nuevo al menú principal
                }
                else if (result == JOptionPane.NO_OPTION){
                    // Mostrar un mensaje de "Programa Finalizado"
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
                else {
                    // Mostrar un mensaje de "Programa Finalizado
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
                break;

            }

        }
    }
}

