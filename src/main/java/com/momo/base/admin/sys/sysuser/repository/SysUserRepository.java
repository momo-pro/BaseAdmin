package com.momo.base.admin.sys.sysuser.repository;

import com.momo.base.admin.common.repository.CommonRepository;
import com.momo.base.admin.sys.sysuser.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRepository extends CommonRepository<SysUser, String> {
    SysUser findByLoginName(String username);
}
