import java.util.Random;

public class ls10 {
    public static void main(String[] args) {
        Random random = new Random();
        int num2 = random.nextInt(10); // предельный диапозон 10, не вкл
        System.out.println(num2);

        int num = (int)(Math.random() * 100); //метод int делает целое число
        System.out.println(num);
    }
}

