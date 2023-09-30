import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Subsequences {
    
    private Subsequences(){}

    public static void main(String[] args) {
        var d1 = List.of(1,2,3);
        System.out.println(subsequence(new ArrayList<>(), d1, 0));
    }

    private static List<List<Integer>> subsequence(List<List<Integer>>d2, List<Integer> d1, int i){
        if(i == d1.size()) {
            d2.add(new ArrayList<>());
            return d2;
        }
        var noHead = subsequence(d2, d1, i+1);
        var head = new ArrayList<List<Integer>>();
        noHead.forEach(s -> {
            var tobeAdded = new ArrayList<>(s);
            tobeAdded.add(d1.get(i));
            head.add(tobeAdded);});
        noHead.addAll(head);
        return noHead;
    }
    
}
