import java.util.Scanner;
class swap
{
 int a;
 int b;
 public static void main(String aa[])
 {
  Scanner s=new Scanner(System.in);
  swap obj=new swap();
  System.out.println("Enter the value of a:");
  obj.a=s.nextInt();
  System.out.println("Enter the value of b:");
  obj.b=s.nextInt();
  obj.a=obj.a+obj.b;
  obj.b=obj.a-obj.b;
  obj.a=obj.a-obj.b;
  System.out.println("a:"+obj.a+"  "+"b:"+obj.b);
 }
}