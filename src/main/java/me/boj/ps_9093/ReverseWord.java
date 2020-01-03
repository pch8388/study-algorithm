package me.boj.ps_9093;

import java.io.*;
import java.util.StringTokenizer;

public class ReverseWord {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                char[] characters = s.toCharArray();
                for (int j = characters.length - 1; j >= 0; j--) {
                    writer.append(characters[j]);
                }
                writer.append(" ");
            }
            writer.append("\n");
        }
        writer.flush();

        reader.close();
        writer.close();
    }
}
