package Conversor;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        // Creamos las instancias para poder acceder a los elementos de las clases especificas
        FunctionMonedas monedas = new FunctionMonedas();
        FunctionTemperatura temperatura = new FunctionTemperatura();

        // Definimos una variable para controlar el ciclo while
        boolean continuar = true;

        // Iniciamos el ciclo while
        while (continuar) {
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                    "Menú", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Conversor de moneda", "Conversor de temperatura", "Salir"},
                    "Selección")).toString();

            // Dependiendo de la opción que elija el usuario en este caso conversor de moneda o conversor de temperatura

            // Usamos la sentencia SWITCH y evaluamos los casos
            switch (opciones) {
                case  "Conversor de moneda": {
                    // Crear un cuadro de diálogo en el que podamos ingresar un valor
                    String input = "";
                    // Iniciamos un ciclo while para asegurarnos de que el usuario ingresa un valor numérico
                    while (true) {
                        try {
                            input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
                            Double valorRecibido = Double.parseDouble(input);
                            monedas.ConvertirMonedas(valorRecibido);
                            break;
                        } catch (NumberFormatException e) {
                            // Si el usuario no ingresa un valor numérico, se muestra un mensaje de error y se vuelve a solicitar el valor
                            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico.");
                        }
                    }
                }
                case "Conversor de temperatura": {
                    // Recuerda el input que es el valor a convertir
                    String input2 = "";
                    // Iniciamos un ciclo while para asegurarnos de que el usuario ingresa un valor numérico
                    while (true) {
                        try {
                            input2 = JOptionPane.showInputDialog("Ingrese el valor a convertir");
                            Double valorIngresado = Double.parseDouble(input2);
                            temperatura.ConvertirTemperatura(valorIngresado);
                            break;
                        } catch (NumberFormatException e) {
                            // Si el usuario no ingresa un valor numérico, se muestra un mensaje de error y se vuelve a solicitar el valor
                            JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor numerico");
                        }
                    }
                }

                case "Salir": {
                    // Mostramos una ventana de confirmación para que el usuario decida si desea salir o no
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Salir", JOptionPane.YES_NO_OPTION);
                    // Si el usuario elige sí, cambiamos el valor de la variable continuar a false para salir del ciclo while
                    if (opcion == JOptionPane.YES_OPTION) {
                        continuar = false;
                    }
                    break;
                }
            }
        }
    }
}