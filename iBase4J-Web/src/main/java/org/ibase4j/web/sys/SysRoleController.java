package org.ibase4j.web.sys;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.ibase4j.core.base.BaseController;
import org.ibase4j.core.util.Request2ModelUtil;
import org.ibase4j.core.util.WebUtil;
import org.ibase4j.model.generator.SysRole;
import org.ibase4j.service.sys.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

/**
 * 角色管理
 * 
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:15:43
 */
@RestController
@RequestMapping("role")
public class SysRoleController extends BaseController {
	@Autowired
	private SysRoleService sysRoleService;

	@RequestMapping(value = "/read/list")
	public Object get(HttpServletRequest request, ModelMap modelMap) {
		Map<String, Object> params = WebUtil.getParameterMap(request);
		PageInfo<?> list = sysRoleService.query(params);
		return setSuccessModelMap(modelMap, list);
	}

	// 详细信息
	@RequestMapping(value = "/read/detail")
	public Object detail(ModelMap modelMap, @RequestParam(value = "id", required = false) Integer id) {
		SysRole record = sysRoleService.queryById(id);
		return setSuccessModelMap(modelMap, record);
	}

	// 新增
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Object add(HttpServletRequest request, ModelMap modelMap) {
		SysRole record = Request2ModelUtil.covert(SysRole.class, request);
		sysRoleService.add(record);
		return setSuccessModelMap(modelMap);
	}

	// 修改
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Object update(HttpServletRequest request, ModelMap modelMap) {
		SysRole record = Request2ModelUtil.covert(SysRole.class, request);
		sysRoleService.update(record);
		return setSuccessModelMap(modelMap);
	}

	// 删除
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public Object delete(HttpServletRequest request, ModelMap modelMap,
			@RequestParam(value = "id", required = false) Integer id) {
		sysRoleService.delete(id);
		return setSuccessModelMap(modelMap);
	}
}
