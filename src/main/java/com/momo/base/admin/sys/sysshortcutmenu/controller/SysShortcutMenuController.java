package com.momo.base.admin.sys.sysshortcutmenu.controller;

import com.momo.base.admin.common.controller.CommonController;
import com.momo.base.admin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import com.momo.base.admin.sys.sysshortcutmenu.service.SysShortcutMenuService;
import com.momo.base.admin.sys.sysshortcutmenu.vo.SysShortcutMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/sysShortcutMenu/")
public class SysShortcutMenuController extends CommonController<SysShortcutMenuVo, SysShortcutMenu, String> {
    @Autowired
    private SysShortcutMenuService sysShortcutMenuService;
}
