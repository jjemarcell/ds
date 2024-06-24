package ex1_getset;
// exercicio 1: parte b

import java.util.Random;

public class ex1b {

    public static void main(String[] args) {

        ex1a carro = new ex1a ();

        carro.setNome("UNO");
        carro.setMarca("Fiat");
        carro.setAno(2013);
        carro.setVel(60);
        carro.setSensor(false);

        Random num = new Random();
        int numero = num.nextInt(100) + 1;

        if (numero % 2 == 0) {
            carro.setSensor(true);
        } else {
            carro.setSensor(false);
        }
    }
}
