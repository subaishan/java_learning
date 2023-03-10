import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        circular_cone cir;
        System.out.println("Please a high and a bottom_line");
        Scanner sca = new Scanner(System.in);
        cir = new circular_cone(sca.nextDouble(),sca.nextDouble());
        System.out.println("volume of the circular cone is "+cir.SetVolume());
    }
}