package com.momo.base.admin.sys.sysmenu.repository;

import com.momo.base.admin.common.repository.CommonRepository;
import com.momo.base.admin.sys.sysmenu.pojo.SysMenu;
import org.springframework.stereotype.Repository;

@Repository
public interface SysMenuRepository extends CommonRepository<SysMenu, String> {
}
