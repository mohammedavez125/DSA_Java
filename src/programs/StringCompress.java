package programs;

//https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75

public class StringCompress {
    public static void main(String[] args){
        System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }

    public static int compress(char[] chars){
        //        String sb = String.valueOf(chars[0]);
        String sb = new String();
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1){
                if (count != 1){
                    sb += String.valueOf(chars[i]) +count;
                }
                break;

            }
            if (chars[i] == chars[i + 1]){
                count++;
            } else {
                sb += String.valueOf(chars[i]);
                if (count != 1){
                    sb += count;
                }
                count = 1;
            }
        }
        char[] compressedChars = sb.toString().toCharArray();
        System.arraycopy(compressedChars, 0, chars, 0, compressedChars.length);
        return compressedChars.length;
    }
}
