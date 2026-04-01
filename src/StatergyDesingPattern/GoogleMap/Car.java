package StatergyDesingPattern.GoogleMap;

public class Car implements PathFinder{
    @Override
    public void pathFind(String sorce, String dest) {
        System.out.println("From "+sorce+" to "+dest+" it will take around 20 min via Car");
    }
}
