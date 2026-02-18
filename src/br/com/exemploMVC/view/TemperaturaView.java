package br.com.exemploMVC.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TemperaturaView extends JFrame {

    private String version = "0.21";

    private JTextField txtValor = new JTextField(10);

    private JComboBox<String> cbOrigem = new JComboBox<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" });

    private JComboBox<String> cbDestino = new JComboBox<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" });

    private JButton btnConverter = new JButton("Converter");
    private JLabel lblResultado = new JLabel("Resultado: ");

    public TemperaturaView() {
        setTitle("Conversor de Temperatura - MVC " + version);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(5, 1));
        cbDestino.setSelectedIndex(1);

        add(txtValor);
        add(cbOrigem);
        add(cbDestino);
        add(btnConverter);
        add(lblResultado);
    }

    // Métodos para o Controller
    public double getValor() {
        return Double.parseDouble(txtValor.getText());
    }

    public String getOrigem() {
        return (String) cbOrigem.getSelectedItem();
    }

    public String getDestino() {
        return (String) cbDestino.getSelectedItem();
    }

    public void setResultado(double valor) {
        lblResultado.setText("Resultado: " + String.format("%.2f", valor));
    }

    public void addConverterListener(ActionListener l) {
        btnConverter.addActionListener(l);
    }

    public void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(
                this,
                mensagem,
                "Valor inválido",
                JOptionPane.ERROR_MESSAGE);
    }

}
