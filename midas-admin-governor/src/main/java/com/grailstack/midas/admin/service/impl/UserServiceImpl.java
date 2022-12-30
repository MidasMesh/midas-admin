package com.grailstack.midas.admin.service.impl;

import com.grailstack.midas.admin.service.UserService;
import com.grailstack.midas.admin.command.cmo.AddUserCmd;
import org.springframework.stereotype.Service;
import com.grailstack.midas.admin.dao.UserMapper;
import com.grailstack.midas.admin.converter.UserConverter;
import com.grailstack.midas.admin.dataobject.UserDO;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserConverter userConverter;

    @Override
    public void  addUser(AddUserCmd addUserCmd) {
        UserDO userDO= userConverter.cmdToDO(addUserCmd);
        userMapper.insert(userDO);
    }
}
