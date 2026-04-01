package StatergyDesingPattern;

import StatergyDesingPattern.GoogleMap.Car;
import StatergyDesingPattern.GoogleMap.PathFinder;
import StatergyDesingPattern.GoogleMap.Train;
import StatergyDesingPattern.GoogleMap.Walk;

public class PathFactory {
    public static PathFinder pathFinderFactory(String path){
        if(path.equalsIgnoreCase("car")){
            return new Car();
        } else if (path.equalsIgnoreCase("walk")) {
            return new Walk();
        } else if (path.equalsIgnoreCase("train")) {
            return new Train();
        }
        return null;

    }
}
