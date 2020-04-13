package com.designPattern.creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Netflix {
	private static Map<String, List<? extends PrototypeCapable>> CONTENT_MAP;

	static {
		System.out.println("Start Loading Data in Prototype Object");

		CONTENT_MAP = new HashMap<>();

		List<Movie> movies = new ArrayList<>();
		movies.addAll(Arrays.asList(new Movie("Interstellar"), new Movie("Batman Begins"), new Movie("Avengers")));
		CONTENT_MAP.put("movies", movies);

		List<TVShow> tvShows = Arrays.asList(new TVShow("Friends"), new TVShow("Big Bang Theory"), new TVShow("Breaking Bad"));
		CONTENT_MAP.put("tvShows", tvShows);

		List<WebSeries> webSeries = new ArrayList<>();
		webSeries.addAll(Arrays.asList(new WebSeries("Sacred Games"), new WebSeries("Ghoul"), new WebSeries("Bard of Blood")));
		CONTENT_MAP.put("webSeries", webSeries);

		System.out.println("Data Loaded in Prototype Object - " + CONTENT_MAP);
		System.out.println();
	}

	public static List<PrototypeCapable> getContent(String type) throws CloneNotSupportedException {
		List<PrototypeCapable> contents = new ArrayList<>();

		for(PrototypeCapable content : CONTENT_MAP.get(type))
			contents.add(((PrototypeCapable) content).clone());

		return contents;
	}
}