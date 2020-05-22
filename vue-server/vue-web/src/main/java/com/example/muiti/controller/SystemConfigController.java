package com.example.muiti.controller;

import com.example.muiti.model.Menu;
import com.example.muiti.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/config")
@Api(value = "SystemConfigController", tags = {"系统菜单管理"})
public class SystemConfigController {
    @Autowired
    MenuService menuService;

    @GetMapping("/menu")
    @ApiOperation(value = "获取菜单", notes = "根据登录用户id获取菜单")
    public List<Menu> getMenusByHrId() {
        return menuService.getMenusByHrId();
    }
}
