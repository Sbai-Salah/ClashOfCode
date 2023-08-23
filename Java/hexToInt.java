

import java.util.Scanner;

/*
 * 
input > output

F > 15
FF>255
4B68>19304
5>5
10>16
83DF47>8642375

HOW TO CONVERT ?
8 3 D F 4 7

- for the 7 (most significant bit) : 7x16^0
- for the D : 13x16^3
- ...

using this line of code : Character.digit(digit, 16);
16: This parameter specifies the radix or base of the numeral system.
In this case, the radix is 16, which indicates hexadecimal.
This means that the method will interpret the given character 
as a hexadecimal digit and convert it to its decimal (base 10) equivalent.
*/
public class hexToInt {
    
        public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String number = in.next();

        int decimalNumber = hexToDecimal(number);

        System.out.println(decimalNumber);
        }

        static int hexToDecimal(String hexNumber){
            int decimal=0;
            int length=hexNumber.length();

            for(int i=0;i<length;i++){
                char digit=hexNumber.charAt(length - 1 -i);
                int value=Character.digit(digit, 16);
                decimal+= value*Math.pow(16,i);
            }
            return decimal;
        }
}
