package com.baobaotao.aspectj.fun;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.core.Ordered;

import com.baobaotao.Seller;
import com.baobaotao.SmartSeller;

@Aspect
public class EnableSellerAspect implements Ordered {
	@DeclareParents(value = "com.baobaotao.NaiveWaiter", defaultImpl = SmartSeller.class)
	public static Seller seller;
	public int getOrder() {
		return 2;
	}
}
