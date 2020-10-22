package com.momo.base.admin.sys.sysmenu.service;

import com.momo.base.admin.common.pojo.Result;
import com.momo.base.admin.common.service.CommonService;
import com.momo.base.admin.sys.sysmenu.pojo.SysMenu;
import com.momo.base.admin.sys.sysmenu.vo.SysMenuVo;

import java.util.List;

public interface SysMenuService extends CommonService<SysMenuVo, SysMenu, String> {
    Result<List<SysMenuVo>> listByTier(SysMenuVo entityVo);
}
