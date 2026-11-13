import java.util.HashMap;
public class Stuhashmap{
    public static void main(String[] args){
        HashMap<Integer,String> students=new HashMap<>();
        students.put(101,"John");
        students.put(102,"Alice");
        students.put(103,"David");
        students.put(104,"Robert");
        students.put(105,"Joseph");
        System.out.println("HashMap:"+students);
        System.out.println("Student 102:"+students.get(102));
        students.put(102,"Peter");
        students.remove(103);
        System.out.println("Contain Key 101:"+students.containsKey(101));
        System.out.println("Contain Values John:"+students.containsValue("John"));
        System.out.println("Size:"+students.size());
        System.out.println("student id:"+students.keySet());
        System.out.println("student values:"+students.values());
    }
}