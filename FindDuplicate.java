public class FindDuplicate
{
public static int findDuplicate(int[]nums)
{
int number1= nums[0];
int number2=nums[0];
do
{
number1 = nums[number1];
number2 = nums[nums[number2]];
}
while (number1 != number2);
number1 = nums[0];
while(number1 != number2)
{
number1 = nums[number1];
number2 = nums[number2];
}
return number1;
}
public static void main(String args[]){
int[]arr ={3,1,3,4,2};
System.out.println("The duplicate number is :"+findDuplicate(arr));

}
}