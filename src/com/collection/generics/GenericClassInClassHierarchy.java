package com.collection.generics;

public class GenericClassInClassHierarchy {
	private static interface Player {
		public default void play() {
			System.out.println("Playing Something.");
		}
	}

	private static class AudioPlayer implements Player {
		@Override
		public void play() {
			System.out.println("Playing by Audio Player.");
		}
	}

	private static class FMPlayer extends AudioPlayer {
		@Override
		public void play() {
			System.out.println("Playing by FM Player.");
		}
	}

	private static class HomeTheatre<T extends Player> {
		private T player;

		public HomeTheatre(T player) {
			this.player = player;
		}

		public void enjoy() {
			player.play();
		}
	}

	public static void main(String[] args) {
		HomeTheatre<Player> homeTheatre = new HomeTheatre<>(new Player() {});

		//HomeTheatre<Player> homeTheatre = new HomeTheatre<>(new AudioPlayer());
		//HomeTheatre<AudioPlayer> homeTheatre = new HomeTheatre<>(new AudioPlayer());

		//HomeTheatre<Player> homeTheatre = new HomeTheatre<>(new FMPlayer());
		//HomeTheatre<FMPlayer> homeTheatre = new HomeTheatre<>(new FMPlayer());

		homeTheatre.enjoy();
	}
}