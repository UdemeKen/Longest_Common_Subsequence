package org.example;

import java.util.HashMap;
import java.util.Map;

import static org.example.Memoization_BU_Approach.LCS_Length;
import static org.example.Memoization_TD_Approach.lcsLength;
import static org.example.Recursive_Approach.LCSLength;

public class Main {
    public static void main(String[] args) {
//        The Recursive_Approach
        String X = "ABCBDAB";
        String Y = "BDCABA";
        System.out.println("The length of the LCS is " + LCSLength(X, Y, X.length(), Y.length() ) + ".");

//      The Memoization_TD_Approach
//        Create a map to store solutions to subProblems
        Map<String, Integer> lookup = new HashMap<>();
        System.out.println("The length of the LCS is " + lcsLength(X, Y, X.length(), Y.length(), lookup) + ".");

//      The Memoization_BU_Approach
        String A = "XMJYAUZ", B = "MZJAWXU";
        System.out.println("The length of the LCS is " + LCS_Length(A, B));
    }
}