/**
 * 
 */
package com.orderSys.taskManager;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author mello
 */
@Configuration
@EnableAsync
public class AppConfig implements AsyncConfigurer{
	
	@Bean
	public OrderTask task(){
		return new OrderTask(); 
	}

	/* (non-Javadoc)
	 * @see org.springframework.scheduling.annotation.AsyncConfigurer#getAsyncExecutor()
	 */
	@Override
	public Executor getAsyncExecutor() {
		// TODO Auto-generated method stub
		ThreadPoolTaskExecutor excutor = new ThreadPoolTaskExecutor();
		excutor.setCorePoolSize(10);
		excutor.setMaxPoolSize(50);
		excutor.setQueueCapacity(10);
		excutor.initialize();
		
		return excutor;
	}
	

}
