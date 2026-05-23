import java.io.IOException;

public class ls6 {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'B';

        System.out.println("Какую букву я загадал?"); //начинает с новой строки
        System.out.print("Попытайся угадать:"); //продолжает предыдушую строку

        ch = (char)System.in.read();

        if (ch == answer){
            System.out.println("Угадал");
        } else if (ch > answer) {
            System.out.println("Перестарался");
        } else {
            System.out.println("Недостарался");
        }
    }
}
