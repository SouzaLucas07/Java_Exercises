public class Pix implements Pagamento {
    public void pagar(double valor){
        System.out.println("Pagamento de R$" + String.format("%.2f", valor) + " realizado via Pix.");
    }
    public String getMetodo(){
        return "Pix";
    }
}
