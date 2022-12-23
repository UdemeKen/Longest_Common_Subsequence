package org.example;

import java.util.Map;

public class Memoization_TD_Approach {
//    Function to find the length of the long common subsequence of substring `X[0...m - 1]` and `Y[0...n - 1]`
    public static int lcsLength(String X, String Y, int m, int n, Map<String, Integer> lookup){
//        Return if the end of either string is reached
        if(m == 0 || n ==0){
            return 0;
        }
//        Construct a unique map key from dynamic elements of  the input
        String key = m + "|" + n;
//        If the subProblem is seen for the first time, solve it and store it result in a map
        if (!lookup.containsKey(key)){
//            If the last character of  `X` and `Y` matches
            if(X.charAt(m - 1) == Y.charAt(n - 1)){
                lookup.put(key, lcsLength(X, Y, m - 1, n - 1, lookup) + 1);
            }
            else {
//                Otherwise if the last character of `X` and `Y` don't match
                lookup.put(key, Integer.max(lcsLength(X, Y, m, n - 1, lookup), lcsLength(X, Y, m - 1, n, lookup)));
            }
        }
//        Return the problem solution from the map
        return lookup.get(key);
    }
}
