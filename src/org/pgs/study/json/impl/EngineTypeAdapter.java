package org.pgs.study.json.impl;

import java.io.IOException;

import org.pgs.study.json.obj.Engine;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/**
 * The {@code EngineTypeAdapter} for (de)serializing {@code Engine}. Serialize
 * the {@code Engine} in JSON {@code List} structure only.
 */
public class EngineTypeAdapter extends TypeAdapter<Engine> {

	@Override
	public void write(JsonWriter out, Engine value) throws IOException {
		if (value == null) {
			out.nullValue();
		}
		else {
			// serialize as list instead of object
			out.beginArray();
			out.value(value.getBrand());
			out.value(value.getModel());
			out.value(value.getDisplacement());
			out.value(value.getCompressionRate());
			out.beginArray();
			out.value(value.getMaxPowerRPM()[0]);
			out.value(value.getMaxPowerRPM()[1]);
			out.endArray();
			out.beginArray();
			out.value(value.getMaxTorqueRPM()[0]);
			out.value(value.getMaxTorqueRPM()[1]);
			out.endArray();
			out.endArray();
		}
	}

	@Override
	public Engine read(JsonReader in) throws IOException {
		if (in.peek().equals(JsonToken.NULL)) {
			return null;
		}
		// deserialize as list instead of object
		in.beginArray();
		String brand = in.nextString();
		String model = in.nextString();
		double displacement = in.nextDouble();
		double compressionRate = in.nextDouble();
		in.beginArray();
		double maxPowerRPM[] = new double[2];
		maxPowerRPM[0] = in.nextDouble();
		maxPowerRPM[1] = in.nextDouble();
		in.endArray();
		in.beginArray();
		double maxTorqueRPM[] = new double[2];
		maxTorqueRPM[0] = in.nextDouble();
		maxTorqueRPM[1] = in.nextDouble();
		in.endArray();
		in.endArray();
		return new Engine(brand, model, displacement, compressionRate, maxPowerRPM, maxTorqueRPM);
	}

}
