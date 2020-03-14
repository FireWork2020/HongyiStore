package per.gyx.hongyistore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import per.gyx.hongyistore.entity.Menu;
import per.gyx.hongyistore.service.MenuService;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    private static String imgDirectory = "/Users/gwag-wi/Image/menuimg/";
    @Autowired
    private MenuService menuService;

    @GetMapping("/allmenus")
    public List<Menu> getMenus(){
        return menuService.getMenus();
    }

    @GetMapping("/menuImg")
    public byte[] getChildImgByName(@RequestParam("imgName") String imgName){
        File file = new File(MenuController.imgDirectory+imgName);
        try{
            FileInputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes,0,inputStream.available());
            return bytes;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
