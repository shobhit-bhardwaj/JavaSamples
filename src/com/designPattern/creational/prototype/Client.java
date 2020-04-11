package com.designPattern.creational.prototype;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		try {
			List<PrototypeCapable> movies = Netflix.getInstance("movies");
			System.out.println("Movie List - " + movies);
			System.out.println();

			List<PrototypeCapable> tvShows = Netflix.getInstance("tvShows");
			System.out.println("TV Show List - " + tvShows);
			System.out.println();

			List<PrototypeCapable> webSeries = Netflix.getInstance("webSeries");
			System.out.println("Web Series List - " + webSeries);
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
	}
}