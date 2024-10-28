import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Program Konversi Waktu ===");
            System.out.println("1. Konversi Detik ke Jam, Menit, dan Detik");
            System.out.println("2. Konversi Jam, Menit, Detik ke Total Detik");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1-3): ");
            choice = scanner.nextInt();

            String PROMPT_MESSAGE = "Masukkan jumlah detik: ";
            switch (choice) {
                case 1:
                    // Mengonversi detik ke jam, menit, dan detik
                    System.out.print(PROMPT_MESSAGE);
                    int totalSeconds = scanner.nextInt();
                    Waktu timeFromSeconds = new Waktu(totalSeconds);
                    timeFromSeconds.displayTime();
                    break;
                case 2:
                    // Mengonversi jam, menit, detik ke total detik
                    System.out.print("Masukkan jumlah jam: ");
                    int hours = scanner.nextInt();
                    System.out.print("Masukkan jumlah menit: ");
                    int minutes = scanner.nextInt();
                    System.out.print(PROMPT_MESSAGE);
                    int seconds = scanner.nextInt();
                    Waktu timeToSeconds = new Waktu(hours, minutes, seconds);
                    System.out.println("Total detik: " + timeToSeconds.Totaldtk() + " detik");
                    break;
                case 3:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
