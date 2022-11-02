import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Выберите напиток: ");
        int drink = scaner.nextInt();

        String drinkStr = switch (drink) {
            case 1 -> "Приготовление эспрессо - минимально неразделимый процесс.";
            case 2 -> "Приготовление американо - эспрессо + добавление воды.";
            case 3 -> "Приготовление капучино - эспрессо + добавление вспененного молока.";
            case 4 -> "Приготовление чая - выбор чайного пакетика + добавление воды.";

            default -> "error";
        };
        System.out.println("Your drink :" + drinkStr);



        //Прошу вас пояснить. можно ли было сделать так что бы вместо цифр вписать в консоли
        // например чай, американо, капучино, экспрессо? А результат был само приготовление.
        // Как это можно было сделать?? Этот пример я сдела исключительно фо коду котрый вы
        // нам показали на лекции.




        //int drink1 = Integer.parseInt("Приготовление эспрессо");
        //int drink2 = Integer.parseInt("Приготовление американо");
        //int drink3 = Integer.parseInt("Приготовление капучино");
        //int drink4 = Integer.parseInt("Приготовление капучино");

        //int drink = scaner.nextInt();
        //int drink = scaner.nextInt();
        //int drink = scaner.nextInt();

        //String drinkStr;

        //switch (drink){
          //  case drink -> drink1 -> drink2:
          //  drinkStr = "минимально неразделимый процесс.";
          //  break;
        }
    }

