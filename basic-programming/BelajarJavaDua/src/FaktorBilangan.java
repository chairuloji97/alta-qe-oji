public class FaktorBilangan {
    public static void main(String[] args) {

        int bilangan = 20;

        for (int i=1;i<bilangan;i++){
            if (bilangan % i == 0){
                System.out.println(i);
            }
        }
    }
}
