import java.util.Scanner;
class stringFun{
public static void main(String args[])
{
int ch;
char c='y';
String str1,str2;
while(c=='y')
{
System.out.println("Press 1 for find the length of the string");
System.out.println("Press 2 for find the character at given position");
System.out.println("Press 3 for find the lower case of the given string");
System.out.println("Press 4 for find the upper case of the given string");
System.out.println("Press 5 for adding to string in one");
System.out.println("Press 6 for find that the given two strings are equal or not (for same case)");
System.out.println("Press 7 for find that the given two strings are equal or not (case is no matter)");
System.out.println("Press 8 for comparing two string");
System.out.println("Press 9 for checking the last word");
System.out.println("Press 10 for checking the first word");
System.out.print("Enter your choice:");
Scanner sc = new Scanner(System.in);
ch =  sc.nextInt();
sc.nextLine();//to avoid buffer memory exception
switch(ch){
case 1:  System.out.print("Enter the string:");
         str1=sc.nextLine();
         System.out.println(str1.length()); 
         break;
case 2:  System.out.print("Enter the string:");
         str1=sc.nextLine();
         System.out.print("Enter the position which character you want:");
         int x=sc.nextInt();
         System.out.println(str1.charAt(x-1)); 
         break;  
case 3:  System.out.print("Enter the string:");
         str1=sc.nextLine();
         System.out.println("Lower case:"+str1.toLowerCase()); 
         break;
case 4:  System.out.print("Enter the string:");
         str1=sc.nextLine();
         System.out.println("Upper case"+str1.toUpperCase()); 
         break;
case 5:  System.out.print("Enter the first string:");
         str1=sc.nextLine();
         System.out.print("Enter the second string:");
         str2=sc.nextLine(); 
         System.out.println(str1.concat(str2)); 
         break;
case 6:  System.out.print("Enter the first string:");
         str1=sc.nextLine();
         System.out.print("Enter the second string:");
         str2=sc.nextLine();
         System.out.println(str1.equals(str2)); 
         break;
case 7:  System.out.print("Enter the first string:");
         str1=sc.nextLine();
         System.out.print("Enter the second string:");
         str2=sc.nextLine();
         System.out.println(str1.equalsIgnoreCase(str2)); 
         break;
case 8:  System.out.print("Enter the first string:");
         str1=sc.nextLine();
         System.out.print("Enter the second string:");
         str2=sc.nextLine();
         System.out.println(str1.compareTo(str2)); 
         break;
case 9:  System.out.print("Enter the first string:");
         str1=sc.nextLine();
         System.out.print("Enter the word:");
         str2=sc.nextLine();
         System.out.println(str1.endsWith(str2)); 
         break;
case 10: System.out.print("Enter the first string:");
         str1=sc.nextLine();
         System.out.print("Enter the word:");
         str2=sc.nextLine();
         System.out.println(str1.startsWith(str2)); 
         break;
default: System.out.println("Please Enter valid number between 1 to 10 "); 
}
System.out.print("Enter 'y' for continue:");
c=sc.next().charAt(0);
}
}
}
