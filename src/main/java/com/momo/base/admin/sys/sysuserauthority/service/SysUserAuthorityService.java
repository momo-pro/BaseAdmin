package com.momo.base.admin.sys.sysuserauthority.service;

import com.momo.base.admin.common.pojo.Result;
import com.momo.base.admin.common.service.CommonService;
import com.momo.base.admin.sys.sysuserauthority.pojo.SysUserAuthority;
import com.momo.base.admin.sys.sysuserauthority.vo.SysUserAuthorityVo;

import java.util.List;

public interface SysUserAuthorityService extends CommonService<SysUserAuthorityVo, SysUserAuthority, String> {
    Result<List<SysUserAuthorityVo>> findByUserId(String userId);

    Result<Boolean> saveAllByUserId(String userId, String authorityIdList);
}
