package org.example;

import java.util.HashMap;
import java.util.Map;

import static org.example.Memoization_TD_Approach.lcsLength;
import static org.example.Recursive_Approach.LCSLength;

public class Main {
    public static void main(String[] args) {
        String X = "ABCBDAB";
        String Y = "BDCABA";
        System.out.println("The length of the LCS is " + LCSLength(X, Y, X.length(), Y.length() ) + ".");

//        Create a map to store solutions to subProblems
        Map<String, Integer> lookup = new HashMap<>();
        System.out.println("The length of the LCS is " + lcsLength(X, Y, X.length(), Y.length(), lookup) + ".");
    }
}