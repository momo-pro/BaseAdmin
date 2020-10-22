package com.momo.base.admin.sys.sysshortcutmenu.repository;

import com.momo.base.admin.common.repository.CommonRepository;
import com.momo.base.admin.sys.sysshortcutmenu.pojo.SysShortcutMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysShortcutMenuRepository extends CommonRepository<SysShortcutMenu, String> {
    List<SysShortcutMenu> findByUserId(String userId);
}
