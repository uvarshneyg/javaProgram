import java.util.Scanner;
class voting
{
 int age;
 public static void main(String aa[])
 {
  Scanner s=new Scanner(System.in);
  voting v=new voting();
  System.out.println("Enter your age:");
  v.age=s.nextInt();
  System.out.println((v.age<18)?"You are not eligible for voting":"You are eligible for voting");
 }
}