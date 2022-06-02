package linkedlists;
import java.util.*;

class ll_llclass {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("dexboiii");
        list.addFirst("so called");
        list.addFirst("I'm");

        System.out.println(list);

        list.add(2, "as");
        System.out.println(list);
}

}
