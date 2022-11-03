public class main {
    public static void main(String[] args) {
//        int maxFlors =163;
//        int currentFlore = 0;
//        int count = 0;
//        for ( currentFlore = 0; currentFlore < maxFlors; currentFlore = currentFlore + 5 -1) {
//        count++;
//        }
//        System.out.println("Number of iteraitions" + count);
//        System.out.println(163 % 4);

        for (int floor = 0; floor < 163; floor = floor + 5, --floor) { // floor = floor + 5, --floor = 4 этажа
            System.out.println("Ваш этаж " + floor);
        }
            System.out.println();

            int count = 0;
            for (int i = 0; i <= 163; i = i + 4, count++) {

            } System.out.println("Через " + count +" этажей будет ваш этаж" );
        }
    }

// списал
  /*  Представьте, что Вы живёте в Бурдж-Халифе, количество этажей - 163.
            Ваш лифт работает нестабильно (вот такой вот курьёз) - поднимаясь на каждые 5 этажей,
            он спускается на 1 этаж. Разработайте алгоритм, используя цикл for, с помощью которого
            Вы смогли бы определить за сколько таких итераций (1 итерация: 5 этажей вверх, 1 - вниз)
            можно добраться до самого верхнего этажа.

            Принимаем тот факт, что уровень земли это 0й этаж. А так же,
            если до верха остается менее 5 этажей, то лифт сможет проехать нужный ему промежуток.
        */