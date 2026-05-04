package je_pilares_poo;

public class ComputadorJuliano {
    public static void main(String[] args) {

        Facebook facebook = new Facebook();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        Whatts whatts = new Whatts();
        whatts.enviarMensagem();
        whatts.receberMensagem();

        Instagram instagram = new Instagram();
        instagram.enviarMensagem();
        instagram.receberMensagem();

    }
}
