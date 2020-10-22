package com.momo.base.admin.sys.syssetting.repository;

import com.momo.base.admin.common.repository.CommonRepository;
import com.momo.base.admin.sys.syssetting.pojo.SysSetting;
import org.springframework.stereotype.Repository;

@Repository
public interface SysSettingRepository extends CommonRepository<SysSetting, String> {
}
