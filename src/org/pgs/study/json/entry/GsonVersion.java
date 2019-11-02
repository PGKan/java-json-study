package org.pgs.study.json.entry;

import org.pgs.pglink.Console;
import org.pgs.study.json.obj.Car;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * The {@code GsonVersion} is the demonstration of the JSON study document
 * chapter 3.6 - Version Support.
 *
 * @author PGKan
 */
public class GsonVersion {

	public static void main(String[] args) {
		GsonVersion.version3();
		GsonVersion.version2();
		GsonVersion.version1();
		GsonVersion.noVersion();
	}

	/**
	 * Serialize Object without set a version number, all fields should be included.
	 */
	private static void noVersion() {
		Gson gson = new GsonBuilder()
			.setPrettyPrinting()
			.create();
		Console.println("Gson isn't set a version number:");
		Console.println(gson.toJson(new Car()));
		Console.println();
	}

	/**
	 * Serialize Object without set a version number 1.0, only the
	 * {@code @Since(1.0)} or below and unmarked fields will be included.
	 */
	private static void version1() {
		Gson gson = new GsonBuilder()
			.setVersion(1.0)
			.setPrettyPrinting()
			.create();
		Console.println("Gson set to version 1.0:");
		Console.println(gson.toJson(new Car()));
		Console.println();
	}

	/**
	 * Serialize Object without set a version number 2.0, only the
	 * {@code @Since(2.0)} or below and unmarked fields will be included.
	 */
	private static void version2() {
		Gson gson = new GsonBuilder()
			.setVersion(2.0)
			.setPrettyPrinting()
			.create();
		Console.println("Gson set to version 2.0:");
		Console.println(gson.toJson(new Car()));
		Console.println();
	}

	/**
	 * <p>
	 * Serialize Object without set a version number 3.0, only the
	 * {@code @Since(2.0)} or below and unmarked fields will be included.
	 * </p>
	 * <p>
	 * Notice: version 3.0 is the newest version, therefored all fields will be
	 * included
	 * </p>
	 */
	private static void version3() {
		Gson gson = new GsonBuilder()
			.setVersion(3.0)
			.setPrettyPrinting()
			.create();
		Console.println("Gson set to version 3.0:");
		Console.println(gson.toJson(new Car()));
		Console.println();
	}
}
