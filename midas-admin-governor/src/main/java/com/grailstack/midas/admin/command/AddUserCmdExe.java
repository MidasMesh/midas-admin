package com.grailstack.midas.admin.command;

import com.grailstack.midas.admin.command.cmo.AddUserCmd;
import com.grailstack.midas.admin.service.UserService;
import org.xujin.halo.annotation.command.CmdHandler;
import org.xujin.halo.command.CommandExecutorI;
import org.xujin.halo.dto.ResultData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author halo codegen
 * for demo
 **/
@CmdHandler
public class AddUserCmdExe implements CommandExecutorI<ResultData<Long>, AddUserCmd> {

    @Autowired
    private UserService userService;

    @Override
    public ResultData<Long> execute(AddUserCmd addUserCmd) {
        try {
            userService.addUser(addUserCmd);
            return ResultData.success(1L);
        } catch (Exception ex) {
            return ResultData.fail("add user failed");
        }
    }

}
