public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        
        int pow = 2;
        int k =0;
        for(int i=0;i<=num;i++,k++){
            
            if(i==0){
                result[i] = 0;
                continue;
            }
            if(i==1) {
                result[i] = 1;
                continue;
            }
            int temp = result[i-pow];
            //System.out.println(temp);
            temp += 1;
            //System.out.println(temp);
            result[i] = temp;
            
            if(i == pow*2 -1 ) {
                k = 0;
                pow = pow*2;
            }
            
            
            
        }
        
        return result;
        
    }
}
