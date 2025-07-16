# Calculadora de IMC em Java (JavaFX)

Este é um projeto acadêmico de estudos em Java, que implementa uma **Calculadora de IMC (Índice de Massa Corporal)** com interface gráfica utilizando JavaFX.

---

## Demonstração

<img width="349" height="279" alt="image" src="https://github.com/user-attachments/assets/9532bf0f-dbc4-4a76-8f89-1bec728af6e3" />

*Exemplo visual da calculadora em execução.*

---

## Funcionalidades

- Interface gráfica simples, clara e intuitiva.
- Entrada de peso (kg) e altura (m), com suporte a vírgula ou ponto decimal.
- Cálculo automático do IMC ao clicar no botão.
- Classificação do IMC conforme as faixas oficiais da OMS.
- Validação de valores inseridos (ex: altura acima de 2.5m ou peso acima de 300kg).
- Tratamento de erros com mensagens amigáveis ao usuário.

---

## O que é IMC?

O Índice de Massa Corporal (IMC) é calculado com a fórmula:

```

IMC = peso / (altura \* altura)

````

É um indicador amplamente utilizado pela Organização Mundial da Saúde (OMS) para avaliar se uma pessoa está com o peso ideal, sobrepeso ou obesidade.

---

## Decisões técnicas e boas práticas adotadas

- ✅ **Tratamento de exceções (`try/catch`)**  
  Para capturar entradas inválidas como letras ou campos vazios, evitando falhas de execução (`NumberFormatException`).

- ✅ **Validação de valores reais**  
  O programa não permite valores fora da realidade (ex: 0 kg, 500 kg ou altura negativa).

- ✅ **Uso de constantes para limites máximos**  
  Substituição de números mágicos por constantes `PESO_MAXIMO` e `ALTURA_MAXIMA` melhora a manutenibilidade do código.

- ✅ **Compatibilidade com vírgulas decimais**  
  Facilita o uso no Brasil e em outros países que utilizam vírgula como separador decimal.

- ✅ **Código limpo e modular**  
  Lógica separada em blocos claros e legíveis, seguindo boas práticas de programação orientada a objetos.

---

## Tecnologias utilizadas

- Java 8+
- JavaFX (interface gráfica)
- Orientação a Objetos (POO)
- Tratamento de Exceções
- Layouts JavaFX (`VBox`, `Label`, `TextField`, `Button`, etc.)

---

## Como executar

1. **Pré-requisitos:**
   - Java 8 ou superior
   - JavaFX instalado e configurado

2. **Compilação:**
   ```bash
   javac --module-path "CAMINHO_PARA_JAVAFX/lib" --add-modules javafx.controls ProjetoCalculadoraIMC.java
````

3. **Execução:**

   ```bash
   java --module-path "CAMINHO_PARA_JAVAFX/lib" --add-modules javafx.controls ProjetoCalculadoraIMC
   ```

   > Substitua `CAMINHO_PARA_JAVAFX/lib` pelo caminho onde está instalado o JavaFX no seu computador.

---

## Melhorias futuras

* [ ] Adicionar botão para limpar os campos de entrada.
* [ ] Adicionar tema escuro para a interface.
* [ ] Salvar histórico dos cálculos em arquivo `.txt` ou `.json`.
* [ ] Criar gráficos simples com a evolução do IMC ao longo do tempo.
* [ ] Exportar como `.jar` para facilitar a distribuição.

---

## Baixar

Você poderá futuramente baixar a versão compilada diretamente pela aba [Releases](https://github.com/seu-usuario/seu-repositorio/releases). *(Link será adicionado quando publicado)*

---

## Sobre

Este projeto foi desenvolvido como parte dos meus estudos em Engenharia de Software, com foco em prática de:

* Programação orientada a objetos
* Criação de interfaces gráficas com JavaFX
* Validação de dados e interação com o usuário

---

**Autor:** João Victor
**Licença:** MIT

