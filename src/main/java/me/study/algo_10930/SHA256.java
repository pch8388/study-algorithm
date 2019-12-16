package me.study.algo_10930;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        MessageDigest sh = MessageDigest.getInstance("SHA-256");
        sh.update(s.getBytes());
        byte[] byteData = sh.digest();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
        }
        System.out.println(sb);
    }
}
