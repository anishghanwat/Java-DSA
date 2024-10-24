import java.util.*;

public class Bin2Dec {
    public static void Bin2Dec(int BinNum) {
        int mynum = BinNum;
        int pow = 0;
        int DecNum = 0;

        while (BinNum > 0) {
            int lastDigit = BinNum % 10;

            DecNum = DecNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            BinNum = BinNum / 10;
        }
        System.out.println("Decimal number of " + mynum + " is " + DecNum);
    }

    public static void Dec2bin(int decNum) {
        int mynum = decNum;
        int pow = 0;
        int BinNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;

            BinNum = BinNum + (rem * (int) Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary number of " + mynum + " is " + BinNum);
    }

    public static void main(String[] args) {
        Bin2Dec(1010);
        Dec2bin(10);
    }
}