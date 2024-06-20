package Queue;

import java.util.*;

public class FirstNonRepeatingCharacterInStream {
    public static void main(String[] args) {
    String s = "abcbacdabcdeef";
        System.out.println(FirstNonRepeatingInStream(s));
    }
     public static String FirstNonRepeatingInStream(String s) {
         StringBuilder sb = new StringBuilder();
         int frequency[] = new int[26];
         Queue<Character> q = new LinkedList<>();
         for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            q.offer(c);
            frequency[c-'a']++;

            while(!q.isEmpty()&& frequency[q.peek()-'a']>1){
                q.poll();
            }
            if(q.isEmpty()){
                sb.append('#');
            } else {
                sb.append(q.peek());
            }
         }
        return sb.toString();
     }

}
