//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Gerente gerente = new Gerente("Trevor", 6500);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas Souza", 5000);

        System.out.println("----- -----");
        gerente.exibirDados();
        System.out.println("Bônus: R$" + gerente.calcularBonus());
        System.out.println("----- -----");
        desenvolvedor.exibirDados();
        System.out.println("Bônus: R$" + desenvolvedor.calcularBonus());
        }
    }
