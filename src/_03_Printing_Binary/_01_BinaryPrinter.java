package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public static void printByteBinary(byte b) {      
    	// Shift b seven bits to the right
    	for (int i = 7; i >= 0; i--) {
    		System.out.print((b & (int) Math.pow(2, i)) > 0 ? 1 : 0);
    	}
        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1
        // Print the result using System.out.print (NOT System.out.println)
    	
        //Use this method to print the remaining 7 bits of b
    }

    public static void printShortBinary(short s) {
        // Create 2 byte variables
    	byte a;
    	byte b;
    	a = (byte) (s & 255);
    	b = (byte) (((byte) (s >> 8)) & 255);
        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte
    	printByteBinary(b);
    	printByteBinary(a);
        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    }

    public static void printIntBinary(int i) {
        // Create 2 short variables
    	short a;
    	short b;
    	a = (short) (i & 65535);
    	b = (short) (((short) (i >> 16)) & 65535);
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short
    	printShortBinary(b);
    	printShortBinary(a);
        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    }

    public static void printLongBinary(long l) {
        // Use the same method as before to complete this method
    	int a;
    	int b;
    	a = (int) (l & 4294967295L);
    	b = (int) (((int) (l >> 32)) & 4294967295L);
    	printIntBinary(b);
    	printIntBinary(a);
    }

    public static void main(String[] args) {
        printLongBinary((long) 0b1010101010101011101010101011);
    }
}
