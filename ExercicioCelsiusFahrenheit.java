public class ExercicioCelsiusFahrenheit {
    public static void main(String[] args) {
        int celsius = 30;
        int fahrenheit;

        fahrenheit = (int) ((celsius*1.8) + 32);
        System.out.println("%dº celcius corresponde a %dº fahrenheit".formatted(celsius, fahrenheit));
    }
}
