package com.horay.a_factory_method.factory;

import com.horay.a_factory_method.bean.QixingSword;
import com.horay.a_factory_method.bean.abs.AbstractSword;
import com.horay.a_factory_method.factory.inf.ISwordFactory;

/**
 * 七星宝刀工厂
 * 
 * @author heyingcheng
 * @email heyingcheng@ctvit.com.cn
 * @date 2016年4月28日 下午11:29:53
 */
public class QixingSwordFactory implements ISwordFactory {

	@Override
	public AbstractSword createSword() {
		return new QixingSword();
	}

}
