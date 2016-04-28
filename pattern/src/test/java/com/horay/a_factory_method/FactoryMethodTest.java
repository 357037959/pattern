package com.horay.a_factory_method;

import org.junit.Test;

import com.horay.a_factory_method.bean.abs.AbstractSword;
import com.horay.a_factory_method.factory.BaxingSwordFactory;
import com.horay.a_factory_method.factory.QixingSwordFactory;
import com.horay.a_factory_method.factory.inf.ISwordFactory;

/**
 * 工厂模式单元测试类
 * 
 * @author heyingcheng
 * @email heyingcheng@ctvit.com.cn
 * @date 2016年4月28日 下午11:29:36
 */
public class FactoryMethodTest {

	@Test
	public void testQixingFactory() {
		ISwordFactory factory = new QixingSwordFactory();
		AbstractSword sword = factory.createSword();
		System.out.println(String.format("曹操使用“%s”杀董卓", sword.getName()));
	}

	@Test
	public void testBaxingFactory() {
		ISwordFactory factory = new BaxingSwordFactory();
		AbstractSword sword = factory.createSword();
		System.out.println(String.format("曹操使用“%s”杀董卓", sword.getName()));
	}

}
