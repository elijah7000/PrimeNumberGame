package Lab1;

public class problem3 {
    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for(int i = 0; i< strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                System.out.println(prefix);
            }
        }

        return prefix;
    }

    public static void main(String[] args){

        String[] array = {"flower","flow","flight"};
        String commonPrefix = longestCommonPrefix(array);
        System.out.println("Longest Common Prefix: " + commonPrefix);
    }
}
