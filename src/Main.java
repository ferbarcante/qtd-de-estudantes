import entities.Course;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int indentifier = 0;

        Set<Course> set = new HashSet<>();

        System.out.println("How many students for course A? ");
        int qtd = scan.nextInt();

        for(int i = qtd; i>0; i--){
            indentifier = scan.nextInt();
            set.add(new Course(indentifier));
        }

        System.out.println("How many students for course B?");
        qtd = scan.nextInt();

        for(int i = qtd; i>0; i--){
            indentifier = scan.nextInt();
            set.add(new Course(indentifier));
        }

        System.out.println("How many student for course C?");
        qtd = scan.nextInt();

        for(int i = qtd; i>0; i--){
            indentifier = scan.nextInt();
            set.add(new Course(indentifier));
        }

        System.out.println("Total students: " + set.size());


    }
}