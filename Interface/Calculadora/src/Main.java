//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    double raio = 5;

        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calc.calcularAreaCirculo(raio));
        System.out.println("Perímetro: " + calc.calcularPerimetroCirculo(raio));
    }
}