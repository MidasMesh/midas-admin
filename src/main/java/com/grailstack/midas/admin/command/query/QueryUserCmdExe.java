package com.grailstack.midas.admin.command.query;

import org.xujin.halo.command.CommandExecutorWithoutInputI;
import org.xujin.halo.dto.ResultData;
import com.grailstack.midas.admin.command.co.UserCO;

import java.util.List;

/**
 * @author xujin
 * @date 2020/9/22 10:46 上午
 * @since
 */
public class QueryUserCmdExe implements CommandExecutorWithoutInputI<ResultData<List<UserCO>>> {

    @Override
    public ResultData<List<UserCO>> execute() {
        return null;
    }
}