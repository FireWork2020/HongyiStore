package per.gyx.hongyistore.service;

import per.gyx.hongyistore.entity.Image;

import java.util.List;

public interface ImageService {
    List<Image> getSpecialImageListByKind(String kind);
    List<Image> getImageListBykind(String kind);
}
