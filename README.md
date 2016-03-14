Aluno: Lucas França de Oliveira. ITA T-18.
Atividade de CES-22
Prof. Yano.

Calculadora implementada em Java usando o swing.

Divisão das classes:
-Calculator: classe principal da calculadora, chama todas as outras e coordena todo o processo;
-Element: classe que armazena um elemento em uma expressão aritmética, pode ser um operador, um parêntesis ou um número; -StringConversor: classe que recebe uma string com a expressão e a converte para uma lista do Element's;
-ToPolishConversor: classe que recebe uma lista de Element's que representam a expressão na forma parentética e a converte para uma lista de Element's na forma polonesa pelo algoritmo de Shunting-yard;
-CalculatorEngine: classe que recebe uma lista de Element's na forma polonesa e retorna o resultado;
-CalculatorGUI: classe coordena a interface gráfica do programa e se comunica com a classe calculator;
-Display: classe com o painel do display e que comunica todas as operações em tela para a CalculatorGUI;
-Keyboard: classe que recebe todos os comandos dos botões e se comunica com a CalculatorGUI;
-DisplayActionListener: classe que recebe os comandos do display e envia para o Display;
-KeyboardActionListener: classe que recebe os comandos dos botões e envia para o Keyboard.
