public class Cartao implements Pagamento{
    public void pagar(double valor){
        System.out.println("Pagamento de R$" + String.format("%.2f", valor) + " realizado com Cartão.");
    }
    public String getMetodo(){
        return "Cartao de Credito";
    }
}
