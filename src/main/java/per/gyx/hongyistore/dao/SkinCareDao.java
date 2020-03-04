package per.gyx.hongyistore.dao;

import per.gyx.hongyistore.entity.SkinCare;

import java.util.List;

public interface SkinCareDao {


    List<SkinCare> getSkinCare();
    List<SkinCare> getRecommendSkinCare();
    List<SkinCare> getLikeSkinCare();

}
