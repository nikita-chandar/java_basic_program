package com.company;
import java.util.Scanner;
public class if_else
{
 public static void main(String args[])
{
   Scanner in=new Scanner(System.in);
System.out.println("enter the age");
 int age=in.nextInt();
Scanner obj=new Scanner(System.in);
System.out.println("Enter the name");
String name=obj.nextLine();
Scanner myobj=new Scanner(System.in);
System.out.println("Enter the salary");
double salary=myobj.nextDouble();

   




System.out.println("age:" +age);


System.out.println("name:" +name);  

System.out.println("salary:" +salary);
if(age>18)
{
System.out.println("ram has permission to drive the car");

}
else
{
  System.out.println("ram does not have permission to drive the car");
}
  

}



}