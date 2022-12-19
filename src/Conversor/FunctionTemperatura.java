package Conversor;

import javax.swing.*;

public class FunctionTemperatura {
    ConvertirTemperaturas temperaturas = new ConvertirTemperaturas();
    public void ConvertirTemperatura(double valorIngresado) {
        String opciones = (JOptionPane.showInputDialog(null, "Elije la temperatura a la que deseas convertir", "Tipos de temperaturas",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"De °Centigrado a °Fahrenheit", "De °Fahrenheit a °Centigrado", "De °Centigrados a Kelvin", "De Kelvin a Centigrado", "De Fahrenheit a Kelvin", "De Kelvin a Fahrenheit"},
                "Seleccion")).toString();
        switch (opciones) {
            case "De °Centigrado a °Fahrenheit":
                temperaturas.convertirDeCentigradoAFahrenheit(valorIngresado);
                break;
            case "De °Fahrenheit a °Centigrado":
                temperaturas.convertirFahrenheitACentigrado(valorIngresado);
                break;
            case "De °Centigrados a Kelvin":
                temperaturas.convertirDeCentigradoAkelvin(valorIngresado);
                break;
            case "De Kelvin a Centigrado":
                temperaturas.convertirDeKelvinACentigrado(valorIngresado);
                break;
            case "De Fahrenheit a Kelvin":
                temperaturas.convertirFahrenheitAKelvin(valorIngresado);
                break;
            case "De Kelvin a Fahrenheit":
                temperaturas.convertirDeKelvinAFahrenheit(valorIngresado);
                break;
        }
    }
}
