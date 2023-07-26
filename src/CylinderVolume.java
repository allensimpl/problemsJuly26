import java.util.Scanner;
public class CylinderVolume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = sc.nextInt();
        System.out.print("Enter the height");
        int h = sc.nextInt();
        System.out.println(Math.PI*r*r*h);
    }
}
