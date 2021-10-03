package Factories.ConcreteImpl.BodyActivity;

import Factories.Abstractions.IRecommFactory;

public class Hiking implements IRecommFactory {
    String name;
    String duration;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String genres) {
        this.duration = genres;
    }

    @Override
    public String returnRecommendation(){
        //some function to return data from dataset
        return "Name: ...\nLevel of difficulty: ...";
    }
}
