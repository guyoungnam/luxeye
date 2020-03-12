package com.example.luxeye;

import android.widget.EditText;

public class UserInfo {

        private String name;
        private String height;
        private String weight;
        private String brand;
        private String photoUrl;
        private String id;

        public UserInfo(String name, String height, String birthDay, String brand, String photoUrl){
            this.name = name;
            this.height = height;
            this.weight = birthDay;
            this.brand = brand;
            this.photoUrl = photoUrl;
        }

        public UserInfo(String name, String height, String birthDay, String brand){
            this.name = name;
            this.height = height;
            this.weight = birthDay;
            this.brand = brand;
        }

    public UserInfo(String name, String height, String birthDay, String brand, String photoUrl,String id){
        this.name = name;
        this.height = height;
        this.weight = birthDay;
        this.brand = brand;
        this.photoUrl = photoUrl;
        this.id = id;
    }

        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getHeight(){
            return this.height;
        }
        public void setHeight(String height){
            this.height = height;
        }
        public String getWeight(){
            return this.weight;
        }
        public void setWeight(String birthDay){
            this.weight = birthDay;
        }
        public String getBrand(){
            return this.brand;
        }
        public void setBrand(String brand){
            this.brand = brand;
        }
        public String getPhotoUrl(){
            return this.photoUrl;
        }
        public void setPhotoUrl(String photoUrl){
            this.photoUrl = photoUrl;
        }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    }