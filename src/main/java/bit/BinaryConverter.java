package bit;

/**
 * Created by Роман Лотоцький on 04.05.2017.
 */
public class BinaryConverter {

    public static void main(String[] args) {
        int number = 32;
        //decimal to binary
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Decimal to binary: " + binaryString);
        //decimal to octal
        String octalString = Integer.toOctalString(number);
        System.out.println("Decimal to octal: " + octalString);
        //decimal to hexadecimal
        String hexString = Integer.toHexString(number);
        System.out.println("Decimal to hexadecimal: " + hexString);

        //second way
        hexString = Integer.toString(number, 16);
        System.out.println("Decimal to hexadecimal using Integer.toString: " + hexString);

        number = 2; //0010

        //example of bitwise unary complement operator (~)
        System.out.println("\nExample of bitwise unary complement operator ( ~ ): ");
        System.out.println("value of number before: " + number);
        System.out.println("value of number after negation: " + ~number);
        System.out.println("value I want to see(~-3): " + Integer.toBinaryString(~number));

        int a = 222; //0010
        int b = 444; //0100

        //example of bitwise AND operator &
        System.out.println("\nExample of bitwise AND operator &: ");
        System.out.println("Result of a&b (a=222, b=444)  is " + (a&b));  //should be zero

        a = 2; //0010
        b = 4; //0100
        System.out.println("Example: value of A bitwise OR (a=2, b=4) (a|b) B in Java  : " + (a|b) );
        System.out.println(" value of a XOR (a=2, b=4) (a^b)  in Java : " + (a^b) );

        number = 8; //0000 1000
        System.out.println("\nBitShiftTest \n ++++++++ \nOriginal number : " + number);
        //left shifting bytes with 1 position
        number = number<<1; //should be 16 i.e. 0001 0000

        //equivalent of multiplication of 2
        System.out.println("value of number after left shift ( << )" +
                "(equivalent of multiplication of 2): " + number);

        number = -8;
        //right shifting bytes with sign 1 position
        number = number>>1; //should be 16 i.e. 0001 0000

        //equivalent of division of 2
        System.out.println("value of number after right shift with sign ( >> )" +
                "(equivalent of division of 2) number = -8: " + number);

        number = -8;
        //right shifting bytes without sign 1 position
        number = number>>>1; //should be 16 i.e. 0001 0000

        //equivalent of division of 2
        System.out.println("value of number after right shift( >>> ) with sign" +
                "(equivalent of division of 2): " + number);
    }
}
