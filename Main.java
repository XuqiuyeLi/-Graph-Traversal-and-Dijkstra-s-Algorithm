import java.util.Scanner;

import ch10.graphs.WeightedGraph;

public class Main {

	public static void main(String[] args) {
		WeightedGraph<String> mygraph = new WeightedGraph<String>();
		String[] vertices = {"A","B","C","D","E"};
		for (int i =0; i<vertices.length; i++) {
			mygraph.addVertex(vertices[i]);
		}
		for (int i =0; i<vertices.length ; i++) {
			for (int j =0; j<vertices.length ; j++) {
		    if (i==j){continue;}
			int weight = Math.abs(vertices[i].charAt(0) 
					- vertices[j].charAt(0));
			mygraph.addEdge(vertices[i],vertices[j],weight);
			}
		}
		System.out.println(mygraph.edgeExists("A","B"));
		System.out.println(mygraph.edgeExists("A","C"));
		 System.out.println(mygraph.hasVertex("A")); 
		 System.out.println(mygraph.weightIs("D","E")); 
		Scanner input = new Scanner(System.in);
		String path = input.nextLine();
		int distance = 0;
		for (int i =0 ; i<path.length()-1;i++) {
			distance += mygraph.weightIs(path.substring(i,i+1), 
					            path.substring(i+1, i+2));
			System.out.println(distance);
		}
		System.out.println("Distance is: " + distance);
	}

}
