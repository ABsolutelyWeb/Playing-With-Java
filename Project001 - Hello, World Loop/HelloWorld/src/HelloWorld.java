/**
 * Created by Abhi on 6/29/2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int world = 1;
        while (world <= 10){
            System.out.print("Hello there for the " + world);
            if (world == 1) {
                System.out.print("st");
            }else if (world == 2){
                System.out.print("nd");
            }else if (world == 3){
                System.out.print("rd");
            }else{
                System.out.print("th");
            }
            System.out.println(" time, world!");
            world++;
        }
    }
}

/*
    OUTPUT:
        Hello there for the 1st time, world!
        Hello there for the 2nd time, world!
        Hello there for the 3rd time, world!
        Hello there for the 4th time, world!
        Hello there for the 5th time, world!
        Hello there for the 6th time, world!
        Hello there for the 7th time, world!
        Hello there for the 8th time, world!
        Hello there for the 9th time, world!
        Hello there for the 10th time, world!

Process finished with exit code 0

 */