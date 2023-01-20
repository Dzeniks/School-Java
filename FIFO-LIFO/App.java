public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        myFIFO<String> FiFo = new myFIFO<String>(); 

        for(int i = 0; i < 15; i++){
            FiFo.add(Integer.toString(i));
        }


        System.out.println(FiFo.toString());
        System.out.println(FiFo.GetSize());


        myLIFO<String> LiFo = new myLIFO<String>();

        for(int i = 0; i < 12; i++){
            LiFo.add(Integer.toString(i));
        }

        System.out.println(LiFo.toString());
        System.out.println(LiFo.GetSize());

    }
}
