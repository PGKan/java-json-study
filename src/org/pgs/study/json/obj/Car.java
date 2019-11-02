package org.pgs.study.json.obj;

import com.google.gson.annotations.Since;

/**
 * The object {@code Car} consists of the brand name, model bane, passager
 * capacity, and the object {@code Engine}.
 *
 * @author PGKan
 */
public class Car {

	/**
	 * Construct a {@code Car} with the data of the TOYOTA PRIUS α.
	 */
	public Car() {
		this("TOYOTA", "PRIUS α", 7, new Engine());
	}

	/**
	 * Construct a {@code Car} with the data given.
	 *
	 * @param brand
	 *        The brand name of the car
	 * @param model
	 *        The model name of the car
	 * @param capacity
	 *        The passager capcity of the car
	 * @param engine
	 *        A {@code Engine} object of the car
	 */
	public Car(String brand, String model, int capacity, Engine engine) {
		this.brand = brand;
		this.model = model;
		this.capacity = capacity;
		this.engine = engine;
	}

	/** The model car Mercedes-Benz GLS 350d */
	public static Car MODEL_CAR = new Car("Mercedes-Benz", "GLS 350d", 7, Engine.createModelEngine());

	private String	brand;
	@Since(1.0)
	private String	model;
	@Since(2.0)
	private int		capacity;
	@Since(3.0)
	private Engine	engine;

	@Override
	public String toString() {
		return "Car [brand=" + this.brand + ", model=" + this.model + ", capacity=" + this.capacity + ", engine="
			+ this.engine + "]";
	}
}
