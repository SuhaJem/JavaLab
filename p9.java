/*interface Compute {
    void convert();
}

class GigaBytesConverter implements Compute {
    double gigabytes;

    GigaBytesConverter(double gigabytes) {
        this.gigabytes = gigabytes;
    }

    @Override
    public void convert() {
        double bytes = gigabytes * 1024 * 1024 * 1024;
        System.out.println(gigabytes + " GigaBytes is equal to " + bytes + " Bytes");
    }
}

class CurrencyConverter implements Compute {
    double euros;

    CurrencyConverter(double euros) {
        this.euros = euros;
    }

    @Override
    public void convert() {
        // Assuming 1 Euro is equivalent to 80 Rupees for the demonstration
        double rupees = euros * 80;
        System.out.println(euros + " Euros is equal to " + rupees + " Rupees");
    }
}

public class p9 {
    public static void main(String[] args) {
        // Demonstrate GigaBytes to Bytes conversion
        GigaBytesConverter gigaBytesConverter = new GigaBytesConverter(2.5);
        System.out.println("GigaBytes to Bytes Conversion:");
        gigaBytesConverter.convert();

        System.out.println();

        // Demonstrate Euro to Rupees conversion
        CurrencyConverter currencyConverter = new CurrencyConverter(50);
        System.out.println("Euro to Rupees Conversion:");
        currencyConverter.convert();
    }
}*/
import java.util.Scanner;

interface Compute {
    void convert();
}

class GigaBytesConverter implements Compute {
    double gigabytes;

    GigaBytesConverter(double gigabytes) {
        this.gigabytes = gigabytes;
    }

    @Override
    public void convert() {
        double bytes = gigabytes * 1024 * 1024 * 1024;
        System.out.println(gigabytes + " GigaBytes is equal to " + bytes + " Bytes");
    }
}

class CurrencyConverter implements Compute {
    double euros;

    CurrencyConverter(double euros) {
        this.euros = euros;
    }

    @Override
    public void convert() {
        // Assuming 1 Euro is equivalent to 80 Rupees for the demonstration
        double rupees = euros * 80;
        System.out.println(euros + " Euros is equal to " + rupees + " Rupees");
    }
}

public class p9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for GigaBytes to Bytes conversion
        System.out.print("Enter the value in GigaBytes: ");
        double gigaBytesInput = scanner.nextDouble();
        GigaBytesConverter gigaBytesConverter = new GigaBytesConverter(gigaBytesInput);
        System.out.println("GigaBytes to Bytes Conversion:");
        gigaBytesConverter.convert();

        System.out.println();

        // Take input for Euro to Rupees conversion
        System.out.print("Enter the amount in Euros: ");
        double eurosInput = scanner.nextDouble();
        CurrencyConverter currencyConverter = new CurrencyConverter(eurosInput);
        System.out.println("Euro to Rupees Conversion:");
        currencyConverter.convert();

        scanner.close();
    }
}

