package je_arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {

        Map estados = new HashMap();
        estados.put("RS", "Rio Grande do Sul");
        estados.put("SP", "São paoulo");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("SC", "Santa Catarina");

        System.out.println("O estado que está na chave RS é " + estados.get("RS"));

        /* OBS: Por padrão, o valor virá como um object se não for especificado o tipo no < >
         Em java mais moderno podemos declarar
         Iterator <String> keys = estados.keySet().iterator();
         e remover o .toString(); do while */
        Iterator keys = estados.keySet().iterator();

        while(keys.hasNext()){
            String chave = keys.next().toString();
            String valor = estados.get(chave).toString();
        }
    }
}
