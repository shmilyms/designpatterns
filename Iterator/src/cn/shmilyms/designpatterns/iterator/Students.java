package cn.shmilyms.designpatterns.iterator;

import java.util.Iterator;

public class Students implements Iterable<String>{
	private String[] stu;
	
	public Students(String[] students) {
		stu = students;
	}
	
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new StuIterator(this);
	}
	
	private class StuIterator implements Iterator<String>{
		
		private String[] stu;
		private int cursor;
		
		public StuIterator(Students students){
			this.stu = students.stu;
			cursor = 0;
			
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return cursor < stu.length;
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			return stu[cursor++];
		}
		
	}
	
}
