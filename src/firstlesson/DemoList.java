package firstlesson;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(73);
        list.add(-8);
        list.add(0, 56);

        list.remove(3);
      //  System.out.println(list.size());


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        //Ctrl + D

        List<String> list1 = new ArrayList<>();
        list1.add("frgh");
        list1.add("hello");
        list1.add("frt");
        list1.remove("hello");

        list1.remove(0);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("-----------");
        printReverse(list1);

        list1.add("a");
        list1.add("b");
        list1.add("c");
    }


    public static void printReverse( List<String> list1) {
        for (int i = list1.size() - 1; i >= 0 ; i--) {
            System.out.println(list1.get(i));
        }
    }
}
