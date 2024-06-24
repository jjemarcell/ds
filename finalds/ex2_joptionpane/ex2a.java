package ex2_joptionpane;

import javax.swing.JOptionPane;
public class ex2a {

    public static void main(String[] args) {
        // == exercicio 2: JOptionPane (parte 1)

        String input = JOptionPane.showInputDialog(null, "Digite qualquer número:", "Pergunta", JOptionPane.QUESTION_MESSAGE);

        int num = Integer.parseInt(input);

        if (num > 0) {
            JOptionPane.showMessageDialog(null, "Seu número é positivo.", "Positivo!", JOptionPane.INFORMATION_MESSAGE);
        } else if (num < 0) {
            JOptionPane.showMessageDialog(null, "Seu número é negativo.", "Negativo!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Seu número é zero.", "Zero!", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}

