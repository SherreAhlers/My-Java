public class MegaBytesConverter {
    // MegaByte Converter
    // Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
    // The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes
    // from the kiloBytes parameter
    // Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
    // XX represents the original value kiloBytes.
    // YY represents the calculated megabytes.
    // ZZ represents the calculated remaining kilobytes.
    // If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
    // 1 MB = 1024 KB


    // MY FIRST VERSION
//    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//        int megaBytes = kiloBytes % 1024;
//
//        if (kiloBytes  0) {
//            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytes + "KB");
//        } else {
//            System.out.println("Invalid Value");
//        }
//    }
    // CORRECT VERSION

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes >= 0) {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
