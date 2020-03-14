package per.gyx.hongyistore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.gyx.hongyistore.dao.MenuDao;
import per.gyx.hongyistore.dao.MenuImgDao;
import per.gyx.hongyistore.entity.Menu;
import per.gyx.hongyistore.service.MenuService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Autowired
    private MenuImgDao menuImgDao;


    @Override
    public List<Menu> getMenus() {
        List<Menu> parentMenus = menuDao.getParentMenus();
        List<Menu> childMenus = menuDao.getChildMenus();
        List<Map> imgList = menuImgDao.getMenuImg();
        HashMap<Object, Object> imgs = new HashMap<>();
        for(Map map:imgList){
            imgs.put(map.get("menuId"),map.get("imgName"));
            System.out.println(map.get("menuId")+""+map.get("imgName"));
        }
        for(Menu child:childMenus){
            String imgName = (String)imgs.get(child.getId());
            if(imgName != null){
                child.setImgName(imgName);
            }
        }
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
