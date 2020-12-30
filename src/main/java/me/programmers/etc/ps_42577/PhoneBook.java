package me.programmers.etc.ps_42577;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book, Comparator.comparing(String::length));
        Map<String, Boolean> book = new HashMap<>();
        for (String number : phone_book) {
            if (book.size() == 0) {
                book.put(number, true);
                continue;
            }

            for (int i = 0; i < number.length() - 1; i++) {
                String sub = number.substring(0, i + 1);
                if (book.containsKey(sub)) return false;
            }

            book.put(number, true);
        }
        return true;
    }
}
