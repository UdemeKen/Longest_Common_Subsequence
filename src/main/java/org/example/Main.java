package org.example;

import static org.example.Recursive_Approach.LCSLength;

public class Main {
    public static void main(String[] args) {
        String X = "ABCBDAB";
        String Y = "BDCABA";
        System.out.println("The length of the LCS is " + LCSLength(X, Y, X.length(), Y.length() )+ ".");
    }
}