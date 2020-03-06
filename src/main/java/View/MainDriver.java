package View;

import Model.CustomCollection;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        CustomCollection list = new CustomCollection();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\nEnter 1 to insert Element \n2 To Delete \n3 to Find \n4 to Print\n");
            int choice = scanner.nextInt();
            switch (choice){
                case (1):{
                    list.add(scanner.nextInt());
                    break;
                }
                case(2):{
                    list.remove(scanner.nextInt());
                    break;
                }
                case (3):{
                    int find = scanner.nextInt();
                    System.out.println("Index of " + find + " is " + list.find(find));
                }
                case(4):{
                    list.print();
                    break;
                }
                default:
                    System.exit(1);
            }

        }

    }
}
