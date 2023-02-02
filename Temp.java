import java.util.*;
class Temp{
    public static void main(String args[]){
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        List<List<Integer>> l2 = new ArrayList<List<Integer>>();
        // l2.add(1);
        // l2.add(2);
        l2.add(l);
    }
}