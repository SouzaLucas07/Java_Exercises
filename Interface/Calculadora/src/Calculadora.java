public class Calculadora implements Matematica{

    @Override
    public double calcularAreaCirculo(double raio) {
        return Pi * raio * raio;
    }

    @Override
    public double calcularPerimetroCirculo(double raio) {
        return 2 * Pi * raio;
    }
}
