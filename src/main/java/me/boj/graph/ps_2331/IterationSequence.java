package me.boj.graph.ps_2331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.StringTokenizer;

public class IterationSequence {
	static HashMap<BigInteger, BigInteger> map;
	static int P;
	static BigInteger cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());

		map = new HashMap<>();
		cnt = BigInteger.ZERO;
		answer = BigInteger.ZERO;
		map.put(BigInteger.valueOf(A), cnt);
		dfs(BigInteger.valueOf(A));

		System.out.println(answer);
	}

	static BigInteger answer;
	static void dfs(BigInteger x) {
		BigInteger n = x;
		BigInteger sum = BigInteger.ZERO;
		while (n.compareTo(BigInteger.valueOf(0)) > 0) {
			final BigInteger ten = BigInteger.valueOf(10);
			BigInteger m = n.mod(ten);
			sum = sum.add(m.pow(P));
			n = n.divide(ten);
		}

		if (map.get(sum) != null) {
			answer = map.get(sum);
			return;
		}
		cnt = cnt.add(BigInteger.ONE);
		map.put(sum, cnt);
		dfs(sum);
	}
}
