import java.util.*;
class QuickSort{

    
    static int partition(List<Integer> list,int l,int r){
        int i =0,j =0 ;
        int pivot = l;
        while(l<r){
            do{
                l++;
            }while(l<r && list.get(l)<list.get(pivot));
            do{
               r--; 
            }while(l<r && list.get(r)>list.get(pivot));
            if(l<r){
                int temp = list.get(l);
                list.set(l,list.get(r));
                list.set(r,temp);
            }
        }
        int temp = list.get(r);
        list.set(r,list.get(pivot));
        list.set(pivot,temp);       
        return r; 
    }


    static List<Integer> sort(List<Integer> list,int i,int j){
        if(i<j){
            int index = partition(list,i,j);
            sort(list,i,index-1);
            sort(list,index+1,j);
        }
        return list;
    }


    static void printArray(List<Integer> list){
        for (int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    static List<Integer> l = new ArrayList<Integer>(); 
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // int i = 0;
        for(int i = 0;i<n;i++){
            int element = scan.nextInt();
            l.add(element);
        }
        l = sort(l,0,n);
        printArray(l);
    }
}