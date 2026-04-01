package StatergyDesingPattern;

import StatergyDesingPattern.GoogleMap.PathFinder;

public class Google {
    private PathFinder pathfinder;
    public Google(PathFinder pathfinder) {
        this.pathfinder=pathfinder;
    }
    public void findMyPath(String source,String dest){
        pathfinder.pathFind(source,dest);
    }
}
