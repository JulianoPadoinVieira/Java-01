package je_java_NIO;

import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    public static void main(String[] args) {
        File diretorio = new File("c:\\primeiro\\segundo");
//        System.out.println("O diretório " + diretorio + " existe? " + diretorio.exists());


        if(diretorio.exists()) {
            System.out.println("Diretório encontrado!");
        } else if(!diretorio.exists()) {
            diretorio.mkdirs();
            System.out.println("Diretório " + diretorio  + " criado com sucesso.");
        }

        try {
            File arquivo = new File(diretorio, "aula-java.txt");
            arquivo.createNewFile();
            System.out.println("Arquivo " + arquivo + " criado sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
