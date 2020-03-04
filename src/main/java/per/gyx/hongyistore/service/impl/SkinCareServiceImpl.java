package per.gyx.hongyistore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.gyx.hongyistore.dao.SkinCareDao;
import per.gyx.hongyistore.entity.Good;
import per.gyx.hongyistore.entity.Image;
import per.gyx.hongyistore.entity.SkinCare;
import per.gyx.hongyistore.service.ImageService;
import per.gyx.hongyistore.service.SkinCareSerivce;

import java.util.List;

@Service("skinCareService")
public class SkinCareServiceImpl implements SkinCareSerivce {

    @Autowired
    private SkinCareDao skinCareDao;

    @Autowired
    private ImageService imageService;


    @Override
    public List<Good> getSkinCare() {
        List<SkinCare> skinCares = skinCareDao.getSkinCare();
        List<Image> images = imageService.getImageListBykind("skincare");
        return CombinationServiceImpl.combinate(skinCares,images);
    }

    @Override
    public List<SkinCare> getRecommendSkinCare() {
        return skinCareDao.getRecommendSkinCare();
    }

    @Override
    public List<SkinCare> getLikeSkinCare() {
        return skinCareDao.getLikeSkinCare();
    }
}
