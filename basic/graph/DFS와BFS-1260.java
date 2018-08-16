import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static boolean graph[][];
	static Stack<Integer> stack = new Stack<Integer>();
	static Queue<Integer> queue = new LinkedList<Integer>();
	static boolean visited[];
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer tokens = new StringTokenizer(in.readLine());
		int n_vertex = Integer.parseInt(tokens.nextToken());
		int n_edge = Integer.parseInt(tokens.nextToken());
		int start_vertex = Integer.parseInt(tokens.nextToken());
		graph = new boolean[n_vertex+1][n_vertex+1];
		visited = new boolean[n_vertex+1];
		
		for (int i = 0; i < n_edge; i++) {
			tokens = new StringTokenizer(in.readLine());
			int sv = Integer.parseInt(tokens.nextToken());
			int ev = Integer.parseInt(tokens.nextToken());
			graph[sv][ev] = true;
			graph[ev][sv] = true;
		}
		
		stack.push(start_vertex); 
		dfs_search(start_vertex);
		System.out.println();
		Arrays.fill(visited, false);
		bfs_search(start_vertex);
		in.close();
	}
	private static void dfs_search(int cur_vertex) {
		if(!stack.isEmpty()) {
			int v = stack.pop();
			visited[v] = true;
			System.out.print(v+ " ");
			
			for (int i = 1; i < graph[v].length; i++) {
				if (graph[v][i] && !visited[i]) {
					stack.push(i);
					dfs_search(i);
				}
			}
		}
	}
	
	private static void bfs_search(int start_vertex) {
		queue.offer(start_vertex);
		visited[start_vertex] = true; 		
		while(!queue.isEmpty()) {
			int v = queue.poll();
			System.out.print(v + " ");
			for (int i = 1; i < graph[v].length; i++) {
				if(graph[v][i] && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}
