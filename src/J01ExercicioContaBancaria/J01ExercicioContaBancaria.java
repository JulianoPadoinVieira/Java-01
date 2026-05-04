package J01ExercicioContaBancaria;

import java.math.BigDecimal;
import java.util.Scanner;

public class J01ExercicioContaBancaria {

    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("Saldo atual: " + contaBancaria.saldo());

        contaBancaria.sacar(BigDecimal.valueOf(2000.00));

        contaBancaria.depositar(BigDecimal.valueOf(3502.76));

        contaBancaria.sacar(BigDecimal.valueOf(2000));

        System.out.println("Saldo atual: " + contaBancaria.saldo());

    }
}
