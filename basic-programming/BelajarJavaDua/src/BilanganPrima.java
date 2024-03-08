public class BilanganPrima {
    public static void main(String[] args) {

        boolean prime = true;
        int n = 10;

        if (n <= 1) {
            System.out.println(n + " bukan bilangan prima ");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0){
                prime = false;
                break;
            }
        }

        if (prime){
            System.out.println(n + " adalah bilangan prima ");
        } else {
            System.out.println(n + " bukan bilangan prima ");
        }
    }
}
