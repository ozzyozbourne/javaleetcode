package jv.FirstChapter.Second;

public class Two {
    
    public static int findMin(int k, int [] arr) {

        int windowStart = 0, min = Integer.MAX_VALUE,  sum = 0;
        for(int i = 0; i< arr.length; i++) {
            sum += arr[i];
            while(sum >= k){
                min  = Math.min(min, i - windowStart +1 );
                sum -= arr[windowStart++];
            }
        }
        return min == Integer.MAX_VALUE?0:min;
    }
}
