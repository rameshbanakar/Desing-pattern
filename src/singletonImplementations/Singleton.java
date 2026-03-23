package singletonImplementations;//package singletonImplementations;

public class Singleton{
    private static Singleton instance=null;
     private Singleton() {
    }
////   this is usnig the synchronization
    public static  Singleton getInstance(){
        if(instance==null)
        {
            instance= new Singleton();
        }
        return instance;
    }

//    public static Singleton getInstance(){
//        if(instance==null){
//            synchronized (Singleton.class){
//                if(instance==null){
//                    instance=new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

}

