public class Desenvolvedor extends Funcionario implements Bonus{
    public Desenvolvedor(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10; // 10% de bonus
    }
}
