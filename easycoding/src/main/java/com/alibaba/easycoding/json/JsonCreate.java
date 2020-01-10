package com.alibaba.easycoding.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 利用关键字去掉不需要序列化的字段
 * @author 张弼嵩
 * @date 2020年01月06日 22:46
 */
public class JsonCreate {
	public static void main(String[] args) throws JsonProcessingException {
		User user = new User();
		user.setUserName("lisi");
		user.setAge(2);
		ObjectMapper objectMapper = new ObjectMapper();
		String string = objectMapper.writeValueAsString(user);
		System.out.println(string);
	}
}
