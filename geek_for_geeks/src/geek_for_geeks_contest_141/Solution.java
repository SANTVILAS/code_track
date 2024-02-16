package geek_for_geeks_contest_141;

//https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-141/problems

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


//} Driver Code Ends


//User function Template for Java

class Solution {
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
}