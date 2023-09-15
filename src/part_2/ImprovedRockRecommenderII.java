package part_2;

import java.util.Scanner;

/**
 * This class is a refactoring of the ImprovedRockRecommender for Project 4.4.
 */
public class ImprovedRockRecommenderII {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Pseudocode:
		// 1. Print welcome message.
		// 2. Do the following while user wants to continue:
		//    2.1 Get the user's rock style preference.
		//    2.2 Get the user's favorite modern artist or band.
		//    2.3 Get the user's mood or tempo preference.
		//    2.4 Recommend a 60's rock band based on preferences.
		//    2.5 Ask the user if they want to continue.
		// 3. Print goodbye message.

		print("Hey! Let's rock! (60's only)");

		do {
			String style = getUserString("Which style of rock you " +
					"like? (e.g., psychedelic, blues, folk, hard rock) ");
			String modernArtist = getUserString("Who's your favorite" +
					" modern artist or band? ");
			String mood = getUserString("Any specific mood or tempo" +
					" preference? (e.g., upbeat, melancholic, fast, slow) " +
					"[Type 'none' if no specific preference] ");
			recommendBand(style, modernArtist, mood);

		} while (getUserContinueInput().equalsIgnoreCase("Y"));

		print("Goodbye! Have a froody day.");
	}

	private static String getUserString(String prompt) {
		print(prompt);
		return scanner.nextLine().toLowerCase();
	}

	private static String getUserContinueInput() {
		return getUserString("Do you want to continue? (Y/N)");
	}

	private static void print(String message) {
		System.out.println(message);
	}

	private static void recommendBand(
			String style, String modernArtist, String mood) {
		switch (style) {
			case "psychedelic" -> recommendPsychedelic(modernArtist);
			case "blues" -> recommendBlues(mood);
			case "folk" -> recommendFolk(modernArtist);
			case "hard rock" -> recommendHardRock(mood);
			default -> print("The '60s were a treasure trove of rock bands." +
					" Maybe start with 'The Beatles' and explore from there!");
		}
	}

	private static void recommendPsychedelic(String modernArtist) {
		if (modernArtist.contains("frusciante")) {
			print("You might enjoy 'The Doors' or 'Jimi Hendrix Experience'.");
		} else {
			print("'Pink Floyd' or 'Grateful Dead' would be a great fit " +
					"for psychedelic lovers.");
		}
	}

	private static void recommendBlues(String mood) {
		if ("upbeat".equals(mood)) {
			print("'The Rolling Stones' early albums have a strong blues" +
					" influence and are quite upbeat.");
		} else {
			print("You might appreciate 'Cream' or 'Led Zeppelin's early" +
					" blues-inspired tracks.");
		}
	}

	private static void recommendFolk(String modernArtist) {
		if (modernArtist.contains("mumford")) {
			print("'The Byrds' or 'Simon & Garfunkel' would resonate with" +
					" you.");
		} else {
			print("'Bob Dylan' is a must-listen for folk rock enthusiasts.");
		}
	}

	private static void recommendHardRock(String mood) {
		if ("fast".equals(mood)) {
			print("'The Who' or early 'Led Zeppelin' would be right up your" +
					" alley.");
		} else {
			print("Give 'Deep Purple' a try!");
		}
	}
}
