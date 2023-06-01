package kioskMyself;

import java.util.ArrayList;
import java.util.Scanner;

public class Screen {
    static Scanner scanner = new Scanner(System.in);
    static String setTop(){
        String a = "\"Mcdonalds 에 오신것을 환영합니다.\"";
        String b = "아래 메뉴판을 보시고 원하는 메뉴를 골라 입력해주세요.";
        String c = "";
        return a + "\n" + b + "\n" + c;
    }

    // 홈화면 출력
    public void home(){
        System.out.println(setTop());
        System.out.println(" [ Mcdonalds MENU ] ");

        Menu menu = new Menu();

        String burger = menu.mainInput("Burger","순쇠고기패티와 통살치킨으로 만든 버거");
        String side = menu.mainInput("Side & Dessert","주문즉시 매장에서 만드는 사이드");
        String drink = menu.mainInput("Drink", "주문즉시 매장에서 만드는 신선한 음료");
        String cart = menu.mainInput("Order", "장바구니를 확인 후 주문합니다.");
        String cancel = menu.mainInput("Cancel", "진행중인 주문을 취소하고 초기화 합니다.");

        ArrayList<String> mainArr = new ArrayList<>();

        mainArr.add(burger);
        mainArr.add(side);
        mainArr.add(drink);
        mainArr.add(cart);
        mainArr.add(cancel);

        for (int i=0; i<3; i++){
            int n = i+1;
            System.out.println(n + ". " + mainArr.get(i));
        }

        System.out.println("");
        System.out.println("[ ORDER MENU ]");

        for (int i=3; i<mainArr.size(); i++){
            int n = i+1;
            System.out.println(n + ". " + mainArr.get(i));
        }
    }


    // 버거메뉴 출력
    public void burgerMenu(){
        System.out.println(setTop());
        System.out.println(" [ Burgers MENU ] ");

        Product burger = new Product();

        String BigMac = burger.productInput("Big Mac", 6.0, "순 쇠고기 패티 두 장, 빅맥소스, 치즈, 피클, 양파, 양상추");
        String fiftyFiveBurg = burger.productInput("1955 Burger", 7.2, "두툼한 순 쇠소기 패티, 1955소스, 그릴드어니언, 토마토, 베이컨, 양상추");
        String shanghaiBurg = burger.productInput("McSpicy Shanghai", 6.0, "매콤한시즈닝을 입힌 통닭가슴살 패티, 화이트마요소스, 토마토, 양상추");
        String baconTomato = burger.productInput("Bacon Tomato Deluxe", 6.6, "순 쇠고기 패티 두 장, 베이컨, 토마토, 양상추, 스위트 칠리 소스, 치즈, 마요네즈");
        String cheese = burger.productInput("Quater Pounder Cheese", 6.3, "투툼한 순 쇠고기 패티, 치즈 두 장, 피클, 케찹, 양파");

        ArrayList<String> burgerList = new ArrayList<>();

        burgerList.add(BigMac);
        burgerList.add(fiftyFiveBurg);
        burgerList.add(shanghaiBurg);
        burgerList.add(baconTomato);
        burgerList.add(cheese);

        for(int i=0; i<burgerList.size(); i++){
            int n = i+1;
            System.out.println(n + ". " + burgerList.get(i));

        }
    }


    // 사이드메뉴 출력
    public void sideMenu(){
        System.out.println(setTop());
        System.out.println(" [ Side & Dessert MENU ] ");

        Product side = new Product();

        String snackWrap = side.productInput("Chicken Snack Wrap", 3.5, "또띠아, 매콤한 치킨, 화이트 마요소스, 베이컨, 양상추");
        String twoMacWings = side.productInput("MacWings 2Pc", 4.0, "겉바속촉 치킨 윙");
        String fourMacWings = side.productInput("MacWings 4Pc", 6.7, "겉바속촉 치킨 윙");
        String cheeseSticks = side.productInput("Cheese Sticks 2Pc", 3.3, "황금빛 바삭한 치즈스틱");
        String nuggerts = side.productInput("McNuggerts 4Pc", 3.3, "소스와 함께 즐기는 치킨너겟");

        ArrayList<String> sideList = new ArrayList<>();

        sideList.add(snackWrap);
        sideList.add(twoMacWings);
        sideList.add(fourMacWings);
        sideList.add(cheeseSticks);
        sideList.add(nuggerts);

        for(int i=0; i<sideList.size(); i++){
            int n = i+1;
            System.out.println(n + ". " + sideList.get(i));
        }
    }


    // 음료메뉴 출력
    public void drinkMenu(){
        System.out.println(setTop());
        System.out.println(" [ Drink MENU ] ");

        Product drink = new Product();

        String cola = drink.productInput("Coca Cola, Sprite", 2.4, "코카콜라 or 스트라이트");
        String americano = drink.productInput("Iced Americano", 3.3, "바로내린 아이스 아메리카노");
        String cafeLatte = drink.productInput("Iced Cafe Latte", 4.0, "신선한 우유를 만난 카페라떼");
        String cappuccino = drink.productInput("Cappuccino", 4.0, "갓 만든 우유거품으로 부드럽게");
        String shake = drink.productInput("Vanilla Shake", 3.5, "신선한 우유에 달콤한 바닐라시럽");

        ArrayList<String> drinkList = new ArrayList<>();

        drinkList.add(cola);
        drinkList.add(americano);
        drinkList.add(cafeLatte);
        drinkList.add(cappuccino);
        drinkList.add(shake);

        for(int i=0; i<drinkList.size(); i++){
            int n = i+1;
            System.out.println(n + ". " + drinkList.get(i));
        }
    }
}
