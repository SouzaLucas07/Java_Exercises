import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
        numerosAleatorios.add(42);
        numerosAleatorios.add(7);
        numerosAleatorios.add(15);
        numerosAleatorios.add(3);
        numerosAleatorios.add(28);
        numerosAleatorios.add(10);

        System.out.println("Lista de Numeros");
        System.out.println(numerosAleatorios);

        Collections.sort(numerosAleatorios);
        System.out.println(numerosAleatorios);

        Collections.reverse(numerosAleatorios);
        System.out.println(numerosAleatorios);

    }
}