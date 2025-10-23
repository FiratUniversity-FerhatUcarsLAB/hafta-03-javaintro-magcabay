package Ekim17Hafta3.Gorev3;

public class UcgenAlan {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        double s = (a + b + c) / 2;
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Üçgenin Kenar Uzunlukları:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Yarı Çevre (s): " + s);
        System.out.println("Üçgenin Alanı (A): " + alan);
    }
}
