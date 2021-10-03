package Factories.ConcreteImpl.Watch;

import Factories.Abstractions.IRecommFactory;

public class WatchRecommFactory implements IRecommFactory {
    public static IRecommFactory findRecommendation(Main.RecommOptions option) {
        IRecommFactory watchRecommendation = null;
        switch (option) {
            case Multitask:
                watchRecommendation = new Talk_Show();
                break;

            case Shorter:
                watchRecommendation = new Anime();
                break;

            case Longer:
                watchRecommendation = new TV_Series();
                break;

            default:
                System.out.println("Select an option for duration first.");
                break;
        }
        return watchRecommendation;
    }

    @Override
    public String returnRecommendation() {
        return null;
    }
}
