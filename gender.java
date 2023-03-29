import java.util.Scanner;
class gender
{
 char gen;
 public static void main(String aa[])
 {
  Scanner s=new Scanner(System.in);
  gender g=new gender();
  System.out.println("Input:");
  g.gen=s.next().charAt(0);
  switch(g.gen)
  {
   case'm':System.out.println("Male");
           break;
   case'f':System.out.println("Female");
           break;
   case't':System.out.println("Transgender");
           break;
   default:System.out.println("You are not human");
  }
 }
}