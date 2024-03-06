import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum yılınızı girin:");
        int dogumYili = scanner.nextInt();

        // Çin Zodyağı hesaplaması
        String[] cinZodyagi = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        int indeks = dogumYili % 12;
        String burc = cinZodyagi[indeks];

        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}
