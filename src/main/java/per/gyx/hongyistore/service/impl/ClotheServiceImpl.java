package per.gyx.hongyistore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.gyx.hongyistore.dao.GoodDao;
import per.gyx.hongyistore.dao.ImageDao;
import per.gyx.hongyistore.entity.Clothe;
import per.gyx.hongyistore.entity.Image;
import per.gyx.hongyistore.service.ClotheService;
import per.gyx.hongyistore.service.ImageService;

import java.util.ArrayList;
import java.util.List;

@Service("clotheService")
public class ClotheServiceImpl implements ClotheService {

    @Autowired
    private GoodDao goodDao;

    @Autowired
    private ImageService imageService;
    public ClotheServiceImpl() {
        super();
    }

    @Override
    public List<Clothe> getAllClothes() {
        return null;
    }


    @Override
    public List<Clothe> getRecommendOrLikeClothe(int isRecommendOrLike) { //recommend is 1; like is 2
        List<Clothe> clotheList;
        List<Image> imageList = imageService.getSpecialImageListByKind("clothe"); //将衣服图片读取
        if(isRecommendOrLike == 1){
            clotheList = goodDao.getRecommendClotheList();
        }else if( isRecommendOrLike == 2){
            clotheList = goodDao.getLikeClotheList();
        }else{
            return new ArrayList<>();
        }
        for(Clothe clothe:clotheList){
            System.out.println(clothe.getGoodName());
            int id = clothe.getGoodID();
            List<Image> tempImageList = new ArrayList<>();
            for(Image image:imageList){
                if(image.getClotheID() == id){
                    tempImageList.add(image);
                    System.out.println(clothe.getGoodName() + "   " + image.getRemoteUrl());
                }
            }
            clothe.setImageList(tempImageList);
        }
        return clotheList;
    }

    @Override
    public Clothe getClotheByID(int goodID) {
        return null;
    }
}
