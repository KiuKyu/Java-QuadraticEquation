import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation nEquation = new QuadraticEquation();

        System.out.print("Điền vào số a: ");
        nEquation.setA(scanner.nextDouble());
        System.out.print("Điền vào số b: ");
        nEquation.setB(scanner.nextDouble());
        System.out.print("Điền vào số c: ");
        nEquation.setC(scanner.nextDouble());

        double delta = nEquation.getDiscriminant();
        System.out.println("Delta: " + delta);

        if (delta == 0) {
            System.out.println("Nghiệm của phương trình là: " + nEquation.getRoot1());
        } else if (delta >= 0) {
            System.out.println("Phương trình có 2 nghiệm là: " + nEquation.getRoot1() + " và " + nEquation.getRoot2());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }


    }
}
