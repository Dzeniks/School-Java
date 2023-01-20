
public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        // Add some elements to the list
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Orange");
        
        list.add(128);
        list.add(3.1415);
        list.add(64);


        System.out.println("Size: " + list.size());
        System.out.println("Element at index 5: " + list.get(5));
        System.out.println("toString: " + list.toString());

        
        list.remove(5);
        System.out.println("Size: " + list.size());
        System.out.println("Element at index 5: " + list.get(5));
        System.out.println("toString: " + list.toString());

    }
}


