package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("from app runner");
		//option args
		Set<String> names = args.getOptionNames();
		System.out.println(names);
		
		List<String> optionValues = args.getOptionValues("name");
		
		System.out.println(optionValues);
		
		boolean containsOption = args.containsOption("branch");
		System.out.println(containsOption);
		
		//non option args
		List<String> nonOptionArgs = args.getNonOptionArgs();
		System.out.println(nonOptionArgs);
		
		//source args
		String[] sourceArgs = args.getSourceArgs();
		System.out.println(Arrays.asList(sourceArgs));
		
	}

}
