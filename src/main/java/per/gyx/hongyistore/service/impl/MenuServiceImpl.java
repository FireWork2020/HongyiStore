package per.gyx.hongyistore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.gyx.hongyistore.dao.MenuDao;
import per.gyx.hongyistore.entity.Menu;
import per.gyx.hongyistore.service.MenuService;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> getMenus() {
        List<Menu> parentMenus = menuDao.getParentMenus();
        List<Menu> childMenus = menuDao.getChildMenus();
        for(Menu item:parentMenus){
            int id = item.getId();
            for(Menu child:childMenus){
                if(child.getParentId() == id){
                    item.getChildren().add(child);
                }
            }
        }
        return parentMenus;
    }
}
