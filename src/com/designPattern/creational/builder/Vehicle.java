package com.designPattern.creational.builder;

public class Vehicle {
	private int tyres;
	private int seats;

	private int strokes;
	private boolean airbags;
	private boolean powerStearing;
	private boolean powerWindows;

	private Vehicle(VehicleBuilder vehicleBuilder) {
		this.tyres = vehicleBuilder.tyres;
		this.seats = vehicleBuilder.seats;
		this.strokes = vehicleBuilder.strokes;
		this.airbags = vehicleBuilder.airbags;
		this.powerStearing = vehicleBuilder.powerStearing;
		this.powerWindows = vehicleBuilder.powerWindows;
	}

	public static class VehicleBuilder {
		private int tyres;
		private int seats;

		private int strokes;
		private boolean airbags;
		private boolean powerStearing;
		private boolean powerWindows;

		public VehicleBuilder(int tyres, int seats) {
			this.tyres = tyres;
			this.seats = seats;
		}

		public VehicleBuilder setStrokes(int strokes) {
			this.strokes = strokes;
			return this;
		}

		public VehicleBuilder setAirbags(boolean airbags) {
			this.airbags = airbags;
			return this;
		}

		public VehicleBuilder setPowerStearing(boolean powerStearing) {
			this.powerStearing = powerStearing;
			return this;
		}

		public VehicleBuilder setPowerWindows(boolean powerWindows) {
			this.powerWindows = powerWindows;
			return this;
		}

		public Vehicle build() {
			return new Vehicle(this);
		}
	}

	@Override
	public String toString() {
		return "Vehicle [tyres=" + tyres + ", seats=" + seats + ", strokes=" + strokes + ", airbags=" + airbags
				+ ", powerStearing=" + powerStearing + ", powerWindows=" + powerWindows + "]";
	}
}