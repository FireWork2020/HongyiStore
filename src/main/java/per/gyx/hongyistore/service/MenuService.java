package per.gyx.hongyistore.service;

import org.springframework.stereotype.Service;
import per.gyx.hongyistore.entity.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenus();
}
