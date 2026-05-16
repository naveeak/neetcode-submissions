class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];

        for(int i = 0 ; i<=n; i++){
            result[i] = count1Bit(i);

        }

        return result;

        
    }

    public static int count1Bit(int n){
        int result = 0;
        for(int i =0 ; i<32; i++){
            // System.out.println((n & ( 1 << i)));
            if( (n & ( 1 << i)) != 0){
                result +=1;
            }
        }

        return result;
    }
}
