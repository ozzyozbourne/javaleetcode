public final class Recursive {

    public static void main(String[] args) {
        var arr = new int[]{1,2,3,4,5,6,7,8,9};
        recursive(arr, 0);
        for(var a: arr)System.out.printf("%d ", a);
        System.out.printf("\n");

        arr = new int[]{1,2,3,4,5,6,7,8};
        recursive(arr, 0);
        for(var a: arr)System.out.printf("%d ", a);
        System.out.printf("\n");
    }

    public static void recursive(int[] arr, int i) {
        if(i >= arr.length-1-i) return;
        var temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-1-i] = temp;
        recursive(arr, i+1);
    }

}
