package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1000 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String[] firstline = br.readLine().split(" ");
		int x = Integer.parseInt(firstline[0]);
		int y = Integer.parseInt(firstline[1]);
		System.out.println(x+y);
	}

}
