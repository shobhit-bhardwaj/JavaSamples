package com.collection.generics;

public class GenericMethodInClassHierarchy {
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

	private static class VideoPlayer {
		public void play() {
			System.out.println("Playing by Video Player.");
		}
	}

	public static <T extends Player> void enjoy(T player) {
		player.play();
	}

	public static <T> void enjoyUnbounded(T object) {
		System.out.println(object.getClass().getName());
	}

	public static void main(String[] args) {
		//Player player = new Player() {};
		//AudioPlayer player = new AudioPlayer();
		FMPlayer player = new FMPlayer();

		enjoy(player);

		VideoPlayer videoPlayer = new VideoPlayer();
		//enjoy(videoPlayer);
		enjoyUnbounded(videoPlayer);
	}
}