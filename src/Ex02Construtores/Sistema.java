package Ex02Construtores;

public class Sistema {

    public static void main(String[] args) {

        Client juliano = new Client("Juliano");
        Client Karine = new Client("Karine");

        System.out.println("O cliente " + juliano.name + " tem saldo de: " + juliano.limiteCredito);

        juliano.comprar(27.0);

        System.out.println("O cliente " + juliano.name + " tem saldo de: " + juliano.limiteCredito);

        Karine.solicitarLimiteCredito(150.0);

        System.out.println("O(A) cliente " + Karine.name + " tem saldo de: " + Karine.limiteCredito);





    }
}
