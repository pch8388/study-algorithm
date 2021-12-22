package me.programmers.study;

import java.util.*;
import java.util.stream.*;

public class LottoHighLow {
    public int[] solution(int[] lottos, int[] win_nums) {
        LottoNumbers userNumbers = new LottoNumbers(lottos);
        LottoNumbers winNumbers = new LottoNumbers(win_nums);

        int highRank = userNumbers.findHigherRank(winNumbers).getRank();
        int lowRank = userNumbers.findLowerRank(winNumbers).getRank();
        return new int[] {highRank, lowRank};
    }

    static class LottoNumbers {
        private static final int MAX_NUMBER_COUNT = 6;
        private final List<LottoNumber> numbers;

        LottoNumbers(int[] lottos) {
            numbers = Arrays.stream(lottos)
                .filter(number -> number > 0)
                .mapToObj(LottoNumber::new)
                .collect(Collectors.toList());
        }

        public Grade findHigherRank(LottoNumbers winNumbers) {
            return Grade.find(
                getMatchCount(winNumbers) + (MAX_NUMBER_COUNT - numbers.size())
            );
        }

        public Grade findLowerRank(LottoNumbers winNumbers) {
            return Grade.find(getMatchCount(winNumbers));
        }

        private int getMatchCount(LottoNumbers winNumbers) {
            return (int) winNumbers.numbers.stream()
                                .filter(num -> this.numbers.stream().anyMatch(n -> n.isMatched(num)))
                                .count();
        }
    }

    static class LottoNumber {
        private final int number;

        LottoNumber(int number) {
            this.number = number;
        }

        public boolean isMatched(LottoNumber winNumber) {
            return this.number == winNumber.number;
        }
    }
}

enum Grade {
    ONE(6, 1),
    TWO(5, 2),
    THREE(4, 3),
    FOUR(3, 4),
    FIVE(2, 5),
    SIX(1, 6);

    private final int matchNumberCount;
    private final int rank;

    Grade(int matchNumberCount, int rank) {
        this.matchNumberCount = matchNumberCount;
        this.rank = rank;
    }

    public int getMatchNumberCount() {
        return this.matchNumberCount;
    }

    public int getRank() {
        return this.rank;
    }

    public static Grade find(int matchNumberCount) {
        return Arrays.stream(Grade.values())
            .filter(g -> matchNumberCount == g.matchNumberCount)
            .findAny()
            .orElse(Grade.SIX);
    }
}