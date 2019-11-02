package org.pgs.pglink;

import java.io.PrintStream;

/**
 * Easy console by PGKan
 *
 * @author PGKan
 */
public final class Console {

	private static PrintStream out = System.out;

	public static void println() {
		Console.out.println();
	}

	public static void println(Object object) {
		Console.out.println(object);
	}

	public static void printf(String format, Object... args) {
		Console.out.printf(format, args);
	}
}
