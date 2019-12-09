package cn.shmilyms.designpatterns.iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students students = new Students(new String[] {"jim raynor","kerrigan","artanis","zeratu"});
		for (String stu : students) {
			System.out.println(stu);
		}
	}

}
