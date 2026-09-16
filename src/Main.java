import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2026);
        checkLeapYear(2025);
        checkLeapYear(2000);
        checkLeapYear(1930);
        checkAppVersion(0, 2023);
        checkAppVersion(1, 2026);
        checkAppVersion(0, 2026);
        checkAppVersion(1, 2020);
        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + days);
    }
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void checkAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName;
        if (osType == 0) {
            osName = "iOS";
        } else if (osType == 1) {
            osName = "Android";
        } else {
            System.out.println("Ошибка: неизвестный тип ОС. Используйте 0 (iOS) или 1 (Android).");
            return;
        }
        String version;
        if (deviceYear < currentYear) {
            version = "облегченную версию";
        } else {
            version = "обычную версию";
        }
        System.out.println("Установите " + version + " приложения для " + osName +
                " (устройство " + deviceYear + " года)");
    }
    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}