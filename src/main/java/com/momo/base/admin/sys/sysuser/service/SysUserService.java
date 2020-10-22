package com.momo.base.admin.sys.sysuser.service;

import com.momo.base.admin.common.pojo.Result;
import com.momo.base.admin.common.service.CommonService;
import com.momo.base.admin.sys.sysuser.pojo.SysUser;
import com.momo.base.admin.sys.sysuser.vo.SysUserVo;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

public interface SysUserService extends CommonService<SysUserVo, SysUser, String> {
    Result<SysUserVo> findByLoginName(String username);
    Result<SysUserVo> resetPassword(String userId);
    PersistentTokenRepository getPersistentTokenRepository2();
}
