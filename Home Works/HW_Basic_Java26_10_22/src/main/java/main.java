public class main {
    public static void main(String[] args) {
//        First level: Прошлая задача у вас была про этажи на здании Бурдж Халифе,
//        попробуйте решить её с помощью циклов while и do-while.
//        Каждый из решений упакуйте в самостоятельный метод.
//
//                Напомню задание:
//        Представьте, что Вы живёте в Бурдж-Халифе, количество этажей - 163.
//        Ваш лифт работает нестабильно (вот такой вот курьёз) - поднимаясь на
//        каждые 5 этажей, он спускается на 1 этаж. Разработайте алгоритм, используя
//        цикл while и d-while, с помощью которого Вы смогли бы определить за сколько
//        таких итераций (1 итерация: 5 этажей вверх, 1 - вниз) можно добраться до самого верхнего этажа.
//
//        Принимаем тот факт, что уровень земли это 0й этаж. А так же, если до верха
//        остается менее 5 этажей, то лифт сможет проехать нужный ему промежуток.


        int position = 0;
        //     int position = 163;
        int finishPosition = 163;
        int iter = 4;
        int count = 0;

        while (position < finishPosition) {
            position = position + iter;
            count++;
        }
            System.out.println(count);


       System.out.println("do-while");
            if (position < finishPosition) {
                do {
                    position = position + iter;
                    count++;
                } while (position < finishPosition);
            }
        System.out.println(count);
    }
}

