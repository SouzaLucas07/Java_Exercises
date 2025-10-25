import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> alunos = new HashMap<String, Double>();
        alunos.put("Lucas Souza", 5.);
        alunos.put("Milena Vieira", 8.3);
        alunos.put("Alexandro Caldeira", 7.5);

        System.out.println("Lista de Alunos");
        for (Map.Entry<String, Double> entrada : alunos.entrySet()){
            System.out.println("Aluno: " + entrada.getKey() + "| Nota: " + entrada.getValue());
        }
    }
}