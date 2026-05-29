import java.io.IOException;

public class ls8 {
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 5; i++){
            System.out.println("Итерация " + i);
        }

        for (int i = 0; i < 5;){
            i++;
            System.out.println("Итерация " + i);
        }

        for (int i = 0; (char) System.in.read() !='S'; i++){
            System.out.println("Итерация " + i);
        }

    }
}

