package me.programmers.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenChatTest {

    @Test
    void solution() {
        OpenChat openChat = new OpenChat();
        final String[] result = openChat.solution(new String[]{
            "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
            "Enter uid1234 Prodo", "Change uid4567 Ryan"});

        assertArrayEquals(new String[]{"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."}, result);
    }
}