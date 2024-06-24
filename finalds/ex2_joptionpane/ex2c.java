package ex2_joptionpane;

import javax.swing.JOptionPane;

public class ex2c {

    public static void main(String[] args) {
        // == exercicio 2: JOptionPane (parte 3)

        String input = JOptionPane.showInputDialog(null, "Digite um número para ver seus multiplos ate 10: ", "criador de Tabuadas", JOptionPane.QUESTION_MESSAGE);

        int num = Integer.parseInt(input);

        StringBuilder result = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
            result.append(num).append(" x ").append(i).append(" = ").append(num * i).append("\n");
            }

        JOptionPane.showMessageDialog(null, result.toString(), "Tabuada do " + num, JOptionPane.INFORMATION_MESSAGE);
    }
}


