package me.programmers.skillcheck.devtest;

public class Test1 {
    public int solution(int[][] office, int r, int c, String[] move) {
        n = office.length;
        m = office[0].length;
        space = office;
        Robot robot = new Robot(r, c, 0);

        for (String s : move) {
            robot = robot.operation(s);
        }

        return answer;
    }

    static int n;
    static int m;
    static int answer = 0;
    static int[][] space;
    static class Robot {
        int x, y, k;

        public Robot(int x, int y, int k) {
            this.x = x;
            this.y = y;
            this.k = k;

            answer = space[x][y];
            space[x][y] = 0;
        }

        Robot operation(String op) {
            if ("go".equals(op)) {
                switch (k) {
                    case 0:
                        if (x - 1 >= 0 && space[x - 1][y] != -1) {
                            x = x - 1;
                            answer += space[x][y];
                            space[x][y] = 0;
                        }
                        break;
                    case 1:
                        if (y + 1 < m && space[x][y + 1] != -1) {
                            y = y + 1;
                            answer += space[x][y];
                            space[x][y] = 0;
                        }
                        break;
                    case 2:
                        if (x + 1 < n && space[x + 1][y] != -1) {
                            x = x + 1;
                            answer += space[x][y];
                            space[x][y] = 0;
                        }
                        break;
                    case 3:
                        if (y - 1 >= 0 && space[x][y - 1] != -1) {
                            y = y - 1;
                            answer += space[x][y];
                            space[x][y] = 0;
                        }
                        break;
                }
                return this;
            }
            if ("right".equals(op)) {
                k = (k + 1) % 4;
                return this;
            }
            k = k - 1;
            if (k < 0) {
                k = 3;
            }
            return this;
        }
    }
}


