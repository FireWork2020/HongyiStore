package per.gyx.hongyistore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.gyx.hongyistore.dao.ImageDao;
import per.gyx.hongyistore.entity.Image;
import per.gyx.hongyistore.service.ImageService;

import java.util.List;

@Service("imageService")
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageDao imageDao;

    public ImageServiceImpl() {
        super();
    }

    @Override
    public List<Image> getSpecialImageListByKind(String kind) {
        return null;
    }

    @Override
    public List<Image> getImageListBykind(String kind) {
        return null;
    }
}
