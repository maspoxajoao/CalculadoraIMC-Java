import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class ProjetoCalculadoraIMC extends Application {
  private static final double PESO_MAXIMO = 300.0;
  private static final double ALTURA_MAXIMA = 2.5;

  @Override
  public void start(Stage palco) {
    // Etiquetas para os campos de entrada
    Label etiquetaPeso = new Label("Peso (kg):");
    Label etiquetaAltura = new Label("Altura (m):");

    // Campos de entrada para peso e altura
    TextField campoPeso = new TextField();
    campoPeso.setPromptText("Peso em kg");
    TextField campoAltura = new TextField();
    campoAltura.setPromptText("Altura em metros");

    // Label para mostrar o Resultado
    Label etiquetaResultado = new Label();

    // Botão para Calcular IMC
    Button botaoCalcular = new Button("Calcular IMC");
    botaoCalcular.setOnAction(e -> {
      try {
        double peso = Double.parseDouble(campoPeso.getText().replace(",", "."));
        double altura = Double.parseDouble(campoAltura.getText().replace(",", "."));
        
        // Verificar se os valores estão corretos
        if (peso <= 0 || peso > PESO_MAXIMO || altura <= 0 || altura > ALTURA_MAXIMA) {
          etiquetaResultado.setText("Por favor, insira valores válidos para peso e altura.");
          return;
        }
        double imc = peso / (altura * altura);
        String classificacao;

        // Classificação do IMC
        if (imc < 16.0) classificacao = "Magreza grave";
        else if (imc < 17.0) classificacao = "Magreza moderada";
        else if (imc < 18.5) classificacao = "Magreza leve";
        else if (imc < 25.0) classificacao = "Peso normal";
        else if (imc < 30.0) classificacao = "Sobrepeso";
        else if (imc < 35.0) classificacao = "Obesidade grau I";
        else if (imc < 40.0) classificacao = "Obesidade grau II (severa)";
        else classificacao = "Obesidade grau III (mórbida)";

        etiquetaResultado.setText(String.format("Seu IMC é: %.2f - %s", imc, classificacao));
      } catch (NumberFormatException ex) {
        etiquetaResultado.setText("Por favor, insira valores válidos.");
      }
    });

    // Layout 
    VBox layout = new VBox(10, etiquetaPeso, campoPeso, etiquetaAltura, campoAltura, botaoCalcular, etiquetaResultado);
    layout.setPadding(new Insets(10));
    layout.setAlignment(Pos.CENTER);
    Scene cena = new Scene(layout, 350, 250);
    palco.setTitle("Calculadora de IMC");
    palco.setScene(cena);
    palco.show();
  }
  public static void main(String[] args) {
    launch(args);
  }
}