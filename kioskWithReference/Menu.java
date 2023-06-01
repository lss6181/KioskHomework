package kioskWithReference;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

class Menu {

    String name; // 이름
    String explain; // 설명

    public String toString() {
        return name + " | " + explain;
    }

    Menu() {}
    Menu(String a, String b) {
        this.name = a;
        this.explain = b;
    } // 기본 생성자

    /// 메인 화면에 사용되는 객체들 입니다. (선택지)
    static Menu burgers = new Menu("Burgers","순쇠고기 패티, 통살치킨으로 만든 버거" );
    static Menu side = new Menu("Side & Dessert","매장에서 주문즉시 만드는 사이드" );
    static Menu drink = new Menu("Drinks","매장에서 직접 만드는 음료" );
    static Menu order = new Menu("Order","장바구니를 확인 후 주문합니다." );
    static Menu cancel = new Menu("Cancel","장바구니를 비우고 진행중인 주문을 취소합니다." );

    /// 입력을 받는 메서드 입니다.
    static int choose(int a) {

        Scanner sc = new Scanner(System.in);
        int result = 0;
        boolean validinput = false;

        while (!validinput) {
            try {
                System.out.print("숫자를 입력해주세요 : ");
                if (sc.hasNextInt()) {
                    result = sc.nextInt();
                    if (result < 1 || result > a) {
                        throw new InputMismatchException();
                    }
                    validinput = true;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("올바르지 않은 입력 입니다.");
                if (sc.hasNext()) {
                    sc.nextLine();
                }
            }
        }
        return result;
    }

    ///

    Cart cart = new Cart(); // 메뉴 클래스에서 사용 할 장바구니 객체를 만듭니다. (장바구니에 물건을 전달 받아야 함)

    // 메인 화면 메서드 입니다.
    public void home(Cart cart) {
        System.out.println("\"MCDONALDS에 오신것을 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println("");
        System.out.println("[ Mcdonalds MENU ]");
        System.out.println("1. " + burgers.toString());
        System.out.println("2. " + side.toString());
        System.out.println("3. " + drink.toString());
        System.out.println("");
        System.out.println("[ ORDER MENU ]");
        System.out.println("4. " + order.toString());
        System.out.println("5. " + cancel.toString());
        System.out.println("");

        Product item = new Product();

        int max = 5;
        int choose = choose(max);
        switch (choose) {
            case 1:
                item.Burger_Menu(cart);
                break;
            case 2:
                item.Side_Menu(cart);
                break;
            case 3:
                item.Drink_Menu(cart);
                break;
            case 4:
                Show_Cart(cart);
                break;
            case 5:
                Clear_Cart(cart);
                break;
        }
    }

    /// 메인화면 메서드 끝입니다.

    private static int orderCount = 0; // 주문 횟수 (대기번호)

    /// 주문화면 메서드 시작입니다.

    private void Show_Cart(Cart cart) {
        System.out.println("\n[ Cart ]");
        for (Order order : cart.getOrders()) {
            System.out.println("상품명 : " + order.getName() + " | 가격 : W " + order.getPrice());
        }
        DecimalFormat df = new DecimalFormat("#,###.#"); /// 단위를 소숫점 1자리로 설정합니다.
        System.out.println("Total Price : W " + df.format(cart.getTotal()));
        System.out.println("\n아래와 같이 주문 하시겠습니까? Y/N");

        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();

        if (result.equalsIgnoreCase("Y" )) {
            orderCount++;
            System.out.println("주문완료! 대기번호는 [ " + orderCount + " ] 번 입니다.");
            System.out.println("");
            cart.clearorders();
            home(cart);
        } else if (result.equalsIgnoreCase("N" )) {
            System.out.println(" 메인 화면으로 돌아갑니다. ");
            home(cart);
        } else {
            System.out.println("올바르지 못한 입력정보 입니다. 다시입력해주세요.");
            Show_Cart(cart);
        }
    }

    /// 주문화면 메서드 끝입니다.

    /// 장바구니 비우고 메인으로 돌아가는 메서드 입니다.

    private void Clear_Cart(Cart cart) {
        System.out.println("장바구니를 비우고, 주문을 취소하시겠습니까? Y/N");

        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();

        if(result.equalsIgnoreCase("Y")) {
            System.out.println("주문이 취소되었습니다. 메인 화면으로 돌아갑니다.");
            cart.clearorders();
            home(cart);
        } else if (result.equalsIgnoreCase("N" )) {
            home(cart);
        } else {
            System.out.println("올바르지 못한 입력정보 입니다. 다시입력해주세요.");
            Clear_Cart(cart);
        }
    }
}
