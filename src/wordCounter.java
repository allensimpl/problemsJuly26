import java.util.Scanner;

public class wordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentance = sc.nextLine();
        int count =0;
        int i=0;
        while(i<=sentance.length()-1){
            if(sentance.charAt(i)!=' '){
                count++;
                while((i<=sentance.length()-1)&&(sentance.charAt(i)!=' ')){
                    i++;
                }
                continue;
            }
            i++;
        }
        System.out.println(count);
    }
}