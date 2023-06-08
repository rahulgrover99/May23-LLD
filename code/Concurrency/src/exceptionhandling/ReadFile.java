package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

// A -> B -> C
// A a = new B();


public class ReadFile {

    public static void main(String[] args) {
        try {
            readFile();
//            System.out.println(1/0);
            System.out.println("File is found");
        } catch(RuntimeException e) {
            System.out.println("please dont divide by zero");
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }

    static void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader(
                "/Users/rahulgrover/Scaler/LLD/May23/code/Concurrency/" +
                        "src/exceptionhandling/Scakler.java");
    }
}
