import java.util.Random;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


        flipNHeads(3);
        clock();


    }
    public static String pluralize(String ani,int n){
        if(n==0 || n>1)
        {
            return ani+'s';
        }
        else if(n==1)
        {
            return ani;
        }
        return "";
    }
    public static void flipNHeads(int n){
        int count=0;
        int countHead=0;
        Random rand = new Random();
        float float_random;
        while (countHead<n){
            float_random=rand.nextFloat();
            if(float_random<0.5)
            {
                System.out.println("tail");
            }
            else if(float_random>0.5)
            {
                System.out.println("heads");
                countHead++;
            }
            count++;
        }
        System.out.println("It took "+count+" flips to flip "+n+" heads in a row.");
    }

    public static void clock(){
        LocalDateTime now=LocalDateTime.now();
        int CurrentSecond = now.getSecond();
        while (true){
            now=LocalDateTime.now();
            int newSecond=now.getSecond();
            if(CurrentSecond!=newSecond)
            {
                System.out.println(now.getHour()+":"+ now.getMinute()+":"+ now.getSecond());
                CurrentSecond=now.getSecond();
            }
        }
    }
}