import java.util.Scanner;

public class substringStartingIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String testString = sc.nextLine();
        String wordToCheck = sc.nextLine();
        for(int i=0;i<=testString.length()-1;i++){
            int flag = 1;
            for(int j=0;j<=wordToCheck.length()-1;j++){
                if(testString.charAt(i+j)!=wordToCheck.charAt(j)){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.println(i);
            }

        }
    }
}
