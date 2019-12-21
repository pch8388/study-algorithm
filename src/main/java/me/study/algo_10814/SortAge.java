package me.study.algo_10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAge {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        List<User> users = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = bf.readLine().split(" ");
            users.add(User.of(Integer.parseInt(input[0]), input[1]));
        }

        Collections.sort(users);

        StringBuilder sb = new StringBuilder();
        for (User user : users) {
            sb.append(user.getAge()).append(" ").append(user.getName()).append("\n");
        }
        System.out.println(sb);
    }


}

class User implements Comparable<User> {
    private int age;
    private String name;

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static User of(int age, String name) {
        return new User(age, name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        return getAge() - o.getAge();
    }
}
