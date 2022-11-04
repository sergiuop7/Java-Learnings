package Lab7;

import java.io.*;
import java.util.Scanner;

public class Exercise3 {
    private String encrypted;

    public Exercise3() {}

    public String readFile(File file) {
        String text = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text = text.concat(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred!");
        }
        return text;
    }

    public Exercise3 encryptText(String data) {
        this.encrypted = data.chars()
                .map(ch -> ch - 1)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return this;
    }

    public Exercise3 decryptText(String data) {
        this.encrypted = data.chars()
                .map(ch -> ch + 1)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return this;
    }

    public void writeToFile(String path) throws IOException {
        var myObj = new File(path);
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File updated: " + myObj.getName());
        }
        Writer writer = new FileWriter(path);
        writer.write(this.encrypted);
        writer.close();
    }

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    Exercise3 encrypter = new Exercise3();

    System.out.println("Do you want to do? encrypt or decrypt: ");
    String option = scanner.nextLine();

    switch (option) {
        case "encrypt": {
            System.out.println("What file do you want to encrypt? ");
            File file = new File(scanner.nextLine());

            String data = encrypter.readFile(file);
            encrypter.encryptText(data).writeToFile(file.getPath().replaceAll(".txt", ".enc"));
            }
            break;
        case "decrypt": {
            System.out.println("What file do you want to decrypt? ");
            File file = new File(scanner.nextLine());

            String data = encrypter.readFile(file);
            encrypter.decryptText(data).writeToFile(file.getPath().replaceAll(".enc",".dec"));
            }
            break;
        default: System.out.println("Incorrect input!");
    }
}
}
