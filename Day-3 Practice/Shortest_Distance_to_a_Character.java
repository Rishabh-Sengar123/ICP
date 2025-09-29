class Shortest_Distance_to_a_Character {
    public int[] shortestToChar(String s, char c) {
        int count = 0;
        int[] ans = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }

        }
        int[] arr = new int[count];
        int k = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                arr[k] = i; 
                k++;
            }
        }
        
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int answer = Integer.MAX_VALUE;
            for(int j = 0; j<count; j++){
                sum = Math.abs(arr[j]-i);
                answer = Math.min(sum, answer);
            }
            ans[i] = answer;
        }
        return ans;
    }
}