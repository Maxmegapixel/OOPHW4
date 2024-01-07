import list.MyArrayList;
import list.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(5);
        list.add(7);
        list.add(-1);
        list.add(2);
        System.out.println(list);
        System.out.println(list.size());
        list.delete(1);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));

    }
}
