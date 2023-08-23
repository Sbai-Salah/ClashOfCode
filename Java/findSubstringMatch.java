import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        // Scanner in = new Scanner(System.in);
        // String chars = in.nextLine();
        // String s = in.nextLine();
        // String toGet = in.nextLine();

        String chars = "+-$%,.:_/()|@#~|*{[]}84512mnbvcxzñlkjhgfdsapoiuytrewq";
        String s = "Never gonna give you up, never gonna let you down...";
        String toGet = "]8a";
        String result = findSubstring(chars, s, toGet);
        System.out.println(result);
    }

    public static String findSubstring(String chars, String s, String toGet) {
        StringBuilder sub = new StringBuilder();

         // Create a mapping of characters in chars to their corresponding characters in s
       
         // The resulting charToIndexMap array allows you to 
        // look up the index of a character in constant time. 
        // For example, if you have a character c, you can 
        // quickly find its index in the chars string using 
        // charToIndexMap[c].
         int[] charToIndexMap = new int[256];
        for (int i = 0; i < chars.length(); i++) {
            charToIndexMap[chars.charAt(i)] = i;
            //System.out.println(charToIndexMap[chars.charAt(i)]);
        }
        System.out.println(charToIndexMap);

       for (int i = 0; i < toGet.length(); i++) {
            char to_get = toGet.charAt(i);
            int charIndex = charToIndexMap[to_get];
            if (charIndex > -1 && charIndex < s.length()) {
                sub.append(s.charAt(charIndex));
            }
        }

        return sub.toString();
    }
}