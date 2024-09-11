public class MissingNumber
{
public static int findMissingNumber(int[]arr,int n)
{
int totalsum = n*(n+1)/2;
int arrSum = 0;
for (int num : arr)
{
arrSum += num;
}
return totalsum - arrSum;
}
public static void main(String args[])
{
int[] arr = {1,2,4,5,6};
int n= 6;
int missingNumber = findMissingNumber(arr,n);
System.out.println("The missing number is:"+missingNumber);

}
}