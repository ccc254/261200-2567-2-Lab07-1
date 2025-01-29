import com.sun.source.tree.Tree;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            System.out.println();
    System.out.println("Hello and welcome! " + args[0] + " " + args[1] + " " + args[2]);

            System.out.println();
    //TODO ArrayList
    List<String> aList = new ArrayList<>();
    for (int i=0; i < args.length; i++)
        aList.add(args[i]);
    System.out.println(aList);
    Collections.shuffle(aList, new Random());
    System.out.println(aList);
    //System.out.println(args[2]);

            System.out.println();

        //TODO HashSet
        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        hSet.remove("GG"); //GG ออกหมด
        //hSet.clear(); // เหลือ[] ลบสมาชิกในเซต
        //hSet.removeAll(dheshhhs) remove ที่ทำได้หลายตัวพร้อมกัน
        System.out.println(hSet);

            System.out.println();

        //TODO TreeSet
        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("ZZZ");
        sSet.add("123");
        sSet.add("กขค");
        System.out.println(sSet);

            System.out.println();

        //TODO Stack
        Stack<String> stacko = new Stack<>();
        //stacko.add("1");
        stacko.push("a");
        stacko.push("b");
        stacko.push("c");
        System.out.println(stacko); // [a, b, c]
        System.out.println(stacko.pop());// c print ตัวที่เอาออก
        System.out.println(stacko); //[a, b]
        stacko.pop(); //เอาตัวหลังสุดออก (บนสุด)
        System.out.println(stacko); //[a]

            System.out.println();

        //TODO HashMap
        Map<String, Color> favoriteColors = new HashMap<String, Color>();
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);

        favoriteColors.put("Robert", Color.BLACK);
        favoriteColors.put("Mark", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cole", Color.BLUE);
        System.out.println(favoriteColors);

        Set<String> keySet = favoriteColors.keySet();
        for (String key : keySet)
        {
            Color value = favoriteColors.get(key);
            System.out.println(key + " : " + value);
        }

            System.out.println();

        //TODO TreeMap
        Map<String, Color> Colors = new TreeMap<String, Color>();

        Colors.put("Juliet", Color.BLUE); //3
        Colors.put("Romeo", Color.GREEN); //4
        Colors.put("Adam", Color.RED); //1
        Colors.put("Eve", Color.BLUE); //2

        Colors.put("Robert", Color.BLACK);
        Colors.put("Mark", Color.WHITE);
        Colors.put("Pedro", Color.YELLOW);
        Colors.put("Cole", Color.BLUE);
        System.out.println(Colors);

        Set<String> kSet = Colors.keySet();
        for (String key : kSet)
        {
            Color value = Colors.get(key);
            System.out.println(key + " : " + value);
        }

        System.out.println();

    }
}