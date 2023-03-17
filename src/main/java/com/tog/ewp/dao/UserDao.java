package com.tog.ewp.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDao {
	
	private SqlSessionTemplate sqlSession;
	
	
}
