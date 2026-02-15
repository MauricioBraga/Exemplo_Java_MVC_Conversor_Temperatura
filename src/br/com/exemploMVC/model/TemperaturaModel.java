package br.com.exemploMVC.model;

public class TemperaturaModel {

    public double celsiusParaFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }

    public double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public double celsiusParaKelvin(double c) {
        return c + 273.15;
    }

    public double kelvinParaCelsius(double k) {
        return k - 273.15;
    }

    public double fahrenheitParaKelvin(double f) {
        return celsiusParaKelvin(fahrenheitParaCelsius(f));
    }

    public double kelvinParaFahrenheit(double k) {
        return celsiusParaFahrenheit(kelvinParaCelsius(k));
    }
}

