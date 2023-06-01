package kioskMyself;

import java.util.Scanner;

public class Kiosk {
     static void kiosk(){
         Screen screen = new Screen();

         screen.home();

         Scanner scanner = new Scanner(System.in);
         int homeInput = scanner.nextInt();

         if(homeInput == 1){
             screen.burgerMenu();
             int burgerInput = scanner.nextInt();
         } else if (homeInput == 2){
             screen.sideMenu();
         } else if (homeInput == 3){
             screen.drinkMenu();
         }
     }
}

