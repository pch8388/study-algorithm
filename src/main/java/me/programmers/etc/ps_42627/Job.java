package me.programmers.etc.ps_42627;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Job {
    public int solution(int[][] jobs) {
        PriorityQueue<JobInfo> jobInfos = new PriorityQueue<>();
        for (int[] job : jobs) {
            jobInfos.offer(new JobInfo(job[0], job[1]));
        }

        final JobInfo firstJob = jobInfos.poll();

        int curruntTime = firstJob.start + firstJob.timeOfJob;
        int answer = firstJob.timeOfJob;
        while (!jobInfos.isEmpty()) {
            List<JobInfo> infos = new ArrayList<>();
            do {
                infos.add(jobInfos.poll());
            } while (!jobInfos.isEmpty() && jobInfos.peek().start < curruntTime);

            infos.sort(Comparator.comparing(JobInfo::getTimeOfJob));
            final JobInfo info = infos.remove(0);

            int s = Math.max(curruntTime, info.start);
            curruntTime = s + info.timeOfJob;
            answer += s - info.start + info.timeOfJob;
            jobInfos.addAll(infos);
        }

        return answer / jobs.length;
    }

    static class JobInfo implements Comparable<JobInfo> {
        int start;
        int timeOfJob;

        public JobInfo(int start, int timeOfJob) {
            this.start = start;
            this.timeOfJob = timeOfJob;
        }

        public int getStart() {
            return start;
        }

        public int getTimeOfJob() {
            return timeOfJob;
        }

        @Override
        public int compareTo(JobInfo o) {
            if (this.start > o.start) {
                return 1;
            }
            if (this.start < o.start) {
                return -1;
            }
            return Integer.compare(this.timeOfJob, o.timeOfJob);
        }
    }
}
