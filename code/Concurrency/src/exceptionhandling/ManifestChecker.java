package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Demo {
    int age = 5;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object getting cleaned up");
    }
}

public class ManifestChecker {

    static void validateApk(String path) throws ApkNotFoundException {
        try {
            FileReader fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new ApkNotFoundException("APK not found at the path specified.");
        }

    }

    public static void main(String[] args) {
        try {
            validateApk("/Users/rahulgrover/Scaler/LLD/May23/code/Concurrency/src/exceptionhandling/ReadFile.java");
        } catch (ApkNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("happy");
        }
    }
}
