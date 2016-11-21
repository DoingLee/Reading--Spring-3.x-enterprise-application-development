package com.baobaotao.aspectj.basic;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

import com.baobaotao.Seller;
import com.baobaotao.SmartSeller;


@Aspect
public class EnableSellerAspect {
   @DeclareParents(value="com.baobaotao.NaiveWaiter",
		   defaultImpl=SmartSeller.class)
   public  Seller seller;
}
