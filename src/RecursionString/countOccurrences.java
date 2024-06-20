package RecursionString;

public class countOccurrences {
    public static void main(String[] args) {
        String s ="aaaa";
        String t ="aa";
        System.out.println(countOccurences(t,s));
    }
    static int countOccurences(String t,String s){
        return countOccurencesHelper(t,s, 0);
    }
    static int countOccurencesHelper(String t,String s,int i){
        if(i> s.length()-t.length()){
            return 0;
        }
        int subProblemKaAnswer = countOccurencesHelper(t,s,i+1);

        boolean doStartingCharsMatch = s.substring(i,i+t.length()).equals(t);

        if(doStartingCharsMatch) return subProblemKaAnswer +1;
        else return subProblemKaAnswer;

    }
}
