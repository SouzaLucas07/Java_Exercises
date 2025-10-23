//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal Cachorro = new Cachorro();
        Animal Gato = new Gato();

        Cachorro.emitirSom();
        Cachorro.mover();
        System.out.println("--- ---");
        Gato.emitirSom();
        Gato.mover();
    }
}