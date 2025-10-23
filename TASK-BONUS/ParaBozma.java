package Ekim17Hafta3.BonusGorevler;

public class ParaBozma {
    public static void main(String[] args) {
        int miktar = 278;

        int yuzluk = miktar / 100;
        miktar %= 100;
        int ellilik = miktar / 50;
        miktar %= 50;
        int yirmilik = miktar / 20;
        miktar %= 20;
        int beslik = miktar / 5;
        miktar %= 5;
        int ikilik = miktar / 2;
        miktar %= 2;
        int birlik = miktar;

        System.out.println("278 TL = " + yuzluk + "x100, " + ellilik + "x50, " +
                yirmilik + "x20, " + beslik + "x5, " + ikilik + "x2, " + birlik + "x1");
    }
}
