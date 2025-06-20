package linear_search;

public class maximumWealth {
    public static void main(String[] args) {
        int[][] arr={
            {200,30000,4679},
            {565,67695,87665},
            {5674,987,56432}
        };
        MaximumWealth(arr);
    }
    static void MaximumWealth(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for(int[] person:arr){
            int sum=0;
            for(int account:person){
                sum += account;
            }
            if(sum>ans){
                ans=sum;
            }
        }
        System.out.println("Maximum wealth is : "+ans);

    }
}
