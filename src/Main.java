import Factories.Abstractions.IRecommFactory;
import Factories.ConcreteImpl.BodyActivityRecommFactory;
import Factories.ConcreteImpl.WatchRecommFactory;

import java.util.Scanner;

public class Main {

    public enum RecommOptions {
        Shorter,
        Multitask,
        Longer
        //all options here
    }

    public enum TypeOfActivity{
        Body,
        Watch
    }



    public static void main(String[] args) {

        System.out.println(String.format("Creating a ",recommend().getClass()));
    }

    private static IRecommFactory recommend() {
        Scanner scanner = new Scanner("Choose a duration:\n");
        TypeOfActivity op = TypeOfActivity.valueOf(scanner.toString());
        IRecommFactory irf = null;
        switch(op) {
            case Body:
                irf = new BodyActivityRecommFactory();
                break;
            case Watch:
                irf = new WatchRecommFactory();
                break;
            default:
                System.out.println("Select an option for duration");
                break;
        }
        return irf;
    }
}
