package jv.FirstChapter.First;

public class One {

    public static int findMaxSum(int k, int[] arr) {
        int winStart = 0, max = 0, sum = 0;
        for (int winEnd = 0; winEnd < arr.length; winEnd++) {
            sum += arr[winEnd];
            if (winEnd >= k - 1) {
                max = Math.max(max, sum);
                sum -= arr[winStart];
                winStart++;
            }
        }
        return max;
    }
}
