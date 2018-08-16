import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = null;
		int num = Integer.parseInt(in.readLine());
		Coordinates coos[] = new Coordinates[num];
		for(int i =0; i<num;i++) {
			tokens = new StringTokenizer(in.readLine(), " ");
			int x = Integer.parseInt(tokens.nextToken());
			int y = Integer.parseInt(tokens.nextToken());
			coos[i] = new Coordinates(x, y);
		}
		Arrays.sort(coos, new Comparator<Coordinates>() {
			@Override
			public int compare(Coordinates o1, Coordinates o2) {
				if(o1.x == o2.x)
					return (o1.y>o2.y)? 1:((o1.y<o2.y)? -1:0);
				else
					return (o1.x>o2.x)? 1:-1;
			}
		});
		for(int i=0; i<num; i++)
			System.out.println(coos[i].x + " " + coos[i].y);
		
		in.close();
	}
}

class Coordinates{
	int x;
	int y;
	
	Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
