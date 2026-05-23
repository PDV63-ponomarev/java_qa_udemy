public class ls5 {
    static void main() {
        int num1 = 3;
        int num2 = 4;

        int result = num1 + num2;

        System.out.println("Result: " + result);
        System.out.println("Result: " + num1 + num2);

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        int num3 = 8;
        int num4 = 2;

        int result2 = num3 - num4;

        System.out.println("Result2: " + result2);

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        int result3 = num3 / num4;

        System.out.println("Result3: " + result3);

        System.out.println(7 / 3); //округляет результат

        System.out.println(7 % 3); //остаток от деления

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        int num5 = 7;
        int num6 = num5++; //прибавка произойдет после обьявления
        System.out.println(num6);
        int num7 = num6--;
        System.out.println(num7);

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        int numT1 = 2;
        int numT2 = 2;

        if (numT1 == numT2) {
            System.out.println("Result true");
        } else {System.out.println("Result false");}

        if (numT1 != numT2) {
            System.out.println("Result two true");
        } else {System.out.println("Result two false");}

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        int num80 = 7;
        int num81 = 6;
        int num82 = 7;
        int num83 = 5;

        // && = И
        if (num80 != num81 && num82 >= num83) {
            System.out.println("Result true");
        } else {System.out.println("Result false");}

        // || = ИЛИ
        if (num80 == num81 || num82 >= num83) {
            System.out.println("Result true");
        } else {System.out.println("Result false");}


    }
}
