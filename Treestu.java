

import java.util.TreeSet;

public class Treestu {
    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(75);
        marks.add(90);
        marks.add(65);
        marks.add(85);
        marks.add(95);
        marks.add(75);
        marks.add(80);

        System.out.println("TreeSet: " + marks);

        System.out.println("Lowest marks: " + marks.first());

        System.out.println("Highest marks: " + marks.last());

        marks.remove(75);

        System.out.println("Contain 90: " + marks.contains(90));

        System.out.println("TreeSet: " + marks);
    }
}
