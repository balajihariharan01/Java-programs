import java.util.*;

class SlargestArray
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
int second=-1;
for(int i=0;i<n;i++)
{
if(arr[i]>second && arr[i]!=largest)
second=arr[i];
}
System.out.println("1st Largest element in an array : "+largest);
System.out.println("2nd Largest element in an array : "+second);
}
}