package cn.shmilyms.designpatterns.flyweight;

import java.util.Arrays;
import java.util.List;

public class HealthQuestionaire extends AbstractQuestionaire {
	
	@Override
	protected List<String> generateQuestions() {
		// TODO Auto-generated method stub
		List<String> qs = Arrays.asList("Do you eat everyday?","Do you drink everyday?");
		return qs;
	}

}
