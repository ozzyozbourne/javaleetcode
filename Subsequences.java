import java.util.ArrayList;
import java.util.List;

public final class Subsequences {
    
    private Subsequences(){}

    public static void main(String[] args) {
        var d1 = new ArrayList<Integer>();
        d1.add(3);
        d1.add(2);
        d1.add(1);
        for(var a: subsequence(d1)) System.out.printf("%s\n", a);
    }

    private static List<List<Integer>> subsequence(List<Integer> d1){
        if(d1.isEmpty()) {
            List<List<Integer>> d2 = new ArrayList<>();
            d2.add(new ArrayList<>());
            return d2;
        }
        return  subsequence(d1.subList(1, d1.size()));
    }
    
}
