package me.programmers.etc.ps_49993;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {

        int result = 0;
        for (String skill_tree : skill_trees) {
            if (checkSkill(skill, skill_tree)) result++;
        }
        return result;
    }

    private boolean checkSkill(String skill, String skill_tree) {
        int idx = -1;
        for (int i = 0; i < skill_tree.length(); i++) {
            final int x = skill.indexOf(skill_tree.charAt(i));
            if (x != -1 && x > idx + 1) {
                return  false;
            }

            if (x == idx + 1) idx = x;
        }

        return true;
    }
}
