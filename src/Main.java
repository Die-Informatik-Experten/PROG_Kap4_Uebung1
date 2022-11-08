/*
 *  Created on: 02.11.2022
 *  Author:     Tim FÜrstenau
 *  Task:       Prog_Kap3_Uebung2
 */

/**
 * This program checks if both objects themselves and object references are the same.
 * The methods uses for this are: == for object reference equality & .equals(Object) for object reference equality
 * */

public class Main
{
    public static void main(String[] args)
    {
        /* Declaration of three Strings */
        String firstString = new String("abc");
        String secondString = new String("xyz");
        String sameString = firstString;                //String with the same memory location as the first string (Object reference equality)
        String sameString2 = new String("abc");  //String with the same content as the first string but different memory location (Object equality)

        /* Output of all Strings */
        System.out.println("First String: " + firstString);
        System.out.println("Second String: " + secondString);
        System.out.println("Same address as First String: " + sameString);
        System.out.println("Same object but different memory address as First String: " + sameString2);

        /* ______________________________________________________________________________________________________*/
        /* Checks if the String references are the same with == */
        System.out.println("");
        System.out.println("Comparison of two object references");
        System.out.println("___________________________________");

        /* compares the first and second string which have both a different memory address AND different contents */
        if (firstString == secondString)
        {
            System.out.println("First String and Second String have the same object reference.");
        }
        else
        {
            System.out.println("First String and Second String do NOT have the same object reference."); // should be executed
        }

        /* compares the first and sameString which have the different memory address and therefore also the same content */
        if (firstString == sameString)
        {
            System.out.println("In this case (first and sameString) both object references are the same."); // should be executed
        }
        else
        {
            System.out.println("In this case (first and sameString) both object references are NOT the same.");
        }

        /* compares the first and sameString2 which have the same content but not the same memory address */
        if (firstString == sameString2)
        {
            System.out.println("In this case (first and sameString2) both object references are the same.");
        }
        else
        {
            System.out.println("In this case (first and sameString2) both object references are NOT the same."); // should be executed
        }

        /* ______________________________________________________________________________________________________*/
        /* Checks if the String references are the same with == */
        System.out.println("");
        System.out.println("Comparison of two objects");
        System.out.println("___________________________________");

        /* checks if the first and second string, which have different memory address and different contents, are equal to each other */
        if (firstString.equals(secondString))
        {
            System.out.println("First String and Second String are equal to each other.");
        }
        else
        {
            System.out.println("First String and Second String are NOT equal to each other."); // should be executed
        }

        /* checks if the first and sameString, which have the same memory address and therefore the same contents, are equal to each other */
        if (firstString.equals(sameString))
        {
            System.out.println("In this case (first and sameString) are equal to each other"); // should be executed
        }
        else
        {
            System.out.println("In this case (first and sameString) are NOT equal to each other.");
        }

        /* checks if the first and sameString2, which have the same content but not the same memory address, are equal to each other */
        if (firstString.equals(sameString2))
        {
            System.out.println("In this case (first and sameString2) are equal to each other."); // should be executed
        }
        else
        {
            System.out.println("In this case (first and sameString2) are NOT equal to each other.");
        }


    }
}