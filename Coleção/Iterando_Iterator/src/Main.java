import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<String>();
        //Iterator é um objeto especial que serve para percorrer (iterar) os elementos de uma coleção,
        //como ArrayList, LinkedList, HashSet, etc

        alunos.add("Lucas Souza");
        alunos.add("Milena Vieira");
        alunos.add("Alexandro");

        Iterator<String> interator = alunos.iterator();
        System.out.println("Lista de Alunos:");
        while(interator.hasNext()){
            String nome = interator.next();
            System.out.println(nome);
        }
    }
}