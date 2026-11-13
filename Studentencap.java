import java.util.*;
class Student{
    private int id=0;
    void getter(){
        System.out.println(id);
    }
    void setter(int num){
        id=num;
    }
 }
 class Studentencap{
    public static void main(String[] args){
        Student us=new Student();
        us.setter(101);
        us.getter();
    }
 }
