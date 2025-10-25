import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String frase = "Java é legal e poderoso";
        String[] palavras = frase.split(" ");

        HashMap<String, Integer> contagem = new HashMap<String, Integer>();

        for(String palavra : palavras){
            if(contagem.containsKey(palavra)){
                contagem.put(palavra, contagem.get(palavra) + 1);
            }else
            {
                contagem.put(palavra, 1);
            }
        }
        System.out.println(frase);
        System.out.println("--- ---");
        System.out.println("Contagem de palavras: ");
        for (Map.Entry<String, Integer> entrada : contagem.entrySet()){
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}