package br.com.parkingcar;

import br.com.parkingcar.models.Ticket;
import br.com.parkingcar.tools.Tools;

public class Main {
    public static void main(String[] args) {

        int numero = 1;

        Ticket ticket01 = new Ticket();
        System.out.println("Criando 0" + numero++ + " ...");
        Tools.pause(1000);
        Ticket ticket02 = new Ticket();
        System.out.println("Criando 0" + numero++ + " ...");
        Tools.pause(5000);
        Ticket ticket03 = new Ticket();
        System.out.println("Criando 0" + numero++ + " ...");
        Tools.pause(15000);
        Ticket ticket04 = new Ticket();
        System.out.println("Criando 0" + numero++ + " ...");
        Tools.pause(50000);


        System.out.println(ticket01);
        System.out.println();
        System.out.println(ticket02);
        System.out.println();
        System.out.println(ticket03);
        System.out.println();
        System.out.println(ticket04);
        System.out.println();
    }
}
