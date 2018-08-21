package com.company;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(1024);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        //calculate megabytes and remaining kilobytes
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0) {
            System.out.println("0 KB = 0 MB and 0 KB");
        } else {
            int megaBytes = 1024;

            int convertedKiloBytes = kiloBytes / megaBytes;

            int remainingKilo = kiloBytes % megaBytes;

            System.out.println(kiloBytes + " KB = " + convertedKiloBytes + " MB and " + remainingKilo + " KB");
        }
    }
}

