package com.horay.a_factory_method.factory.inf;

import com.horay.a_factory_method.bean.abs.AbstractSword;

/**
 * 宝刀工厂
 * 
 * @author heyingcheng
 * @email heyingcheng@ctvit.com.cn
 * @date 2016年4月28日 下午10:50:03
 */
public interface ISwordFactory {

	/**
	 * 创建宝刀
	 * 
	 * @author heyingcheng
	 * @date 2016年4月28日 下午11:01:13
	 * @return
	 * @return AbstractDao
	 */
	public AbstractSword createSword();

}
