package Ekim17Hafta3.BonusGorevler;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo = 72;   // kilogram cinsinden
        double boy = 1.78;  // metre cinsinden
        double bmi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksi (BMI): " + bmi);
    }
}
