package cn.com.bosssoft.jnscz.provider.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import cn.com.bosssoft.jnscz.provider.domain.User;

@Mapper
public interface UserMapper {
	@Insert("INSERT INTO user VALUES(#{username},#{password},#{account},#{age},#{name},#{sex},#{phone},#{info})")
	public boolean insertUser(User user) throws Exception;
	@Select("select * from user where username=#{username}")
	public User selectUserById(String username) throws Exception;
	@Select("select password from user where username=#{username}")
	public String selectPasswordById(String username)throws Exception;
}
