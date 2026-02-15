package br.com.exemploMVC.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.com.exemploMVC.model.TemperaturaModel;
import br.com.exemploMVC.view.TemperaturaView;

public class TemperaturaController {

    private TemperaturaModel model;
    private TemperaturaView view;

    public TemperaturaController(TemperaturaModel model, TemperaturaView view) {
        this.model = model;
        this.view = view;

        view.addConverterListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                converter();
            }
        });
    }

    private void converter() {
        double valor = view.getValor();
        String origem = view.getOrigem();
        String destino = view.getDestino();

        double resultado = 0;

        if (origem.equals(destino)) {
            resultado = valor;
        } else if (origem.equals("Celsius") && destino.equals("Fahrenheit")) {
            resultado = model.celsiusParaFahrenheit(valor);
        } else if (origem.equals("Fahrenheit") && destino.equals("Celsius")) {
            resultado = model.fahrenheitParaCelsius(valor);
        } else if (origem.equals("Celsius") && destino.equals("Kelvin")) {
            resultado = model.celsiusParaKelvin(valor);
        } else if (origem.equals("Kelvin") && destino.equals("Celsius")) {
            resultado = model.kelvinParaCelsius(valor);
        } else if (origem.equals("Fahrenheit") && destino.equals("Kelvin")) {
            resultado = model.fahrenheitParaKelvin(valor);
        } else if (origem.equals("Kelvin") && destino.equals("Fahrenheit")) {
            resultado = model.kelvinParaFahrenheit(valor);
        }

        view.setResultado(resultado);
    }
}
