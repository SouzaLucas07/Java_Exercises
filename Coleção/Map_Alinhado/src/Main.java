import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> notasAlunos = new HashMap<String, HashMap<String, Integer>>();

        HashMap<String, Integer> disciplinasLucas = new HashMap<String, Integer>();
        disciplinasLucas.put("Calculo 3", 5);
        disciplinasLucas.put("Programacao orientadas a objetos", 5);

        HashMap<String, Integer> disciplinasMilena = new HashMap<String, Integer>();
        disciplinasMilena.put("Fundamentos de Matematica e Fisica", 7);
        disciplinasMilena.put("Calculo 1", 5);

        notasAlunos.put("Lucas Souza", disciplinasLucas);
        notasAlunos.put("Milena Vieira", disciplinasMilena);

        notasAlunos.forEach((aluno, disciplinas) -> {
            System.out.println("Aluno: " + aluno);
            disciplinas.forEach((disciplina, nota) -> {
                System.out.println("  " + disciplina + " -> " + nota);
            });
            System.out.println(); // linha em branco para separar alunos
        });

    }
}