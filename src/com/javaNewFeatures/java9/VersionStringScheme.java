package com.javaNewFeatures.java9;

public class VersionStringScheme {
	public static void main(String[] args) {
		Runtime.Version version = Runtime.version();

		System.out.println("Current Version - " + version);
		System.out.println("Major Version - " + version.major());
		System.out.println("Minor Version - " + version.minor());
		System.out.println("Security Version - " + version.security());
		System.out.println("Pre-Released - " + version.pre().orElse("None"));
		System.out.println("Build Number - " + version.build().get());
	}
}