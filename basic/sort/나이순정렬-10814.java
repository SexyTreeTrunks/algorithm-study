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
		Joiner joiners[] = new Joiner[num];
		for(int i =0; i<num;i++) {
			tokens = new StringTokenizer(in.readLine(), " ");
			int age = Integer.parseInt(tokens.nextToken());
			String name = tokens.nextToken();
			joiners[i] = new Joiner(age, name);
		}
		Arrays.sort(joiners, new Comparator<Joiner>() {
			@Override
			public int compare(Joiner o1, Joiner o2) {
				if(o1.age == o2.age)
					return (o1.id>o2.id)? 1:((o1.id<o2.id)? -1:0);
				else
					return (o1.age>o2.age)? 1:-1;
			}
		});
		for(int i=0; i<num; i++)
			System.out.println(joiners[i].age + " " + joiners[i].name);
		
		in.close();
	}
}

class Joiner{
	static int id_count = 0;
	int age;
	String name;
	int id;
	Joiner(int age, String name) {
		this.age = age;
		this.name = name;
		id = ++id_count;
	}
}
