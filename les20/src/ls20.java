public class ls20 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("Начало");
            nums[7] = 10;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("У нас одна ошибка");
        } catch (ArithmeticException exc) {
            System.out.println("У нас другая ошибка");
        }
    }
}

// ArrayStoreException происходит когда несовместимый тип
// ArrayIndexOutOfBoundsException обращение за пределы массива
// ClassCastException недопустимое приведение типов
// IllegalArgumentException недопустимый параметр при вызове метода
// NegativeArraySizeException отрицательное значение
// NullPointerException недопуст исп пустой ссылки
// TypeNotPresentException неизвестный тип
// UnsupportedOperationException неподдерживаемая операция
// ClassNotFoundException класс не найден
// InstantiationException
// ArithmeticException