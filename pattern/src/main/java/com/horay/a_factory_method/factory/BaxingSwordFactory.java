package com.horay.a_factory_method.factory;

import com.horay.a_factory_method.bean.BaxingSword;
import com.horay.a_factory_method.bean.abs.AbstractSword;
import com.horay.a_factory_method.factory.inf.ISwordFactory;

/**
 * 七星宝刀工厂
 * 
 * @author heyingcheng
 * @email heyingcheng@ctvit.com.cn
 * @date 2016年4月28日 下午11:29:01
 */
public class BaxingSwordFactory implements ISwordFactory {

	@Override
	public AbstractSword createSword() {
		return new BaxingSword();
	}

}
