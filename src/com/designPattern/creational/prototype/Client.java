package com.designPattern.creational.prototype;

import java.util.List;

/*
 * In Prototype Design Pattern, an instance of actual object (i.e. prototype) is created on starting
 * and thereafter whenever a new instance is required, this prototype is cloned to have another instance.
 * 
 * The main advantage of this pattern is to have minimal instance creation process which is much costly than cloning process.
 */
public class Client {
	public static void main(String[] args) {
		try {
			List<PrototypeCapable> movies = Netflix.getContent("movies");
			System.out.println("Movie List - " + movies);
			System.out.println();

			List<PrototypeCapable> tvShows = Netflix.getContent("tvShows");
			System.out.println("TV Show List - " + tvShows);
			System.out.println();

			List<PrototypeCapable> webSeries = Netflix.getContent("webSeries");
			System.out.println("Web Series List - " + webSeries);
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
	}
}