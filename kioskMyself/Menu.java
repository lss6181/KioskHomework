package kioskMyself;


public class Menu {
    static String name;
    static String explain;

    public String mainMenu(){
        return name + " | " + explain;
    }
    public String mainInput(String name, String explain){
        this.name = name;
        this.explain = explain;
        return mainMenu();
    }
}