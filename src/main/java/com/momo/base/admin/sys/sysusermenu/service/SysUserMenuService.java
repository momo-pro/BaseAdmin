package com.momo.base.admin.sys.sysusermenu.service;

import com.momo.base.admin.common.pojo.Result;
import com.momo.base.admin.common.service.CommonService;
import com.momo.base.admin.sys.sysmenu.vo.SysMenuVo;
import com.momo.base.admin.sys.sysusermenu.pojo.SysUserMenu;
import com.momo.base.admin.sys.sysusermenu.vo.SysUserMenuVo;

import java.util.List;

public interface SysUserMenuService extends CommonService<SysUserMenuVo, SysUserMenu, String> {
    Result<List<SysMenuVo>> findByUserId(String userId);

    Result<Boolean> saveAllByUserId(String userId, String menuIdList);
}
