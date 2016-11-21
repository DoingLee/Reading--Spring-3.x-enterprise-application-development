package com.baobaotao;

import com.baobaotao.anno.NeedTest;

public interface Waiter {
	@NeedTest
	public void greetTo(String clientName);	
	public void serveTo(String clientName);
}
