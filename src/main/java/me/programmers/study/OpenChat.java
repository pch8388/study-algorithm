package me.programmers.study;

import java.util.*;
public class OpenChat {
    public String[] solution(String[] record) {
        Room room = new Room(record);
        return room.getLogs();
    }

    static class Room {
        Queue<Info> infoLogs = new LinkedList<>();
        Map<String, String> names = new HashMap<>();
        Room(String[] record) {
            for (String row : record) {
                String[] strings = row.split(" ");
                if("Leave".equals(strings[0])) {
                    infoLogs.add(new Leave(strings[1]));
                }
                if ("Enter".equals(strings[0])) {
                    infoLogs.add(new Enter(strings[1]));
                    names.put(strings[1], strings[2]);
                }
                if ("Change".equals(strings[0])){
                    names.put(strings[1], strings[2]);
                }
            }
        }

        public String[] getLogs() {
            return infoLogs.stream()
                .map(info -> info.print(names))
                .toArray(String[]::new);
        }
    }

    static class Enter implements Info {
        private final String id;

        Enter(String id) {
            this.id = id;
        }
        public String print(Map<String, String> names) {
            return names.get(id) + "님이 들어왔습니다.";
        }
    }

    static class Leave implements Info {
        private final String id;

        Leave(String id) {
            this.id = id;
        }

        public String print(Map<String, String> names) {
            return names.get(id) + "님이 나갔습니다.";
        }
    }
}

interface Info {
    String print(Map<String, String> names);
}
