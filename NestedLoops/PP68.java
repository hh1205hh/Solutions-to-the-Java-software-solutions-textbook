/*
Write a program that prints a table showing a subset of the unicode characters and their numeric values.
Print five number characters pairs per line, separated by tab characters.
Print the table for for numeric values from 32 (the space character) to 126 (the ~ character),
which corresponds to the printable ASCII subset of the unicode characters set.
Compare your output to the table in Appendix C. Unlike the table in Appendix C, 
the values in your table can increase as they go across a row.
*/

package NestedLoops;

public class PP68 {
    public static void main(String[] args) {
        final String subsetUnicode = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";

        for (int i = 0; i < subsetUnicode.length(); i += 5) {
            // Print five number-character pairs per line
            for (int j = i; j < Math.min(i + 5, subsetUnicode.length()); j++) {
                // Get the character at the current position
                char c = subsetUnicode.charAt(j);
                // Print the character and its numeric value
                System.out.print(c + "\t" + (int)c + "\t");
            }
            System.out.println();
        }
    }
}

