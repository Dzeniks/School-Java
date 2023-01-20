public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        


        Post p1 = new Post();
        p1.CreatePackage("Brno", 100);
        p1.CreatePackage("Praha",10);
        p1.CreatePackage("Olomouc", 5);

        p1.deliverPackage("1");
        
        showPackages(p1);

    }

    public static void showPackages(Post post){
        for (Package package1 : post.getPackages()) {
            System.out.println(package1);
        }
    }
}
