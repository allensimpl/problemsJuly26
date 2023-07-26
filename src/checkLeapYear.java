import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int leap = 0;
        if(year%100==0){
            if(year%400==0){
                leap=1;
            }else{
                leap=0;
            }
        }else if(year%4==0){
            leap=1;
        }else{
            leap=0;
        }

        if(leap==1){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }

    }
}
