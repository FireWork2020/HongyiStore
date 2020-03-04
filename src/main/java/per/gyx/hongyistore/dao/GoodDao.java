package per.gyx.hongyistore.dao;

import per.gyx.hongyistore.entity.Clothe;

import java.util.List;

public interface GoodDao {

    //根据商品种类获取商品列表 每个分类写一个get函数
    List<Clothe> getRecommendClotheList();
    List<Clothe> getLikeClotheList();





}
