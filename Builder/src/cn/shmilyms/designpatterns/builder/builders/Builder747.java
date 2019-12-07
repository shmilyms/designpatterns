package cn.shmilyms.designpatterns.builder.builders;

public class Builder747 extends AbstractBuilder {

	@Override
	protected void buildWings() {
		// TODO Auto-generated method stub
		System.out.println("747 wings.");
	}

	@Override
	protected void buildEngine() {
		// TODO Auto-generated method stub
		System.out.println("747 engines.");
	}

	@Override
	protected void buildFramework() {
		// TODO Auto-generated method stub
		System.out.println("747 framework.");
	}

	@Override
	protected void buildDevices() {
		// TODO Auto-generated method stub
		System.out.println("747 devices.");
	}

	@Override
	protected void postBuild() {
		// TODO Auto-generated method stub
		System.out.println("Boeing 747 assembled.");
	}

	@Override
	protected void preBuild() {
		// TODO Auto-generated method stub
		System.out.println("Start building Boeing 747.");
	}

}
