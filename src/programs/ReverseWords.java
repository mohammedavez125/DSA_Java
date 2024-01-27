package programs;

import org.jetbrains.annotations.NotNull;


public class ReverseWords {
    public static void main(String[] args){
        System.out.println("ans = "+ reverseWords("the sky is blue"));
    }

    public static String reverseWords(@NotNull String s){
        String[] str = s.trim().split("\\s+");
//        System.out.println(Arrays.toString(str));
        String res="";
        for (int i = str.length-1;i>0;i--){
            res += str[i]+" ";
        }
        return res+str[0];
    }
}
