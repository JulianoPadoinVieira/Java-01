package JE01excecoes;

public class Excecoes {

    public static void main(String[] args) {
        try {

            Double valor = Double.valueOf("a1.78");

            System.out.println(valor);
            //Aqui fica  alógica

        }catch (Exception ex) {

//            ex.printStackTrace("aaa");

            //Aqui ficará a lógica de captura e tratamento de exceção

        }finally{

            //Sempre será executado, exceto em caso de ERRO.

        }
    }
}
