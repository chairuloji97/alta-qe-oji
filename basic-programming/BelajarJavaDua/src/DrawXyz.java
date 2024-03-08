public class DrawXyz {
    private static void DrawXyz(int height) {
        for (int baris = 1; baris <= height; baris++) {
            for (int kolom = 1; kolom <= height; kolom++) {
                int nilai = kolom + (baris - 1) * height;
                if (nilai % 3 == 0) System.out.print("X");
                else if (nilai % 2 == 0) System.out.print("Z");
                else System.out.print("Y");
                }
            System.out.println();
            }
        }

    public static void main(String[] args) {
        DrawXyz(3);
    }
    }

