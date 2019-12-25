package me.study.a_2920;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");
        for (int i = 1; i < arr.length; i++) {
            if (!arr[0].equals("1") && !arr[0].equals("8")) {
                System.out.println("mixed");
                return;
            }
            if (arr[0].equals("1")) {
                if (arr[i-1].compareTo(arr[i]) > 0) {
                    System.out.println("mixed");
                    return;
                }
                if (i == arr.length - 1) {
                    System.out.println("ascending");
                    return;
                }
            }
            if (arr[0].equals("8")) {
                if (arr[i-1].compareTo(arr[i]) < 0) {
                    System.out.println("mixed");
                    return;
                }
                if (i == arr.length - 1) {
                    System.out.println("descending");
                    return;
                }
            }
        }
    }
}
