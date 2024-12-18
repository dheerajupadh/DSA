import java.util.ArrayList;

public class SubSets {
    static ArrayList<ArrayList<Integer>> arrayListTotal = new ArrayList<>();
    public static void main(String[] args) {
        boolean[] bool = new boolean[10];
        int[] arr = {1,2,3};
        calculateSubsets(arr,new ArrayList<>(),0);
        for(ArrayList arr1: arrayListTotal){
            System.out.print(arr1);
        }
    }

    public static void calculateSubsets(int[] arr, ArrayList<Integer> arrayList,int i){
        if(i == arr.length){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int a:arrayList){
                temp.add(a);
            }
            arrayListTotal.add(temp);
            return;
        }

                arrayList.add(arr[i]);
                calculateSubsets(arr,arrayList,i+1);
                arrayList.remove(arrayList.size()-1);
                calculateSubsets(arr,arrayList,i+1);


        }
}
