package br.com.exemploMVC;
import javax.swing.SwingUtilities;
import br.com.exemploMVC.controller.TemperaturaController;
import br.com.exemploMVC.model.TemperaturaModel;
import br.com.exemploMVC.view.TemperaturaView;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Exemplo MVC");
        System.out.println("Exemplos para testes: ");
        System.out.println("Celsius para Fahrenheit: 10 C --> 50 F e -263 K");
        System.out.println("Celsius para Fahrenheit: 45 C = 113 F");
        
        
         
        SwingUtilities.invokeLater(new Runnable() {
             
            @Override
            public void run() {
                TemperaturaModel model = new TemperaturaModel();
                TemperaturaView view = new TemperaturaView();
                new TemperaturaController(model, view);
                view.setVisible(true);
            }
        });
        
       
    }
}
