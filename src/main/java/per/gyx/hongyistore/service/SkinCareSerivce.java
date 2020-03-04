package per.gyx.hongyistore.service;


import per.gyx.hongyistore.entity.Good;
import per.gyx.hongyistore.entity.SkinCare;

import java.util.List;

public interface SkinCareSerivce {
    List<Good> getSkinCare();
    List<SkinCare> getRecommendSkinCare();
    List<SkinCare> getLikeSkinCare();
}

