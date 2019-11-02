package org.pgs.study.json.entry;

import java.lang.reflect.Modifier;

import org.pgs.pglink.Console;
import org.pgs.study.json.impl.ExcludeEngineStrategy;
import org.pgs.study.json.obj.Car;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * The {@code GsonExclusion} is the demonstration of the JSON study document
 * chapter 3.5 - Field Exclusion.
 *
 * @author PGKan
 */
public class GsonExclusion {

	public static void main(String[] args) {
		Gson gson = new GsonBuilder()
			.excludeFieldsWithModifiers(Modifier.TRANSIENT)
			.setExclusionStrategies(new ExcludeEngineStrategy())
			.setPrettyPrinting()
			.create();
		// with ExcludeEngineStrategy
		Console.println(gson.toJson(new Car()));
		gson = new GsonBuilder()
			.excludeFieldsWithModifiers(Modifier.TRANSIENT)
			.setPrettyPrinting()
			.create();
		// without ExcludeEngineStrategy
		Console.println(gson.toJson(new Car()));
	}

}
