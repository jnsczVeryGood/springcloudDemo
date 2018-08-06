package cn.jnscz.mapper;

import org.mybatis.spring.annotation.MapperScan;

import cn.jnscz.domain.User;

@MapperScan
public interface UserMapper {
	public User selectUserById(String username) throws Exception;
}
