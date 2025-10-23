package Ekim17Hafta3.Gorev4;

public class HesapOzeti {
    public static void main(String[] args) {
        String urun1 = "Ekmek";
        int miktar1 = 2;
        double fiyat1 = 10.0;

        String urun2 = "Süt";
        int miktar2 = 1;
        double fiyat2 = 25.0;

        String urun3 = "Yumurta";
        int miktar3 = 30;
        double fiyat3 = 1.5;

        String urun4 = "Peynir";
        int miktar4 = 1;
        double fiyat4 = 60.0;

        String urun5 = "Makarna";
        int miktar5 = 3;
        double fiyat5 = 12.0;

        double toplam1 = miktar1 * fiyat1;
        double toplam2 = miktar2 * fiyat2;
        double toplam3 = miktar3 * fiyat3;
        double toplam4 = miktar4 * fiyat4;
        double toplam5 = miktar5 * fiyat5;

        double genelToplam = toplam1 + toplam2 + toplam3 + toplam4 + toplam5;

        System.out.println("========================================");
        System.out.printf("%-15s %-10s %-10s%n", "Ürün", "Miktar", "Fiyat (₺)");
        System.out.println("========================================");

        System.out.printf("%-15s %-10d %-10.2f%n", urun1, miktar1, toplam1);
        System.out.printf("%-15s %-10d %-10.2f%n", urun2, miktar2, toplam2);
        System.out.printf("%-15s %-10d %-10.2f%n", urun3, miktar3, toplam3);
        System.out.printf("%-15s %-10d %-10.2f%n", urun4, miktar4, toplam4);
        System.out.printf("%-15s %-10d %-10.2f%n", urun5, miktar5, toplam5);

        System.out.println("========================================");
        System.out.printf("%-15s %-10s %-10.2f%n", "Toplam", "", genelToplam);
        System.out.println("========================================");
    }
}
