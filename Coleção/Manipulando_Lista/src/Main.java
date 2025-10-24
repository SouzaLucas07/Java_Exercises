import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Morango");

        frutas.remove(1);

        System.out.println("lista de Frutas:");
        for (String fruta : frutas){
            System.out.println(fruta);
        }
    }
}