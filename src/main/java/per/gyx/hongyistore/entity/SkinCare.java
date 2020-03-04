package per.gyx.hongyistore.entity;

import java.util.ArrayList;
import java.util.List;


public class SkinCare implements Good{
    private static List<String> categories = new ArrayList<>();
    static {
        List<String> categories = new ArrayList<>();
        categories.add("hairmask");
        categories.add("washwater");
    }

    private int goodID;
    private String goodName;
    private String kind;
    private int soldNum;
    private String description;
    private float price;
    private int isRecommend;
    private List<Image> imageList;
    private Evaluation evaluation;

    public static List<String> getCategories() {
        return categories;
    }

    public static void setCategories(List<String> categories) {
        SkinCare.categories = categories;
    }

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(int soldNum) {
        this.soldNum = soldNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(int isRecommend) {
        this.isRecommend = isRecommend;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }
}
