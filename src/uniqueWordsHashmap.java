import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class uniqueWordsHashmap {
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
        int count=0;
        HashMap<String,Integer> wordCounts = new HashMap<String,Integer>();
        for(String i:allWords){
            if(wordCounts.containsKey(i)){
                wordCounts.put(i,wordCounts.get(i)+1);
            }else{
                wordCounts.put(i,1);
            }
        }
        for(Integer i: wordCounts.values()){
            if (i <= 1) {
                count++;
            }
        }
        return count;
    }
    public static ArrayList<String> addAllWords(String sentence){
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
        return allWords;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        ArrayList<String> allWords = addAllWords(sentence);
        int uniqueWordCount = findUniqueWordCount(allWords);
        System.out.println("Unique "+uniqueWordCount);
    }
}
