package kioskWithReference;

import java.util.Scanner;

class Product extends Menu {
    double price; // 가격

    public String toString() {
        return name + " | W : " + price + " | " + explain;
    }

    Product() {
    }

    Product(String a, String b, double c) {
        super(a, b);
        this.price = c;
    }

    /// [Burgers]
    static Product bigMac = new Product("Big Mac", "순 쇠고기 패티 두 장, 빅맥소스, 치즈, 피클, 양파, 양상추", 6.0);
    static Product fiftyFiveBurg = new Product("1955 Burger", "두툼한 순 쇠소기 패티, 1955소스, 그릴드어니언, 토마토, 베이컨, 양상추", 7.2);
    static Product shanghai = new Product("McSpicy Shanghai", "매콤한시즈닝을 입힌 통닭가슴살 패티, 화이트마요소스, 토마토, 양상추", 6.0);
    static Product tomatoDeluxe = new Product("Bacon Tomato Deluxe", "순 쇠고기 패티 두 장, 베이컨, 토마토, 양상추, 스위트 칠리 소스, 치즈, 마요네즈", 6.6);
    static Product cheese = new Product("Quater Pounder Cheese", "투툼한 순 쇠고기 패티, 치즈 두 장, 피클, 케찹, 양파", 6.3);
    /// [Side & Dessert]
    static Product snackWrap = new Product("Chicken Snack Wrap", "또띠아, 매콤한 치킨, 화이트 마요소스, 베이컨, 양상추", 3.5);
    static Product twoMacWings = new Product("MacWings 2Pc", "겉바속촉 치킨 윙", 4.0);
    static Product fourMacWings = new Product("MacWings 4Pc", "겉바속촉 치킨 윙", 6.7);
    static Product cheeseSticks = new Product("Cheese Sticks 2Pc", "황금빛 바삭한 치즈스틱", 3.3);
    static Product nuggerts = new Product("McNuggerts 4Pc", "소스와 함께 즐기는 치킨너겟", 3.3);
    /// [Drinks]
    static Product cokeSprite = new Product("Coca Cola, Sprite", "코카콜라와 스프라이트", 2.4);
    static Product americano = new Product("Iced Americano", "바로내린 아이스 아메리카노", 3.3);
    static Product latte = new Product("Iced Cafe Latte", "신선한 우유를 만난 카페라떼", 4.0);
    static Product cappuccino = new Product("Cappuccino", "갓 만든 우유거품으로 부드럽게", 4.0);
    static Product shake = new Product("Vanilla Shake", "신선한 우유에 달콤한 바닐라시럽", 3.5);


    /// [ order 클래스의 price, name 변수와 Item 클래스의 price와 name 변수를 일치 시켜주는 메서드 ]

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    Scanner sc = new Scanner(System.in);

