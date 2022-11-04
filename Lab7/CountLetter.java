package Lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountLetter{
    public static void main(String[] args) {
    	String filename="C:\\Users\\User\\OneDrive\\Documents\\30322_oprea_sergiu_se_labs\\Oprea_Sergiu_30322\\src\\Lab7\\data.txt";
        Path file = Paths.get(filename);
        Scanner scanner = new Scanner(System.in);
        char c=scanner.next().charAt(0);
        CountLetter cl1 = new CountLetter(file.toAbsolutePath(), c);
        System.out.println(cl1.count());
    }

    private Path file;
    private char lookFor;

    CountLetter(Path file, char lookFor){
        this.file = file;
        this.lookFor = lookFor;
    }

    private int count(){
        int count = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(file)))){
            String line = null;
            while((line = br.readLine()) != null){
                for(int i = 0; i < line.length(); i++){
                    if(line.charAt(i) == lookFor){
                        count++;
                    }
                }
            }
        } catch (IOException x){
            System.err.println(x);
        }
        return count;
    }
}