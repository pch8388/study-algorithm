package me.programmers.kakao.ps_64603;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelRoom {
	public long[] solution(long k, long[] room_number) {
		final int len = room_number.length;
		long[] answer = new long[len];

		final Map<Long, Long> map = new HashMap<>();
		for (int i = 0; i < len; i++) {
			long x = room_number[i];
			if (!map.containsKey(x)) {
				answer[i] = x;
				map.put(x, x + 1);
			} else {
				List<Long> list = new ArrayList<>();
				while (map.containsKey(x)) {
					list.add(x);
					x = map.get(x);
				}

				answer[i] = x;
				list.add(x);
				for (Long l : list) {
					map.put(l, x + 1);
				}
			}
		}

		return answer;
	}
}
