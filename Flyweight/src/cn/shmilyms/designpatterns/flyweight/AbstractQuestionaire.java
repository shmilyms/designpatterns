package cn.shmilyms.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractQuestionaire implements Iterable<Question>{
	private List<Question> questions;
	
	protected AbstractQuestionaire(){
		
		List<String> qs = generateQuestions();
		
		this.questions = new ArrayList<>(qs.size());
		
		qs.forEach((e)->{
			Question q = new Question();
			q.setQuestion(e);
			this.questions.add(q);
			});			
	}
	
	
	protected abstract List<String> generateQuestions();
	
	public List<String> getResults() {
		// TODO Auto-generated method stub
		List<String> qs = new ArrayList<>();
		this.forEach((q)->qs.add(q.getAnswer()));
		return qs;
	}
	
	public List<String> getQuestions() {
		// TODO Auto-generated method stub
		List<String> qs = new ArrayList<>();
		this.forEach((q)->qs.add(q.getQuestion()));
		return qs;
	}
	
	
	public void reset() {
		for (Question q : this) {
			q.resetAnswer();
		}
	}
	
	@Override
	public Iterator<Question> iterator() {
		// TODO Auto-generated method stub
		return questions.iterator();
	}
	
	public void display() {
		this.questions.forEach((q)->System.out.println("Question - "+q.getQuestion() +" Answer - "+q.getAnswer()));
	}
		
}
