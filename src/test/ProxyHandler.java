/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler   
{	
	Object object;
	
	public  ProxyHandler(Object object) {
		// TODO Auto-generated constructor stub
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("before");
		for (Object object : args) {
			System.out.println(object);
		}
		Object rep = method.invoke(object, args);
		System.out.println(rep);
		System.out.println("after");
		return null;
	}   
	
} 