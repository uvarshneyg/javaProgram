import java.util.Scanner;
class operator
{
 public static void main(String aa[])
 {
  Scanner sc=new Scanner(System.in);
  int num1,num2,ch;
  char c='y';
  while(c=='y')
  {
  System.out.println("Press 1 for Unary operator");
  System.out.println("Press 2 for Arithmetic operator");
  System.out.println("Press 3 for Shift operator");
  System.out.println("Press 4 for Relational operator");
  System.out.println("Press 5 for Bitwise operator");
  System.out.println("Press 6 for Logical operator");
  System.out.println("Press 7 for Ternary operator");
  System.out.println("Press 8 for Exit"); 
  System.out.print("Enter your choice:");
  ch=sc.nextInt();
  switch(ch)
  {
   case 1: System.out.print("Enter the number:");
                 num1=sc.nextInt();
                System.out.println("Press 1 for Postfix operator");
                System.out.println("Press 2 for Prefix operator");
                System.out.print("Enter your choice:");
                ch=sc.nextInt();
                switch(ch)
               {
                case 1:System.out.println("Postfix of the number:"+(num1++));
                             break;
                case 2:System.out.println("Prefix of the number:"+(++num1));
                             break;
               default:System.out.println("Wrong choice");
              }
              break;
   case 2: System.out.print("Enter the first number:");
                 num1=sc.nextInt();
                System.out.print("Enter the second number:");
                num2=sc.nextInt();
                System.out.println("Press 1 for Multiply");
                System.out.println("Press 2 for Division");
                System.out.println("Press 3 for Addition");
                System.out.println("Press 4 for Subtraction");
                System.out.println("Press 5 for Modulus");
                System.out.print("Enter your choice:");
                ch=sc.nextInt();
                switch(ch)
                {
                 case 1:System.out.println("Multiply:"+(num1*num2));
                              break; 
                 case 2:System.out.println("Division:"+(num1/num2));
                              break;
                 case 3:System.out.println("Addition:"+(num1+num2));
                              break;
                 case 4:System.out.println("Subtraction:"+(num1-num2));
                              break;
                 case 5:System.out.println("Modulus:"+(num1%num2));
                             break;
                default:System.out.println("Wrong choice");
              }
              break;
   case 3: System.out.print("Enter the first number:");
                num1=sc.nextInt();
                System.out.print("Enter the second number:");
                num2=sc.nextInt();
                System.out.println("Press 1 for Right Shift");
                System.out.println("Press 2 for Left Shift");
                System.out.print("Enter your choice:");
                ch=sc.nextInt();
                switch(ch)
               {
                case 1:System.out.println("Right Shift:"+(num1<<num2));
                             break; 
                case 2:System.out.println("Left Shift:"+(num1>>num2));
                             break;
               default:System.out.println("Wrong choice");
              }
              break;
   case 4: System.out.print("Enter the first number:");
                 num1=sc.nextInt();
                 System.out.print("Enter the second number:");
                 num2=sc.nextInt();
                 if(num1==num2)
                 System.out.println("Both number are equal");
                 if(num1>num2)
                     System.out.println("First number is greater than Second"); 
                 else
                     System.out.println("Second number is greater than First"); 
                break;
   case 5: System.out.print("Enter the first number:");
                 num1=sc.nextInt();
                System.out.print("Enter the second number:");
                num2=sc.nextInt();
                System.out.println("Press 1 for Bitwise And");
                System.out.println("Press 2 for Bitwise Or");
                System.out.print("Enter your choice:");
                ch=sc.nextInt();
                switch(ch)
                {
                 case 1:System.out.println(num1<num2&num1>num2);
                              break; 
                 case 2:System.out.println(num1<num2|num1>num2);
                              break;
                 default:System.out.println("Wrong choice");
                }
              break;
   case 6: System.out.print("Enter the first number:");
                 num1=sc.nextInt();
                 System.out.print("Enter the second number:");
                 num2=sc.nextInt();
                 System.out.println("Press 1 for Logical And");
                 System.out.println("Press 2 for Logical Or");
                 System.out.print("Enter your choice:");
                 ch=sc.nextInt();
                 switch(ch)
                 {
                  case 1:System.out.println(num1<num2&&num1>num2);
                               break; 
                  case 2:System.out.println(num1<num2||num1>num2);
                               break;
                 default:System.out.println("Wrong choice");
                }
                break;
   case 7: System.out.print("Enter the first number:");
                 num1=sc.nextInt();
                System.out.print("Enter the second number:");
                num2=sc.nextInt();
                System.out.println((num1<num2)?"num1 is greater":"num2 is greater");
                break;
  default: System.out.println("Wrong choice"); 
  }
 System.out.println("For continue press 'y'");
 c=sc.next().charAt(0);
 }
 }
}