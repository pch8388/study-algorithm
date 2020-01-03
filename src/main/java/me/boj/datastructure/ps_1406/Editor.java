package me.boj.datastructure.ps_1406;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Editor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Character> characters = new LinkedList<>();
        for (char c : reader.readLine().toCharArray()) {
            characters.add(c);
        }

        int cursor = characters.size();

        int m = Integer.parseInt(reader.readLine());
        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String op = st.nextToken();
            switch (op) {
                case "L" :
                    if (cursor > 0) {
                        cursor--;
                    }
                    break;
                case "D" :
                    if (cursor < characters.size()) {
                        cursor++;
                    }
                    break;
                case "B" :
                    if (cursor > 0) {
                        characters.remove(--cursor);
                    }
                    break;
                case "P" :
                    characters.add(cursor++, st.nextToken().charAt(0));
                    break;
            }
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Character character : characters) {
            writer.append(character);
        }
        writer.close();
        reader.close();
    }
}
