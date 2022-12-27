package com.grailstack.midas.admin.converter;

import com.grailstack.midas.admin.command.cmo.AddUserCmd;
import com.grailstack.midas.admin.dataobject.UserDO;
import org.springframework.stereotype.Component;

/**
 * @author halo
 * @date 2020/9/22 10:51 上午
 * @since
 */
@Component
public class UserConverter {

    public UserDO cmdToDO(AddUserCmd addUserCmd){
        UserDO userDO=new UserDO();
        userDO.setName(addUserCmd.getUserName());
        userDO.setRole(addUserCmd.getUserRole());
        return userDO;
    }


}