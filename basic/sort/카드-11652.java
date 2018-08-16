import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int card_num = Integer.parseInt(in.readLine());		
		long cards[] = new long[card_num];
		for(int i=0; i<card_num;i++) {
			cards[i] = Long.parseLong(in.readLine());
		}
		Arrays.sort(cards);
		int count = 1;
		int max_count = 0;
		long max_count_card= Long.MIN_VALUE;
		for(int i=1; i<card_num;i++) {
			if(cards[i]==cards[i-1])
				count++;
			else {
				if(count > max_count) {
					max_count = count;
					max_count_card = cards[i-1];
				}
				count = 1;
			}
		}
		if(count > max_count) {
			max_count = count;
			max_count_card = cards[cards.length-1];
		}
		
		System.out.println(max_count_card);
		in.close();
		out.close();
	}
}