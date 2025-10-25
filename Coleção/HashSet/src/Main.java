import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<Integer>();
        //Integer é uma classe empacotadora (wrapper class)
        //que representa o tipo primitivo int como um objeto.

        numeros.add(7);
        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(10);
        numeros.add(24);
        numeros.add(120);
        numeros.add(50);
        numeros.add(12);
        numeros.add(10);

        System.out.println("Conjunto de Numeros:");
        System.out.println(numeros);

        System.out.println("Quantidade de elementos únicos:" + numeros.size());
    }
}