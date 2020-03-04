package per.gyx.hongyistore.dao;


import per.gyx.hongyistore.entity.Image;

import java.util.List;

public interface ImageDao {

    //根据图片种类获取图片
    List<Image> getImageListByKind(String kind);

    //
    List<Image> getSpecialImageListByKind(String kind);

    //根据图片id获取图片
    List<String> getImageUrlByGoodID(int goodID);

}
