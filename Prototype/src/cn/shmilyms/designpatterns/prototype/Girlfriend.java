package cn.shmilyms.designpatterns.prototype;

public class Girlfriend {
	
	private float height;
	private float weight;
	private String name;
	private float[] measurements;
	
	public Girlfriend getClonedGirlfriend(){
		// TODO Auto-generated method stub
		Girlfriend cloned = new Girlfriend();
		cloned.setHeight(height);
		cloned.setWeight(weight);
		cloned.setName(name);
		cloned.setMeasurements(measurements.clone());
		return cloned;
	}
	
	
	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

	public float[] getMeasurements() {
		return measurements;
	}


	public void setMeasurements(float[] measurements) {
		this.measurements = measurements;
	}


	
}
