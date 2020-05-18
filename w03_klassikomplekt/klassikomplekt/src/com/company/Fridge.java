package com.company;

public class Fridge {
    private String model;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if((validModel.equals("havana")) || (validModel.equals("ford"))){
            this.model = model;
        } else {
            this.model = "unkown";
        }
    }

    public String getModel() {
        return this.model;
    }


}
