package com.dataStructure.graph;

import java.util.LinkedList;

public class GraphDemo {
	private int noOfVertices;
	private LinkedList<Integer> adjacentList[];

	@SuppressWarnings("unchecked")
	public GraphDemo(int noOfVertices) {
		this.noOfVertices = noOfVertices;

		adjacentList = new LinkedList[this.noOfVertices];

		for(int i=0; i<this.noOfVertices; i++)
			adjacentList[i] = new LinkedList<Integer>();
	}

	public void addEdge(int source, int destination) {
		adjacentList[source].add(destination);
		adjacentList[destination].add(source);
	}

	public void printGraph() {
		for(int i=0; i<noOfVertices; i++) {
			System.out.println("Adjacents of - "+i);
			LinkedList<Integer> list = adjacentList[i];
			for(Integer value : list)
				System.out.print(value+"\t");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		GraphDemo graph = new GraphDemo(5);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printGraph();
	}
}