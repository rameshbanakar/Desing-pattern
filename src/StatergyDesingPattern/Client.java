package StatergyDesingPattern;

import StatergyDesingPattern.GoogleMap.PathFinder;

import java.util.Scanner;

public class Client {
    public static  void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String path= scan.next();

        PathFinder pathFinder=PathFactory.pathFinderFactory(path);
        Google g=new Google(pathFinder);
        g.findMyPath("Bangalore","Haveri");
    }
}
