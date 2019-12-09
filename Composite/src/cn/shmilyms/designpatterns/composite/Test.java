package cn.shmilyms.designpatterns.composite;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBranch root = new Branch("headquarter");
		IBranch office = new Leaf("office");
		IBranch assets = new Leaf("assets");
		IBranch branch = new Branch("ny base");
		IBranch roc = new Leaf("rochester office");
		IBranch hr = new Leaf("hq hr");
		IBranch nyhr = new Leaf("ny hr");
		
		root.add(office);
		root.add(assets);
		root.add(branch);
		branch.add(roc);
		root.add(hr);
		branch.add(nyhr);
		
		root.display();
		
		branch.display();
		
		roc.add(nyhr);
		roc.remove(nyhr);
		
		branch.remove(nyhr);
		branch.display();
		
		
		
	}

}
