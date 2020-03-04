package per.gyx.hongyistore.dao;

import per.gyx.hongyistore.entity.Menu;

import java.util.List;

public interface MenuDao {
    List<Menu> getParentMenus();
    List<Menu> getChildMenus();

}
