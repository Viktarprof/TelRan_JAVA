import java.util.Random;

public class Me {
    public static void main(String[] args) {
        int[] massiv = new int[15];                                 // длинна массива до 15
        int even = 0;
        int odd = 0;
        for (int i = 0; i < massiv.length; i++) {                   // перебираю всю длинну массива
            Random numbe = new Random();                           // показываю в консоли рандомные цифры
            massiv[i] = numbe.nextInt(9);                   // определил значеения цифр массива до 10
            System.out.println("Полученное random число " + massiv[i]);
        }
        for (int j = 0; j < massiv.length; j++) {                   // перебираю всю длинну массива
            if (massiv[j] % 2 == 0) {                               // определяют четность путем деления на 2
                even++;                                     // "загибаю пальцы" сколько четных элементов
            }
        } System.out.println("В массиве чётных элементов " + even);

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] %2 != 0){
                odd++;
            }
        } System.out.println("В массиве НЕ чётных элементов " + odd);
    }
}


