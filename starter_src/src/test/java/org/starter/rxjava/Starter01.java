package org.starter.rxjava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

public class Starter01 {

	@Test
	public void z001() throws InterruptedException, ExecutionException {
		ExecutorService threadPool = Executors.newFixedThreadPool(8);
		
		List<String> batches = new ArrayList<>();
		
		Callable<String> t = new Callable<String>() {
			@Override
			public String call() throws Exception {
				
				synchronized(batches) {
					String s = "abc";
					batches.add(s);
					return s;
				}
			}
		};
		
		Future<String> f = threadPool.submit(t);
		String result = f.get();
		System.out.println(result);
	}
	
}
