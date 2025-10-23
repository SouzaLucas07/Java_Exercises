//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    ConversorSimples conversor = new ConversorSimples();

    double celsius = 25.5;
    double fahrenheit = 77.5;

    double resultado1 = conversor.fahrenheitParaCelsius(celsius);
    double resultado2 = conversor.fahrenheitParaCelsius(fahrenheit);

    System.out.println("°C em Fahrenheit = °F " + celsius+ resultado1);
    System.out.println("°F em Celsius = °C " + fahrenheit+ resultado2);
    }
}