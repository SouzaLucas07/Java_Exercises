public class Boleto implements Pagamento{
    public void pagar(double valor){
        System.out.println("Pagamento de R$" + String.format("%.2f", valor) + " realizado com Boleto Bancário.");
    }
    public String getMetodo(){
        return "Boleto";
    }
}
