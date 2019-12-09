package cn.shmilyms.designpatterns.singleton;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import junit.framework.TestCase;

public class TestCases extends TestCase{

	public void test() {
		// TODO Auto-generated method stub
		Deque<String> queue = new ConcurrentLinkedDeque<>();
		Set<Trump> trumps = new HashSet<>();
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		List<Future<Trump>> futures = new ArrayList<>();
		
		for (int i=0;i<=5;i++)
			futures.add(es.submit(new Speech(queue)));
		
		try {
			for (Future<Trump> future : futures)
				trumps.add(future.get());
			
			for (String message : queue) 
				System.out.println(message);
			assertEquals(trumps.size(),1);
			assertEquals(Trump.getInstance().getCount(),1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally
		{
			es.shutdown();
		}
		
	}
	private static class Speech implements Callable<Trump>{
		Deque<String> queue;
		
		public Speech(Deque<String> queue) {
			this.queue = queue;
		}
		
		@Override
		public Trump call() throws Exception {
			// TODO Auto-generated method stub
			Trump trump = Trump.getInstance();
			queue.add(trump.mock());
			queue.add(trump.yell());
			return trump;
		}
		
	}
}
