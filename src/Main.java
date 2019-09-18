import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> therapy = new ArrayList<>();

        System.out.println("Hello. What is your problem? Enter your response here or Q to quit: ");
        String response = keyboard.nextLine();
        therapy.add(response);

        while  (!response.equalsIgnoreCase("q")){
            System.out.println(response);

                System.out.println("Enter your response here");
                response = keyboard.nextLine();
                therapy.add(response);

                if (response.equalsIgnoreCase("I am feeling great")){
                    System.out.println("END");
                    break;
                }

        }


    }}

