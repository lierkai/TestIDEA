package cn.itcast.core.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String showName() {
        return "Hello dubbo";
    }
}
