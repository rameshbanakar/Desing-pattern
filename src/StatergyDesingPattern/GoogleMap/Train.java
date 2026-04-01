package StatergyDesingPattern.GoogleMap;

public class Train implements PathFinder{
    @Override
    public void pathFind(String sorce, String dest) {
        System.out.println("From "+sorce+" to "+dest+" it will take around 30 min via Train");
    }
}
