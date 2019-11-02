package org.pgs.study.json.obj;

import java.util.Arrays;

/**
 * The object {@code Engine} consists of the brand name, the model name,
 * horsepower specifications, and torque specifications.
 *
 * @author PGKan
 */
public class Engine {

	/**
	 * Create an {@code Engine} for model car.
	 *
	 * @return the model engine
	 */
	public static Engine createModelEngine() {
		double maxPowerRPM[] = new double[2];
		maxPowerRPM[0] = 192.4;
		maxPowerRPM[1] = 3400.0;
		double maxTorqueRPM[] = new double[2];
		maxTorqueRPM[0] = 63.2;
		maxTorqueRPM[1] = 2400.0;
		return new Engine("Mercedes-Benz", "4MATIC G-TRONIC", 15.5, 2987, maxPowerRPM, maxTorqueRPM);
	}

	/**
	 * Construct an {@code Engine} with the data of the engine of TOYOTA PRIUS α.
	 */
	public Engine() {
		this("TOYOTA", "2ZR-FXE", 1798, 13, new double[2], new double[2]);
		this.maxPowerRPM[0] = 99;
		this.maxPowerRPM[1] = 5200;
		this.maxPowerRPM[0] = 14.5;
		this.maxPowerRPM[1] = 4000;
	}

	/**
	 * Construct an {@code Engine} with the data given.
	 *
	 * @param brand
	 *        The brand name of the engine
	 * @param model
	 *        The model name of the engine
	 * @param displacement
	 *        The displacement of the engine
	 * @param compressionRate
	 *        The compression rate of the engine
	 * @param maxPowerRPM
	 *        The horsepower parameter of the engine
	 * @param maxTorqueRPM
	 *        The torque parameter of the engine
	 */
	public Engine(
		String brand, String model, double displacement, double compressionRate, double[] maxPowerRPM,
		double[] maxTorqueRPM
	) {
		this.brand = brand;
		this.model = model;
		this.displacement = displacement;
		this.compressionRate = compressionRate;
		this.maxPowerRPM = maxPowerRPM.clone();
		this.maxTorqueRPM = maxTorqueRPM.clone();
	}

	private String	brand;
	private String	model;
	private double	displacement;
	private double	compressionRate;
	private double	maxPowerRPM[];
	private double	maxTorqueRPM[];

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return this.brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * @return the displacement
	 */
	public double getDisplacement() {
		return this.displacement;
	}

	/**
	 * @return the compressionRate
	 */
	public double getCompressionRate() {
		return this.compressionRate;
	}

	/**
	 * @return the maxPowerRPM
	 */
	public double[] getMaxPowerRPM() {
		return this.maxPowerRPM;
	}

	/**
	 * @return the maxTorqueRPM
	 */
	public double[] getMaxTorqueRPM() {
		return this.maxTorqueRPM;
	}

	@Override
	public String toString() {
		return "Engine [brand="
			+ this.brand + ", model=" + this.model + ", displacement=" + this.displacement + ", compressionRate="
			+ this.compressionRate + ", maxPowerRPM=" + Arrays.toString(this.maxPowerRPM) + ", maxTorqueRPM="
			+ Arrays.toString(this.maxTorqueRPM) + "]";
	}

}
