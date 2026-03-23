package singletonImplementations;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            synchronized (Singleton.class){
                new Thread(()->{
                        System.out.println(Singleton.getInstance());
                }).start();
            }
        }

//        ExecutorService executorService=Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 100; i++) {
//           executorService.submit(()->{
//               System.out.println(Singleton.getInstance());
//           });
//        }
    }
}

