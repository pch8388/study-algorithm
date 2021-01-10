package me.programmers.etc.ps_49993;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkillTreeTest {

    @Test
    void solve() {
        SkillTree skillTree = new SkillTree();
        final int r1 = skillTree.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});

        assertEquals(2, r1);
    }
}