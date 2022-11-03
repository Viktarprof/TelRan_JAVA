import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write radius");
        double rad = scanner.nextDouble();

        System.out.println("The area of a circle with radius" +radiusCircle(rad));

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Your name");
        String name = scanner1.nextLine();
        System.out.println("Hello " + name);
        String study = new String("I study Basic Java!");
        System.out.println(study);


        char my = study.charAt(study.length()-1);
        System.out.println(my);

        System.out.println(study.charAt(11));

        System.out.println(study.replace('a','*'));
            }



    private static double radiusCircle (double r){
        return 3.14*Math.pow(r, 2);

    }


}
