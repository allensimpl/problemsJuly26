import java.util.Scanner;

public class CircleAreaCircumfrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = sc.nextInt();
        System.out.println("Area: "+Math.PI*r*r);
        System.out.println("Circumfrence: "+2*Math.PI*r);
    }
}