    /// 버거 선택 화면 메서드 입니다.
    public void Burger_Menu(Cart cart) {
        System.out.println("\"MCDONALDS에 오신것을 환영합니다.\"");
        System.out.println("아래 상품 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println("");
        System.out.println("[ Burgers MENU ]");
        System.out.println("1. " + bigMac.toString());
        System.out.println("2. " + fiftyFiveBurg.toString());
        System.out.println("3. " + shanghai.toString());
        System.out.println("4. " + tomatoDeluxe.toString());
        System.out.println("5. " + cheese.toString());
        System.out.println("6. " + "Back To Home");

        int max = 6;
        int choose = choose(max);

        switch (choose) {
            case 1:
                System.out.println(bigMac.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm1 = sc.nextLine();
                if (reConfirm1.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(bigMac.getName(), bigMac.getPrice()));
                    break;
                } else {
                    Burger_Menu(cart);
                }
            case 2:
                System.out.println(fiftyFiveBurg.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm2 = sc.nextLine();
                if (reConfirm2.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(fiftyFiveBurg.getName(), fiftyFiveBurg.getPrice()));
                    break;
                } else {
                    Burger_Menu(cart);
                }
            case 3:
                System.out.println(shanghai.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm3 = sc.nextLine();
                if (reConfirm3.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(shanghai.getName(), shanghai.getPrice()));
                    break;
                } else {
                    Burger_Menu(cart);
                }
            case 4:
                System.out.println(tomatoDeluxe.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm4 = sc.nextLine();
                if (reConfirm4.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(tomatoDeluxe.getName(), tomatoDeluxe.getPrice()));
                    break;
                } else {
                    Burger_Menu(cart);
                }
            case 5:
                System.out.println(cheese.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm5 = sc.nextLine();
                if (reConfirm5.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(cheese.getName(), cheese.getPrice()));
                    break;
                } else {
                    Burger_Menu(cart);
                }
            case 6:
                break;
        }

        Menu menu = new Menu();
        menu.home(cart);
    }

    /// 사이드 선택 화면 메서드 입니다.
    public void Side_Menu(Cart cart) {
        System.out.println("\"MCDONALDS에 오신것을 환영합니다.\"");
        System.out.println("아래 상품 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println("");
        System.out.println("[ Side & Dessert ]");
        System.out.println("1. " + snackWrap.toString());
        System.out.println("2. " + twoMacWings.toString());
        System.out.println("3. " + fourMacWings.toString());
        System.out.println("4. " + cheeseSticks.toString());
        System.out.println("5. " + nuggerts.toString());
        System.out.println("6. " + "Back To Home");

        int max = 6;
        int choose = choose(max);

        switch (choose) {
            case 1:
                System.out.println(snackWrap.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm1 = sc.nextLine();
                if (reConfirm1.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(snackWrap.getName(), snackWrap.getPrice()));
                    break;
                } else {
                    Side_Menu(cart);
                }
            case 2:
                System.out.println(twoMacWings.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm2 = sc.nextLine();
                if (reConfirm2.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(twoMacWings.getName(), twoMacWings.getPrice()));
                    break;
                } else {
                    Side_Menu(cart);
                }
            case 3:
                System.out.println(fourMacWings.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm3 = sc.nextLine();
                if (reConfirm3.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(fourMacWings.getName(), fourMacWings.getPrice()));
                    break;
                } else {
                    Side_Menu(cart);
                }
            case 4:
                System.out.println(cheeseSticks.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm4 = sc.nextLine();
                if (reConfirm4.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(cheeseSticks.getName(), cheeseSticks.getPrice()));
                    break;
                } else {
                    Side_Menu(cart);
                }
            case 5:
                System.out.println(nuggerts.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm5 = sc.nextLine();
                if (reConfirm5.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(nuggerts.getName(), nuggerts.getPrice()));
                    break;
                } else {
                    Side_Menu(cart);
                }
            case 6:
                break;
        }

        Menu menu = new Menu();
        menu.home(cart);
    }

    /// 음료수 선택 화면 메서드 입니다.
    public void Drink_Menu(Cart cart) {
        System.out.println("\"MCDONALDS에 오신것을 환영합니다.\"");
        System.out.println("아래 상품 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println("");
        System.out.println("[ Drink ]");
        System.out.println("1. " + cokeSprite.toString());
        System.out.println("2. " + americano.toString());
        System.out.println("3. " + latte.toString());
        System.out.println("4. " + cappuccino.toString());
        System.out.println("5. " + shake.toString());
        System.out.println("6. " + "Back To Home");

        int max = 6;
        int choose = choose(max);

        switch (choose) {
            case 1:
                System.out.println(cokeSprite.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm1 = sc.nextLine();
                if (reConfirm1.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(cokeSprite.getName(), cokeSprite.getPrice()));
                    break;
                } else {
                    Drink_Menu(cart);
                }
            case 2:
                System.out.println(americano.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm2 = sc.nextLine();
                if (reConfirm2.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(americano.getName(), americano.getPrice()));
                    break;
                } else {
                    Drink_Menu(cart);
                }
            case 3:
                System.out.println(latte.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm3 = sc.nextLine();
                if (reConfirm3.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(latte.getName(), latte.getPrice()));
                    break;
                } else {
                    Drink_Menu(cart);
                }
            case 4:
                System.out.println(cappuccino.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm4 = sc.nextLine();
                if (reConfirm4.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(cappuccino.getName(), cappuccino.getPrice()));
                    break;
                } else {
                    Drink_Menu(cart);
                }
            case 5:
                System.out.println(shake.getName() + "을 주문하시겠습니까? -> Y / 돌아가려면 아무키나 누르세요.");
                String reConfirm5 = sc.nextLine();
                if (reConfirm5.equalsIgnoreCase("Y")) {
                    System.out.println("장바구니 추가 완료! 메인화면으로 돌아갑니다.");
                    cart.addOrder(new Order(shake.getName(), shake.getPrice()));
                    break;
                } else {
                    Drink_Menu(cart);
                }
            case 6:
                break;
        }

        Menu menu = new Menu();
        menu.home(cart);
    }
}
