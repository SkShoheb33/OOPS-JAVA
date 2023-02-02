import java.lang.*;
import java.util.*;

class Merge2List{
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
    static void printArray(List<Integer> list){
        for (int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter list 1 size : ");
        n1 = scan.nextInt();
        System.out.println("Enter list 2 size : ");
        n2 = scan.nextInt();
        System.out.println("Enter list 1 elements : ");
        for(int i = 0;i<n1;i++){
            int ele = scan.nextInt();
            l1.add(ele);
        }
        System.out.println("Enter lsit 2 elements : ");
        for(int i = 0;i<n2;i++){
            int ele = scan.nextInt();
            l2.add(ele);
        }
        printArray(l1);
        printArray(l2);
        printArray(merge(l1,l2));
    }
}