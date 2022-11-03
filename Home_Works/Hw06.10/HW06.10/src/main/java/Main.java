import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. введите слово, используя сканер, состоящий из четного количества букв
        System.out.println("Write your words"); // Viktar

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //(проверьте количество букв в слове - вывести в консоль количество).
        System.out.println(name.length());
        // первая часть слова и вторая часть
        System.out.println("Первая часть слова");
        String partOne = (name.substring(0,name.length()/2)); // делал по примеру с интеренета. подбирал цифру "два" методом тыка. я как понял что счет идет справа на лево
        System.out.println(partOne);

        System.out.println("Вторая часть слова");
        String partTwo = (name.substring(name.length()/2,name.length())); // не понял почему считать с конца (viktar 5 4 3 2 1 0)
        System.out.println(partTwo);


    }
}
