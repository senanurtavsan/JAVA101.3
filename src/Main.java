import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        System.out.print("Gidilen Yolun Uzunluğu : ");
        double mesafe=inp.nextDouble();

        double ucret = mesafe * 2.20;

        double tutar = ucret < 20 ? (20) : (ucret*2.20);

        System.out.println(mesafe);
        System.out.println("Ücret : " + tutar + "-TL");



    }
}