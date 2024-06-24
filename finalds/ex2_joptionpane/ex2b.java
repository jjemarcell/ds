package ex2_joptionpane;

import javax.swing.JOptionPane;

public class ex2b {

    public static void main(String[] args) {
        // == exercicio 2: JOptionPane (parte 2)

        int cont = 0;
        int num;

        do {
            String input = JOptionPane.showInputDialog(null, "Digite um número (digite 0 para acabar):", "Soma entre números", JOptionPane.QUESTION_MESSAGE);
            num = Integer.parseInt(input);
            cont += num;
        } while (num != 0);

        JOptionPane.showMessageDialog(null, "Soma dos números: " + cont, "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }

}