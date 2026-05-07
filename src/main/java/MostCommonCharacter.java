import java.util.HashMap;
import java.util.TreeMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char ch;
        char mostCommon = ' ';
    int maxCount = 0;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
           int currentCount = map.getOrDefault(ch, 0) + 1;
            map.put(ch, currentCount);
            
           if (currentCount > maxCount) {
                maxCount = currentCount;
                mostCommon = ch;
            }
        }
        return mostCommon;
    }
}
