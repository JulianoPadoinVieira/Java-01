package Ex02Construtores;

public class Client {

    String name;
    Double limiteCredito = 50.0;

    public void solicitarLimiteCredito(Double limiteSolicitado) {
        limiteCredito += limiteSolicitado;
    }

    public void comprar(Double valorProduto) {
        limiteCredito = limiteCredito - valorProduto;

    }

    public Client(String nameInformed) {
        name = nameInformed;
    }



}
