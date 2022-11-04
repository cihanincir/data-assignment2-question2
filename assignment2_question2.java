import java.io.*;

class Counter {
    public static void main(String args[]) {
        String testingString = "HeLLo WoRLd";
        System.out.println(countUppercaseLetter(testingString));
    }

    public static int countUppercaseLetter(String s) {
        int upperCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upperCount++;
        }
        return upperCount;
    }
}