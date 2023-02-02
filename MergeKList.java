import java.util.*;
class MergeKList{
    static List<Integer> merge(List<Integer> l1,List<Integer> l2){
        List<Integer> l3 = new ArrayList<Integer>();
        int n1,n2,i=0,j=0;
        n1 = l1.size();
        n2 = l2.size();
        while(i<n1 && j<n2){
            if(l1.get(i)==l2.get(j)){
                l3.add(l1.get(i));
                i++;
                j++;
            }else if(l1.get(i)>l2.get(j)){
                l3.add(l2.get(j));
                j++;
            }else{
                l3.add(l1.get(i));
                i++;
            }
        }
        while(i<n1){
            l3.add(l1.get(i));
            i++;
        }
        while(j<n2){
            l3.add(l2.get(j));
            j++;
        }
        return l3;
    }
    static List<Integer> readList(){
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter the number of elements : ");
        int n = scan.nextInt();
        System.out.println("Enter "+n+" elements : ");
        for(int i = 0;i<n;i++){
            int element = scan.nextInt();
            list.add(element);
        }
        return list;
    }
    static void printArray(List<Integer> list){
        for (int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        System.out.print("Enter number of Lists : ");
        int k = scan.nextInt();
        for(int i =0;i<k;i++){
            lists.add(readList());
        }
        List<Integer> result = new ArrayList<Integer>();
        result = lists.get(0);
        for(int i = 1;i<k;i++){
            result = merge(result,lists.get(i));
        }
        printArray(result);
    }
}