package com.javaNewFeatures.java7;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class FileChangeNotifications {
	public static void main(String[] args) {
		String filePath = "C:\\Temps\\";

		Path path = Paths.get(filePath);
		WatchService watchService = null;
		try {
			watchService = FileSystems.getDefault().newWatchService();
			path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
					StandardWatchEventKinds.ENTRY_MODIFY);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		WatchKey key = null;
		while (true) {
			try {
				key = watchService.take();
				for (WatchEvent<?> event : key.pollEvents()) {
					Kind<?> kind = event.kind();
					System.out.println("Event on - " + event.context().toString() + " | is - " + kind);
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

			boolean reset = key.reset();
			if (!reset)
				break;
		}
	}
}