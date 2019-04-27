package com.tjeit.threeweeksatherday_androidpractics.datas;

public class PizzaStore {
//    가게이름, 어느동네(구) , 영업시간("09:00 ~ 21:00"), 로고파일
    public String storeName;
    public String location;
    public String openTime;
    public String imageURL;//웹상 이미지 주소

    public PizzaStore(String storeName, String location, String openTime, String imageURL) {
        this.storeName = storeName;
        this.location = location;
        this.openTime = openTime;
        this.imageURL = imageURL;
    }
}
