/* 
In the language of an alien race (גזע חייזרים), all words take the form of Blurbs.
A Blurb is a `Whoozit` followed by one or more Whatzits.
A Whoozit is the character 'x' followed by zero or more 'y's. 
A Whatzit is a 'q' followed by either 'z' or a 'd', followed by a Whoozit.
Design and implement a recursive program that generates random Blurbs in this alien language.

Blurb: xqzx, xyyqdxyy, xyyyyqzdxyyyy
Whoozit: x, xyy, xyyyy
Whatzit: qzx , qdxyy, qzdxyyyy
 */

package Blurbs;

import java.util.Random;

public class GenerateBlurb {
    private final Random random;

    public GenerateBlurb() {
        this.random = new Random();
    }
    
    private String whoozit() {
        String firstChar = "x";
        // Return 'x' with random number if 'y' in range 0-4
        return firstChar +  "y".repeat(random.nextInt(5));
    }

    private String whatzit() {
        String firstChar = "q";
        int choose = random.nextInt(3) + 1;

        if (choose == 1) return firstChar + "z" + whoozit();
        if (choose == 2) return firstChar + "d" + whoozit();
        // The rule to make 'whatzit' is 'q' followed by either 'z' or a 'd', followed by a Whoozit.
        // Respectively, It return the 'whatzit' followed by whoozit
        return firstChar + "zd" + whoozit();
    }

    public String generatesBlurb(int numBlurbs) {
        if (numBlurbs < 0) return "-1";
        if (numBlurbs == 0) return ""; // base case
        return whoozit() + whatzit() + "\n" + generatesBlurb(numBlurbs - 1);
    } 

    public static void main(String[] args) {
        GenerateBlurb gb = new GenerateBlurb();
        System.out.println(gb.generatesBlurb(10));

    }
}
