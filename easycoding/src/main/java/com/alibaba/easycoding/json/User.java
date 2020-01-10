package com.alibaba.easycoding.json;

import lombok.Data;

/**
 * xxx
 * @author 张弼嵩
 * @date 2020年01月06日 22:45
 */
@Data
public class User {

	private String userName;
	private transient   Integer age;

}
