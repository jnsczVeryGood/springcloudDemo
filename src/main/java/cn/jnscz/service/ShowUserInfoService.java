package cn.jnscz.service;

import cn.jnscz.domain.User;

public interface ShowUserInfoService {
    public User showInfo(String username) throws Exception;
}
