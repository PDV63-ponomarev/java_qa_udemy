public class ls4 {

    public byte num = 100;
    //public дает доступ к переменной или формуле из другого пакета

    private byte num1 = 16;
    // private доступ к переменной только из этого класса

    protected short num11 = 101;
    //  protected доступ к переменной внутри класса

    static void main() {

        int num2 = 141; //32бит    -214743648 + 214743647
        long num3 = 123; //64бит

        float num4 = 1.1f; //32   точность 6-7 знаков после точки
        double num5 = 1.12d; //64   15 знаков после точки

        char sym = 'A'; // 16 бит, ичп для unitcode

        boolean isFalse = false; //1 бит
        boolean isTrue = true;
    }
}
