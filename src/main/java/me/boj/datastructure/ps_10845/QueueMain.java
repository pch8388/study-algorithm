package me.boj.datastructure.ps_10845;

import java.io.*;
import java.util.StringTokenizer;

public class QueueMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int size = Integer.parseInt(reader.readLine());
        Queue queue = Queue.of(size);

        while (size-- > 0) {
            StringTokenizer s = new StringTokenizer(reader.readLine());
            String op = s.nextToken();

            if ("push".equals(op)) {
                queue.push(Integer.parseInt(s.nextToken()));
            } else if ("pop".equals(op)) {
                builder.append(queue.pop()).append("\n");
            } else if ("size".equals(op)) {
                builder.append(queue.size()).append("\n");
            } else if ("empty".equals(op)) {
                builder.append(queue.empty()).append("\n");
            } else if ("front".equals(op)) {
                builder.append(queue.front()).append("\n");
            } else if ("back".equals(op)) {
                builder.append(queue.back()).append("\n");
            }
        }

        reader.close();
        System.out.println(builder);
    }
}

class Queue {

    private int[] queue;
    private int front;
    private int rear;

    private Queue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public static Queue of(int size) {
        return new Queue(size);
    }

    public void push(int element) {
        queue[++rear] = element;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        return queue[++front];
    }

    public int size() {
        return rear - front;
    }

    public int empty() {
        if (isEmpty()) {
            return 1;
        }
        return 0;
    }

    private boolean isEmpty() {
        return front == rear;
    }

    public int front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front + 1];
    }

    public int back() {
        if (isEmpty()) {
            return -1;
        }
        return queue[rear];
    }
}