package J01ExercicioContaBancaria;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaBancaria {

        String titular;
        BigDecimal saldo = BigDecimal.valueOf(1497.24);


        void depositar(BigDecimal deposito){
            saldo = saldo.add(deposito);
            System.out.println("Deposito de " + deposito + " adicionado a sua conta." +
                    "\n" + "Seu novo saldo é de: " + saldo);
        }

        void sacar(BigDecimal valorDesejado) {

            if(valorDesejado.compareTo(saldo) <= 0){
                saldo = saldo.subtract(valorDesejado);
                System.out.println("Valor sacado: " + valorDesejado);
            } else {
                System.out.println("Operação não efetuada, saldo insuficiente.");
            }
        }

        public BigDecimal saldo(){
            return saldo;
        }

}
