public class Main {
    public static void main(String[] args) {



        for (int i = 1; i <= 8; i++) {             //ה i על השורות
            for (int j = 8; j >= i ; j--) {        // ה j על העמודות
                System.out.print(i);
            }
            System.out.println();
        }

    }
}