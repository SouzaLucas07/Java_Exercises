public class Atleta implements Corredor, Nadador{
    private String nome;

    public Atleta(String nome){
        this.nome = nome;
    }


    @Override
    public void correr() {
        System.out.println(nome + " Esta correndo");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " Esta nadando");
    }
}
