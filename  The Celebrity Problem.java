// The Celebrity Problem 
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> s= new Stack<>();
    	for(int i=0;i<n;i++){
    	    s.push(i);
    	}
    	while(s.size()!=1){
    	    int i=s.pop();
    	    int j=s.pop();
    	    if(M[i][j]==0){
    	        s.push(i);
    	    }else{
    	        s.push(j);
    	    }
    	}
    	int a = s.pop();
    	for(int j=0;j<n;j++){
    	    if(M[a][j]==1) return -1;
    	}
    	for(int j=0;j<n;j++){
    	    if(a==j) continue;
    	    if(M[j][a]==0) return -1;
    	}
    	return a;
    }
}