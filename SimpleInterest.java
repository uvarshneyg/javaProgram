import java.util.Scanner;
class SimpleInterest{
double p,r,t,si;
public static void main(String aa[])
{
 Scanner s=new Scanner(System.in);
 SimpleInterest obj=new SimpleInterest();
 System.out.println("Enter the amount:");
 obj.p=s.nextFloat();
 System.out.println("Enter the rate:");
 obj.r=s.nextFloat();
 System.out.println("Enter the time:");
 obj.t=s.nextFloat();
 obj.si=((obj.p*obj.r*obj.t)/100);
 System.out.println("SimpleInterest="+obj.si);
}
}
 
