/**
 *
 */
package test;

import java.util.Arrays;

/**
 * The {@code JsonTestObject} consists of fields which cover all possible
 * combinations of data entries in JSON format.
 *
 * @author PGKan
 */
public final class JsonTestObject {

	/**
	 * The {@code TestObjectObject} is the inner object for testing nested object in
	 * JSON.
	 */
	public final static class TestObjectObject {

		public TestObjectObject(String objectContent) {
			this.objectContent = objectContent;
		}

		private String objectContent;

		@Override
		public String toString() {
			return "TestObject [objectContent=" + this.objectContent + "]";
		}

	}

	public JsonTestObject() {
		this.booleanTest = true;
		String strings[] = { "strgin0", "string1", "string2" };
		this.arrayTest = strings.clone();
		this.numberTest = 32767.0;
		this.StringTest = "string";
		this.objectTest = new TestObjectObject("json test");
	}

	private boolean				booleanTest;
	private String[]			arrayTest;
	private double				numberTest;
	private String				StringTest;
	private TestObjectObject	objectTest;

	@Override
	public String toString() {
		return "JsonTest [booleanTest=" + this.booleanTest + ", arrayTest=" + Arrays.toString(this.arrayTest)
			+ ", numberTest=" + this.numberTest + ", StringTest=" + this.StringTest + ", objectTest=" + this.objectTest
			+ "]";
	}

}
