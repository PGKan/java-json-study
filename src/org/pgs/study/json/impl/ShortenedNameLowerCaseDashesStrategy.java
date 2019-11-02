package org.pgs.study.json.impl;

import java.lang.reflect.Field;

import com.google.gson.FieldNamingStrategy;

/**
 * The {@code ShortenedNameLowerCaseDashesStrategy} implemented to break down a
 * small camel case field name into it separate word with keeping any shortened
 * word as is.
 */
public class ShortenedNameLowerCaseDashesStrategy implements FieldNamingStrategy {

	@Override
	public String translateName(Field f) {
		char originalChars[] = f.getName().toCharArray();
		String newName = "";
		boolean previousCapital = false;
		for (char originalChar : originalChars) {
			boolean currentCapital = originalChar > 0x40 && originalChar < 0x5B;
			// will not separate the word with "-" if there are continuous upper case
			newName += !previousCapital && currentCapital ? "-" : "";
			// turn all character into lower case
			newName += (char) (currentCapital ? originalChar + 0x20 : originalChar);
			previousCapital = currentCapital;
		}
		return newName;
	}

}
