package geek_for_geeks_contest_141;

//https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-141/problems

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Array {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int t = sc.nextInt(); // input testcases

     while (t-- > 0) // Loop until we exhaust all testcases
     {
         int n = sc.nextInt(); // Input size of array n
         int arr[] = new int[n]; // Declaring the array
         for (int i = 0; i < n; i++) {
             int x = sc.nextInt();
             arr[i] = x; // Assigning elements to array
         }

         int x = sc.nextInt(); // Input x
         int y = sc.nextInt(); // Input y

         Solution obj = new Solution1(); // object to call the function
         System.out.println(
             obj.majorityWins(arr, n, x, y)); // The functions you complete
     }
 }
}

//} Driver Code Ends


//User function Template for Java

class Solution1 {
 // Function to find element with more appearances between two elements in an
 // array.
 public int majorityWins(int arr[], int n, int x, int y) {
     // code here
     
     int count_x =0;
     int count_y =0;
     
     
     for(int index=0;index<=arr.length-1;index++){
         if(arr[index]==x){
             count_x++;
         }
         if(arr[index]==y){
             count_y++;
         }
         
      
     }
        if(count_x > count_y){
             return x;
         }else if(count_x < count_y){
             return y;
         }else{
            return Math.min(x,y);
         }
 }
}
