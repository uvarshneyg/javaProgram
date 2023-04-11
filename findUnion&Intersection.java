import java.util.Scanner;
class findUnion{
public static void main(String aa[])
{
 Scanner sc=new Scanner(System.in);
 int arr1[],arr2[],arr3[],i,j,k,count=0;
 arr1=new int[5];
 arr2=new int[5];
 arr3=new int[10];
 System.out.println("Enter first array:");
 for(i=0;i<5;i++)
 arr1[i]=sc.nextInt();
 System.out.println("Enter second array:");
 for(i=0;i<5;i++)
 arr2[i]=sc.nextInt();
 for(i=0;i<5;i++)
 {
  for(j=0;j<5;j++)
  {
   if(arr1[i]==arr2[j])
   {
    for(k=0;k<5;k++)
    {
     if(arr3[k]==arr1[i])
     break;
     else if(count==k)
     {
      arr3[count]=arr1[i]; 
      count++;
      break;
     }
    }
   }
  }
 }
 System.out.println("Intersection:");
 for(i=0;i<count;i++)
 System.out.println(arr3[i]);
 for(i=0;i<5;i++)
 {
  for(j=0;j<count;j++)
  {
   if(arr1[i]==arr3[j])
   break;
  }
  if(j==count)
  {
   arr3[count]=arr1[i];
   count++;
  }
 }
 for(i=0;i<5;i++)
 {
  for(j=0;j<count;j++)
  {
   if(arr2[i]==arr3[j])
   break;
  }
  if(j==count)
  {
   arr3[count]=arr2[i];
   count++;
  }
 }
 System.out.println("Union:");
 for(i=0;i<count;i++)
 System.out.println(arr3[i]);
}
}
