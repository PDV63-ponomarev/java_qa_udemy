import java.io.IOException;

public class ls8_2 {
    public static void main(String[] args) throws IOException {
    int count = 0;
//        while (count < 10){
//            System.out.println(count);
//            count++;
//        }


//        while (count < 10){
//            System.out.println(count);
//            count++;
//            if (count == 5) break;
//        }


//        do {
//            System.out.println(count);
//            count++;
//        } while (count < 0);
//        Даже если условие ложное, цикл выполнится 1 раз


            while (count < 10){
                count++;
                if ((count%2) != 0) continue;
                System.out.println(count);
            }
//          Если число не четное, то возврат к началу цикла.
    }
}
