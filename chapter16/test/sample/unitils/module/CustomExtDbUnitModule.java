package sample.unitils.module;

import java.lang.reflect.Method;
import org.unitils.core.TestListener;
import org.unitils.dbunit.DbUnitModule;

public class CustomExtDbUnitModule extends DbUnitModule {
	
	@Override
	public TestListener getTestListener() {
		final TestListener listener = super.getTestListener();
		TestListener result = new TestListener() {
			@Override
			public void beforeTestSetUp(Object testObject, Method testMethod) {
				//之前处理方法
				beforeTestCustomSetUp(testObject, testMethod);
				listener.beforeTestSetUp(testObject, testMethod);
			}
			@Override
			public void afterTestMethod(Object testObject, Method testMethod,
					Throwable testThrowable) {
				//之后处理方法
				afterTestCustomMethod(testObject,testMethod);
				listener.afterTestMethod(testObject, testMethod, testThrowable);
			}
		};
		return result;
	}
	
	public void beforeTestCustomSetUp(Object testObject, Method testMethod){
		//编写自定义处理方法。。。
		
	}
	
	public void afterTestCustomMethod(Object testObject, Method testMethod){
		//编写自定义处理方法。。。
	}
	
}
