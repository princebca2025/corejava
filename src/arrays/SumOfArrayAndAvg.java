package arrays;

public class SumOfArrayAndAvg {
    public static void main(String[] args) {
        int[] arr={17,23,56,77,65,43,32};
                int sum=0,avg=0;
                for (int i=0;i< arr.length;i++)
                {
                    sum =sum+arr[i];
                }
        System.out.println(sum);
    }
}
