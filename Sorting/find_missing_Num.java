package Sorting;
public class find_missing_Num {
    public static void main(String[] args) {
        int[] arr2={0,2,3,4,1};
        System.out.println(find0_N(arr2));
    }
    static int find0_N(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
