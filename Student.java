import java.util.Scanner;
class Student
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number:");
        int a=sc.nextInt();
               System.out.println("enter a second number:");
        int b=sc.nextInt();
                System.out.println("enter a third number:");
        int c=sc.nextInt();
        System.out.println("result"+(a+b-c));
    System.out.println("enter a student details:");
    sc.nextLine();
    System.out.println("enter a student name:");
    String name=sc.next();
    System.out.println("enter student age:");
    int age=sc.nextInt();
    sc.nextLine();
    System.out.println("enter student class:");
    String s=sc.next();
    System.out.println("enter student place:");
    String r=sc.next();
    System.out.println("name:"+name);
    System.out.println("age:"+age);
    System.out.println("class:"+s);
    System.out.println("place:"+r);
}
}