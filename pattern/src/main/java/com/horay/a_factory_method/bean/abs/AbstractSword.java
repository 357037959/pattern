package com.horay.a_factory_method.bean.abs;

import java.io.Serializable;

/**
 * 宝刀抽象类
 * 
 * @author heyingcheng
 * @email heyingcheng@ctvit.com.cn
 * @date 2016年4月28日 下午11:27:57
 */
public abstract class AbstractSword implements Serializable {

	/**  */
	private static final long serialVersionUID = -3619517357820870785L;

	/**  */
	private String name;

	public AbstractSword() {
		super();
	}

	public AbstractSword(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
