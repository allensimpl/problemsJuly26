import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
public class uniqueWords {
    public static String sliceWord(String word,int start, int end){
        int n = (end-start)+1;
        char[] newWord = new char[n];
        int i=0;
        while(i<=n-1){
            newWord[i]=word.charAt(start+i);
            i++;
        }
        String finalWord = new String(newWord);
        return finalWord;
    }
    public static int findUniqueWordCount(ArrayList<String> allWords){
        String uniqueString = "";
        int count=0;
        for(String i:allWords){
            int flag = 1;
//            System.out.println(i);
            for(String j:allWords){
                if(i==j){
                    continue;
                }
                if(i.equals(j)){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        ArrayList<String> allWords = new ArrayList<>();
        int i=0;
        while(i<=sentence.length()-1){
            if(sentence.charAt(i)!=' ') {
                int start = i;
                while((i<=sentence.length()-1)&&(sentence.charAt(i)!=' '&&sentence.charAt(i)!='\0')){
                    i++;
                }
                String newWord = sliceWord(sentence,start,i-1);
                allWords.add(newWord);
                continue;
            }
            i++;
        }
        int uniqueWordCount = findUniqueWordCount(allWords);
        System.out.println("Unique "+uniqueWordCount);
    }
}
