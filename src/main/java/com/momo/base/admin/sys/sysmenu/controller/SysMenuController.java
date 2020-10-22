package com.momo.base.admin.sys.sysmenu.controller;

import com.momo.base.admin.annotation.Decrypt;
import com.momo.base.admin.annotation.Encrypt;
import com.momo.base.admin.common.controller.CommonController;
import com.momo.base.admin.common.pojo.Result;
import com.momo.base.admin.sys.sysmenu.pojo.SysMenu;
import com.momo.base.admin.sys.sysmenu.service.SysMenuService;
import com.momo.base.admin.sys.sysmenu.vo.SysMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/sys/sysMenu/")
public class SysMenuController extends CommonController<SysMenuVo, SysMenu, String> {
    @Autowired
    private SysMenuService sysMenuService;

    @GetMapping("menu")
    public ModelAndView menu(){
        return new ModelAndView("sys/menu/menu");
    }

    /**
     * 分层级
     */
    @PostMapping("listByTier")
    @Decrypt
    @Encrypt
    public Result<List<SysMenuVo>> listByTier(SysMenuVo entityVo) {
        return sysMenuService.listByTier(entityVo);
    }
}
