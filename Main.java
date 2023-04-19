package third_modul.third;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        map.put(100, "100");
        map.put(65, "65");
        map.put(28, "28");
        map.put(2, "2");
        map.put(34, "34");
        map.put(79, "79");
        map.put(1, "1");
        map.put(565, "565");
        map.put(33, "33");
        map.put(97, "97");
        map.printTree();
        map.remove(2);
        map.printTree();
    }
}
