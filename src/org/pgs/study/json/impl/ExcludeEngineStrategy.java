package org.pgs.study.json.impl;

import java.lang.reflect.Modifier;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

/**
 * The {@code ExcludeEngineStrategy} implemented to skip all fields are
 * named with "engine" and have the modifier "static", and not skip any class
 * type.
 */
public class ExcludeEngineStrategy implements ExclusionStrategy {

	@Override
	public boolean shouldSkipField(FieldAttributes f) {
		return f.getName().equals("engine")
			|| f.hasModifier(Modifier.STATIC);
	}

	@Override
	public boolean shouldSkipClass(Class<?> clazz) {
		return false;
	}

}
