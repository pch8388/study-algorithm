package me.boj.bruteforce.ps_1339;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordMath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        List<String> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            list.add(s);
            for (int j = 0; j < s.length(); j++) {
                map.put(s.charAt(j), 0);
            }
        }
        int idx = map.keySet().size();


        arr = Arrays.copyOf(arr, idx);
        Arrays.sort(arr);
        int max = 0;
        do {
            Iterator<Character> it = map.keySet().iterator();
            int index = idx;
            while (it.hasNext()) {
                map.replace(it.next(), arr[--index]);
            }

            int sum = 0;
            for (String s : list) {
                int l = s.length();
                for (int j = 0; j < l; j++) {
                    sum += map.get(s.charAt(j)) * (int) Math.pow(10, l - 1 - j);
                }
            }
            max = Math.max(max, sum);

        } while (nextPermutation(idx, arr));

        System.out.println(max);
    }

    static boolean nextPermutation(int n, int[] arr) {
        int i = n - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) i--;
        if (i <= 0) return false;
        int j = n - 1;
        while (arr[j] <= arr[i - 1]) j--;

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = n - 1;
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }

        return true;
    }
}
