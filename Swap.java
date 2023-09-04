public final class Swap{

    public static void main(String[] args) {
        var s = new int[]{1,2,3,4,5,6};
        swap(s, 0, s.length -1);
        for(var a: s)System.out.printf("%d\n", a);
    }

    public static void swap(int[] arr, int left, int right){
        if(left >= right) return;
        var temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        swap(arr, ++left, --right);
    }

}
