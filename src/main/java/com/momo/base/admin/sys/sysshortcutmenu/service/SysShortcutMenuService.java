package com.momo.base.admin.sys.sysshortcutmenu.service;

import com.momo.base.admin.common.pojo.Result;
import com.momo.base.admin.common.service.CommonService;
import com.momo.base.admin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import com.momo.base.admin.sys.sysshortcutmenu.vo.SysShortcutMenuVo;

import java.util.List;

public interface SysShortcutMenuService extends CommonService<SysShortcutMenuVo, SysShortcutMenu, String> {
    Result<List<SysShortcutMenuVo>> findByUserId(String userId);
}
