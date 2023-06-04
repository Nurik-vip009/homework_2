import java.util.Random;
public class Main {
    public static void main(String[] args) {
        test(23, 10);
        test(generateRandomAge(), 10);
        test(30, 20);
        test(18, 25);
        test(50, 5);
    }
    public static void test(int age, int temperature) {
        String result = canGoForWalk(age, temperature);
        System.out.println("Age: " + age + ", Temperature: " + temperature + " - " + result);
    }
    public static String canGoForWalk(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
}