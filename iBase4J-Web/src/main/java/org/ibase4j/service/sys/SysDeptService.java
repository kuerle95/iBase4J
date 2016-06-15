package org.ibase4j.service.sys;

import org.ibase4j.core.base.BaseService;
import org.ibase4j.core.support.dubbo.spring.annotation.DubboReference;
import org.ibase4j.model.generator.SysDept;
import org.ibase4j.provider.sys.SysDeptProvider;
import org.springframework.stereotype.Service;

/**
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:16:07
 */
@Service
public class SysDeptService extends BaseService<SysDeptProvider, SysDept> {
	@DubboReference
	public void setProvider(SysDeptProvider provider) {
		this.provider = provider;
	}
}
