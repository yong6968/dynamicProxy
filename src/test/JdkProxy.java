/*
 * Copyright (C) 2015 ShenZhen HeShiDai Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳合时代金融服务有限公司 www.heshidai.com.
 */
package test;

import java.lang.reflect.Proxy;


public class JdkProxy {
	public static void main( String args[] )   
	{   
		
		Subject proxySubject = (Subject)Proxy.newProxyInstance(Subject.class.getClassLoader(),
				new Class[]{Subject.class},
				new ProxyHandler(new RealSubject()));
		
		proxySubject.doSomething("aa");
		
	}
}
