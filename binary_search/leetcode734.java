package binary_search;

public class leetcode734 {
    public static void main(String[] args) {
      char[] letters={'c','f','j'};
      System.out.println(nextGreatestLetter(letters, 'f'));  
    }
    static char nextGreatestLetter(char[] letters, char target) {
         int start =0;
         int end= letters.length-1;
         while(start<=end){
            int mid = start+(end-start)/2;
            
                if(letters[mid]>target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

         }
         return letters[start % letters.length];
    }
}
