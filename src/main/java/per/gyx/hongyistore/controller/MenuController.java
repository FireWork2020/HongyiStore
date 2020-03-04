package per.gyx.hongyistore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.gyx.hongyistore.entity.Menu;
import per.gyx.hongyistore.service.MenuService;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/allmenus")
    public List<Menu> getMenus(){
        return menuService.getMenus();
    }

}
