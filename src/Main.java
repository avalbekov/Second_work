public class Main {
    public static void main(String[] args) {
        int money = 80;

        if (money > 500){
            System.out.println("Pizza");
        } else if (money < 500 && money >= 300){
            System.out.println("Shavurma");
        } else if (money >= 100 && money < 300){
            System.out.println("Gamburger");
        }else {
            System.out.println("Doshirak");
        }
    }
}