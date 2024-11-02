import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Andrzej");
        hashSet.add("Bartek");
        hashSet.add("Cezary");
        hashSet.add("Dariusz");
        hashSet.add("Edward");
        hashSet.add("Filip");
        hashSet.add("Grzegorz");
        hashSet.add("Henryk");
        hashSet.add("Ignacy");
        hashSet.add("Jan");
        System.out.println(hashSet);
        var newHash = HashSet.newHashSet(10);
        newHash.add(1);
        newHash.add("Andrzej");

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(4);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Andrzej");
        treeSet.add("Bartek");
        treeSet.add("Cezary");
        treeSet.add("Dariusz");
        treeSet.add("Edward");
        treeSet.add("Filip");
        treeSet.add("Grzegorz");
        treeSet.add("Henryk");
        treeSet.add("Ignacy");
        treeSet.add("Jan");
        System.out.println(treeSet);
    }
}