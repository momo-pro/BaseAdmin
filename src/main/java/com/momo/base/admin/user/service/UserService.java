package com.momo.base.admin.user.service;

import com.momo.base.admin.common.pojo.Result;
import com.momo.base.admin.sys.sysuser.vo.SysUserVo;

public interface UserService {
    Result<SysUserVo> updatePassword(String oldPassword, String newPassword);

    Result<SysUserVo> updateUser(SysUserVo sysUserVo);
}
