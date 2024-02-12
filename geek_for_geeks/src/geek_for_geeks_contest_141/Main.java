package geek_for_geeks_contest_141;

//https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-141/problems


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class Main{

  public static BufferedReader br;
  public static PrintWriter ot;

	public static void main (String[] args) throws IOException{
      br = new BufferedReader(new InputStreamReader(System.in));
      ot = new PrintWriter(System.out);
      int t = Integer.parseInt(br.readLine().trim());
      
      while(t-->0){
          String usernames[] = br.readLine().trim().split(" ");
          int n = Integer.parseInt(usernames[0]);
          usernames  = br.readLine().trim().split(" ");
          int ans[] = new Solution().findBots(usernames , n);
          for(int x : ans)
              ot.print(x + " ");
          ot.println();
      }
      ot.close();
  }
   

}

//} Driver Code Ends
//User function Template for Java

class Solution{
  public int[] findBots(String usernames[], int n){

    int[] ans = new int[n];
    
    for(int index=0;index<=usernames.length-1;index++){
        String username = usernames[index];
        if(checkIfBot(username)){
            ans[index] = 1;
        }
    }
    return ans;
  }
  
  public boolean checkIfBot(String username){
      
      Set<Character> uniqueChar = new HashSet<>();
      
      for(int index = 0; index < username.length();index+=2){
          Character evenCharacter = username.charAt(index);
          uniqueChar.add(evenCharacter);
      }
      
      return checkIfPrime(uniqueChar.size());
      
      
  }
  public boolean checkIfPrime(int num){
          if(num<=1){
              return false;
          }
          
          for(int count=2; count*count<=num; count++){
              if(num % count==0){
                  return false;
              }
          }
          return true;
      }
}



//{ Driver Code Starts.

//} Driver Code Ends



