package per.gyx.hongyistore.service;

import per.gyx.hongyistore.entity.Clothe;

import java.util.List;

public interface ClotheService {

    List<Clothe> getRecommendOrLikeClothe(int isRecommendOrLike);
    List<Clothe> getAllClothes();
    Clothe getClotheByID(int goodID);
}
