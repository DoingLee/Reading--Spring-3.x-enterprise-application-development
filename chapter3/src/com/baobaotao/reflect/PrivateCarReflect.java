package com.baobaotao.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateCarReflect {
   public static void main(String[] args) throws Throwable{
	   ClassLoader loader = Thread.currentThread().getContextClassLoader();
	   Class clazz = loader.loadClass("com.baobaotao.reflect.PrivateCar");
	   PrivateCar pcar = (PrivateCar)clazz.newInstance();
	   
	   Field colorFld = clazz.getDeclaredField("color");
	   colorFld.setAccessible(true);
	   colorFld.set(pcar,"红色");
	   
	   Method driveMtd = clazz.getDeclaredMethod("drive",(Class[])null);
       //Method driveMtd = clazz.getDeclaredMethod("drive"); JDK5.0下使用
	   driveMtd.setAccessible(true);
       driveMtd.invoke(pcar,(Object[])null);	   
  }
}
