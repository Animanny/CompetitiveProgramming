package ccc2013;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S4_WhoisTaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nodes = sc.nextInt();
		int edges = sc.nextInt();
		boolean[] visited = new boolean[nodes];
		ArrayList<Integer>[] adjacency = new ArrayList[nodes];
		for (int i = 0; i < edges; i++) {
			adjacency[sc.nextInt() - 1].add(sc.nextInt());
		}
		
		

	}
	
	public static boolean BFS(int source){
		Queue<Integer> q = new LinkedList();
		q.add(source);
		
		while (!q.isEmpty()) {
			
			
			int n = q.remove();
			
			
			
			
		}
		return false;
	}

}
