package je_arrays;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List languages = new ArrayList();
        //Java moderno
        //List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("python");
        languages.add("go");
        languages.add("javascript");
        languages.add("C#");
        languages.add("C++");

        int count = 0;

        for(Object lang: languages){
            System.out.println("Languages on position ["+ count + "]: " + lang );
            count++;
        }
    }
}
