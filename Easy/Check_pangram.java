/*
    Author -: Devansh Desai
    Date -: 19-08-2022

    Problem -: A pangram is a sentence where every letter of the English alphabet appears at least once.

    Given a string sentence containing only lowercase English letters, return true if sentence is a
    pangram, or false otherwise.

*/
package Easy;

public class Check_pangram {
    public static void main(String[] args) {
        String str = "foxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
//    public static boolean checkIfPangram(String sentence) {
//        StringBuilder str= new StringBuilder();
//        int temp;
//        for (int i = 0; i <sentence.length() ; i++) {
//            temp = str.indexOf(String.valueOf(sentence.charAt(i)));
//            if (temp==-1){
//                str.append(sentence.charAt(i));
//            }
//        }
//        return str.length() == 26;
//    }
    //Optimal Solutions
public static boolean checkIfPangram(String sentence) {
    if(sentence.length()<26) {
        return false;
    }
    String Alphas = "abcdefghijklmnopqrstuvwxyz";
    for(int i=0; i<Alphas.length(); i++) {
        if (sentence.indexOf(Alphas.charAt(i)) == -1) {
            // Check for each and every alphabet
            return false;
        }
    }
    return true;
}
}
