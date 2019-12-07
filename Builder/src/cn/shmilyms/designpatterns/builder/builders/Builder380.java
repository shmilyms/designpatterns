package cn.shmilyms.designpatterns.builder.builders;

public class Builder380 extends AbstractBuilder {

	@Override
	protected void buildWings() {
		// TODO Auto-generated method stub
		System.out.println("A380 wings.");
	}

	@Override
	protected void buildEngine() {
		// TODO Auto-generated method stub
		System.out.println("A380 engines.");
	}

	@Override
	protected void buildFramework() {
		// TODO Auto-generated method stub
		System.out.println("A380 framework.");
	}

	@Override
	protected void buildDevices() {
		// TODO Auto-generated method stub
		System.out.println("A380 devices.");
	}

	@Override
	protected void postBuild() {
		// TODO Auto-generated method stub
		System.out.println("Airbus A380 assembled.");
	}

	@Override
	protected void preBuild() {
		// TODO Auto-generated method stub
		System.out.println("Start building Airbus A380.");
	}

}
