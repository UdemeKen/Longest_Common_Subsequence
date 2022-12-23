package org.example;

public class Memoization_BU_Approach {
//    Function to find the length of the longest common subsequence of subString `A[0...m - 1]` and `B[0...n - 1]`
    public static int LCS_Length(String A, String B){
        int m = A.length();
        int n = B.length();
//        Lookup table stores solution to already computed subProblems, i.e., `T[i][j]` stores the length of  LCS of subString `A[0...i - 1]` and `B[0...j - 1]`
        int [][] T = new int[m + 1][n + 1];
//        Fill the lookup table in a bottom-up manner
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
//                If the current letter of `A` and `B` matches
                if (A.charAt( i - 1) == B.charAt(j - 1)){
                    T[i][j] = T[i - 1][j - 1] + 1;
                }
//                Otherwise if the current character of `A` and `B` don't match
                else {
                    T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
                }
            }
        }
//        LCS will be the last entry in the lookup table
        return T[m][n];
    }
}
