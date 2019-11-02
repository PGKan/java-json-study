package org.pgs.study.json.entry;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.pgs.pglink.Console;
import org.pgs.study.json.obj.Car;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

/**
 * The {@code GsonBasic} is the demonstration of the JSON study document chapter
 * 3.2 - Create a Gson Object to 3.4 - Deserialization.
 *
 * @author PGKan
 */
public class GsonBasic {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		// chapter 3.2 - Create a Gson Object
		Gson gson = new GsonBuilder()
			.setPrettyPrinting()
			.create();
		// chapter 3.3 - Serialization
		GsonBasic.serialize(gson);
		// chapter 3.4 - Deserialization
		GsonBasic.deserialize(gson);
	}

	/**
	 * Demonstrate the serialize and the mapping of each type of java `Object` and
	 * JSON data types.
	 *
	 * @param gson
	 *        The {@code Gson} instance to use
	 */
	public static void serialize(Gson gson) {
		Console.println("Serialise Java object and wrapper type to json strings");
		Console.println("\nBoolean: ");
		Console.println(gson.toJson(new Boolean(true)));
		Console.println("\nInteger: ");
		Console.println(gson.toJson(new Integer(Integer.MAX_VALUE)));
		Console.println("\nDouble: ");
		Console.println(gson.toJson(new Double(Double.MAX_VALUE)));
		Console.println("\nCharacter: ");
		Console.println(gson.toJson(new Character('C')));
		Console.println("\nString: ");
		Console.println(gson.toJson("String"));
		List<String> list = new ArrayList<>();
		Console.println("\nList: ");
		Console.println(gson.toJson(list));
		Set<String> set = new HashSet<>();
		set.add("set item 0");
		set.add("set item 1");
		set.add("set item 2");
		Console.println("\nSet: ");
		Console.println(gson.toJson(set));
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "map item 0");
		map.put(1, "map item 1");
		map.put(2, "map item 2");
		Console.println("\nMap: ");
		Console.println(gson.toJson(map));
		String strings[] = { "string 0", "string 1", "string 2" };
		Console.println("\nArray: ");
		Console.println(gson.toJson(strings));
		Console.println("\nObject: ");
		Console.println(gson.toJson(new Car()));
	}

	/**
	 * Demonstrate the deserialization of the a JSON file, "res/car.json"
	 *
	 * @param gson
	 *        The {@code Gson} instance to use
	 */
	public static void deserialize(Gson gson) throws FileNotFoundException, JsonIOException, JsonSyntaxException {
		Console.println("\nDeserialise json strings to java Object");
		Console.println("\nDefault Car:");
		Console.println(new Car());
		Console.println("\nDeserialized Car:");
		Console.println(gson.fromJson(new FileReader("res/car.json"), Car.class));
	}

}
