package Conversor;

import javax.swing.*;

public class ConvertirTemperaturas {
    public void convertirDeCentigradoAFahrenheit (double valorIngresado){
        double fahrenheit = valorIngresado*1.8+32;
        fahrenheit = (double) Math.round(fahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es: °F" + fahrenheit);
    }
    public void convertirFahrenheitACentigrado (double valorIngresado){
        double centigrados = (valorIngresado-32) / 1.8;
        centigrados = (double) Math.round(centigrados * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura en Centigrados es: °C" + centigrados);
    }

    public void convertirDeKelvinACentigrado (double valorIngresado){
        double centigrados = valorIngresado - 273.15;
        centigrados = (double) Math.round(centigrados * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura en Centigrados es: °C" + centigrados);
    }

    public void convertirDeCentigradoAkelvin (double valorIngresado){
        double kelvin = valorIngresado + 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura en Kelvin es: °K" + kelvin);
    }

    public void convertirFahrenheitAKelvin (double valorIngresado){
        double kelvin = (valorIngresado-32) / 1.8;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura en Kelvin es: °K" + kelvin);
    }

    public void convertirDeKelvinAFahrenheit (double valorIngresado){
        double fahrenheit = (valorIngresado-32) / 1.8;
        fahrenheit = (double) Math.round(fahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es: °F" + fahrenheit);
    }

}
