package cn.shmilyms.designpatterns.builder.builders;

public abstract class AbstractBuilder {
	
	protected abstract void buildWings();
	protected abstract void buildEngine();
	protected abstract void buildFramework();
	protected abstract void buildDevices();
	
	protected void postBuild() {};
	protected void preBuild() {};
	
	public void buildAircraft() {
		preBuild();
		
		buildWings();
		buildEngine();
		buildFramework();
		buildDevices();
		
		postBuild();
	}

}
