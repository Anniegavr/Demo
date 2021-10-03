package Factories.ConcreteImpl.BodyActivity;

import Factories.Abstractions.IRecommFactory;

public class BodyActivityRecommFactory implements IRecommFactory{
    private static Main.RecommOptions option;

    public static IRecommFactory findRecommendation(Main.RecommOptions option) {
        BodyActivityRecommFactory.option = option;
        IRecommFactory bodyRecommendation = null;
        switch (option) {
            case Multitask:
                bodyRecommendation = new WalkWithFriends();
                break;

            case Shorter:
                bodyRecommendation = new Running();
                break;

            case Longer:
                bodyRecommendation = new Hiking();
                break;

            default:
                System.out.println("Select an option for duration");
                break;
        }
        return bodyRecommendation;
    }

    @Override
    public String returnRecommendation() {
        return null;
    }
}
