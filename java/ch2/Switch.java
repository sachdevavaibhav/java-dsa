package ch2;

import java.util.Scanner;

public class Switch {
        public static void main(String[] args) {
            int x=0, y=0;
            Scanner sc = new Scanner(System.in);
            char move = sc.next().charAt(0);
            sc.close();
            switch (move) {
                case 'A':
                    x--;
                    break; // the break statement will stop the execution of switch here and get out of the switch block otherwise it will still run the logic under it (whether case under it matches or not).
                case 'D':
                    x++;
                    break;
                case 'W':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                default:
                    System.out.println("Invalid Move!");
            }
            System.out.println(x + " " + y);
        }
}
