import java.util.*;
class House_Robber {
    public int rob(int[] arr) {
      int [] dp=new int [arr.length];
      Arrays.fill(dp,-1);
      return Robber(arr,0,dp);
      
	}
	public static int Robber(int [] arr,int i,int[] dp) {
		if(i>=arr.length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int rob=arr[i]+Robber(arr,i+2,dp);
		int Dont_rob=Robber(arr,i+1,dp);
		return dp[i]=Math.max(rob, Dont_rob);
		}

}