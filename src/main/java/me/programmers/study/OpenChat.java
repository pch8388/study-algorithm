package me.programmers.study;

import java.util.*;
public class OpenChat {
    public String[] solution(String[] record) {
        Queue<Info> result = new LinkedList<>();
        Map<String, String> nameStorage = new HashMap<>();
        for (String row : record) {
            String[] arr = row.split(" ");
            if("Leave".equals(arr[0])) {
                result.add(new Leave(arr[1]));
            } else if ("Enter".equals(arr[0])) {
                result.add(new Enter(arr[1]));
                nameStorage.put(arr[1], arr[2]);
            } else {
                nameStorage.put(arr[1], arr[2]);
            }
        }

        return result.stream()
            .map(info -> info.print(nameStorage))
            .toArray(String[]::new);
    }

    static class Enter implements Info {
        private String id;

        Enter(String id) {
            this.id = id;
        }
        public String print(Map<String, String> nameStorage) {
            return nameStorage.get(id) + "님이 들어왔습니다.";
        }
    }

    static class Leave implements Info {
        private String id;

        Leave(String id) {
            this.id = id;
        }

        public String print(Map<String, String> nameStorage) {
            return nameStorage.get(id) + "님이 나갔습니다.";
        }
    }
}

interface Info {
    String print(Map<String, String> nameStorage);
}
