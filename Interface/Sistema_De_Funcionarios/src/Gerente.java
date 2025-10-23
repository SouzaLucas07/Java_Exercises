public class Gerente extends Funcionario implements Bonus{
    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase); // chama o construtor da classe pai
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.25; // 25% de bonus
    }
}
