package com.baobaotao.advisor;

import org.springframework.aop.support.IntroductionInfoSupport;

import com.baobaotao.introduce.ControllablePerformaceMonitor;
import com.baobaotao.introduce.Monitorable;
import com.baobaotao.introduce.Testable;

public class MyIntroduceInfo extends IntroductionInfoSupport{
   public MyIntroduceInfo(){
	   super();
	   super.publishedInterfaces.add(Monitorable.class);
   }
}
