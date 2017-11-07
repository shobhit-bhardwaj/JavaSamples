package com.miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class JavaHeapSpaceError {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		while(true) {
			list.add("Hello World");
		}
	}
}

//	VM Argument Passed in Run Configuration - -Xmx20m