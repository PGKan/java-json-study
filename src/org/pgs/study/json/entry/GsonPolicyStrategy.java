package org.pgs.study.json.entry;

import org.pgs.pglink.Console;
import org.pgs.study.json.impl.ShortenedNameLowerCaseDashesStrategy;
import org.pgs.study.json.obj.Engine;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * The {@code GsonVersion} is the demonstration of the JSON study document
 * chapter 3.7.1 - Policies and Strategies.
 *
 * @author PGKan
 */
public class GsonPolicyStrategy {

	public static void main(String[] args) {
		GsonPolicyStrategy.policies();
		GsonPolicyStrategy.strategies();
	}

	/**
	 * Demonstrate the {@code FieldNamingPolicy}, and showcase the problem its may
	 * have.
	 */
	private static void policies() {
		Console.println("FieldNamingPolicy:");
		Gson gson = new GsonBuilder()
			.setPrettyPrinting()
			.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES)
			.create();
		Console.println(gson.toJson(Engine.createModelEngine()));
		Console.println();
	}

	/**
	 * Demonstrate the {@code FieldNamingStrategy} and showcase how to fix the
	 * policy problem by implementing a {@code FieldNamingStrategy} interface.
	 */
	private static void strategies() {
		Console.println("FieldNamingStrategy: ");
		Gson gson = new GsonBuilder()
			.setPrettyPrinting()
			.setFieldNamingStrategy(new ShortenedNameLowerCaseDashesStrategy())
			.create();
		Console.println(gson.toJson(Engine.createModelEngine()));
		Console.println();
	}

}
