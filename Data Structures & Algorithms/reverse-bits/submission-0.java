class Solution {
    public int reverseBits(int n) {

        int[] bitArray = bitArray(n);
        int result = 0;

        for(int i = 31 ; i >=0 ; i--){
            if(bitArray[i] == 1){
                result += (1 << (31-i));
            }
        }
        return result;


        
    }

    public static int[] bitArray(int n){
        int[] result = new int[32];
        for(int i =0 ; i<32; i++){
            // System.out.println((n & ( 1 << i)));
            if( (n & ( 1 << i)) != 0){
                result[i] = 1;
            }
        }

        return result;
    }
}
