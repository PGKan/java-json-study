package test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.pgs.pglink.Console;

import com.google.gson.Gson;

/**
 * The {@code EnvironmentTest} can test whether the library is installed
 * successfully
 *
 * @author PGKan
 */
public class EnvironmentTest {

	/**
	 * Run Java application as this entry when testing the environment
	 */
	public static void main(String[] args) {
		Console.println("Environment Test");
		Console.println(EnvironmentTest.testJson());
	}

	/**
	 * Test the basic serialize and deserialize in the Gson library.
	 *
	 * @return The result message of the test
	 */
	public static String testJson() {
		Gson gson = new Gson();
		boolean input = false;
		boolean output = false;
		try {
			String object = "JsonTest [booleanTest=true, arrayTest=[strgin0, string1, string2], numberTest=32767.0, StringTest=string, objectTest=TestObject [objectContent=json test]]";
			FileReader json = new FileReader("res/json-test.json");
			JsonTestObject jsonTest = gson.fromJson(json, JsonTestObject.class);
			input = jsonTest.toString().equals(object);
		}
		catch (FileNotFoundException e) {
			System.err.println("Missing file: \"res/json-test.json\"");
		}
		String json = "{\"booleanTest\":true,\"arrayTest\":[\"strgin0\",\"string1\",\"string2\"],\"numberTest\":32767.0,\"StringTest\":\"string\",\"objectTest\":{\"objectContent\":\"json test\"}}";
		String jsonTest = gson.toJson(new JsonTestObject());
		output = jsonTest.equals(json);
		Console.println("Input test " + (input ? "succeeded!" : "failed!"));
		Console.println("Output test " + (output ? "succeeded!" : "failed!"));
		return "JSON test " + (input && output ? "succeeded!" : "failed!");
	}

}
