package StatergyDesingPattern.GoogleMap;

public class Walk implements PathFinder{
    @Override
    public void pathFind(String sorce, String dest) {
        System.out.println("From "+sorce+" to "+dest+" it will take around 50 min via Walk");
    }
}
