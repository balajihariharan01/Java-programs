import java.util.*;

class LargestArray
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Size of an array:");
int n=scan.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=scan.nextInt();
}
int largest=arr[0];
for(int i=0;i<n;i++)
{
if(arr[i]>largest)
largest=arr[i];
}
System.out.println("Largest element in an array : "+largest);
}
}