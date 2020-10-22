package com.momo.base.admin.sys.sysusermenu.repository;

import com.momo.base.admin.common.repository.CommonRepository;
import com.momo.base.admin.sys.sysusermenu.pojo.SysUserMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMenuRepository extends CommonRepository<SysUserMenu, String> {
    List<SysUserMenu> findByUserId(String userId);
}
