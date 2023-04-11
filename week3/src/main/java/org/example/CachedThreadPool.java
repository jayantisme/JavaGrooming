package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CachedThreadPool implements Callable {
    @Override
    public Object call() throws Exception {
        return 100;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<Integer>> list = new ArrayList<>();
        for (int i=1; i<=10; i++) {
            Future<Integer> f = executorService.submit(new ThreadPool());
            list.add(f);
        }
        executorService.shutdown();
        int i = 1;
        for (Future<Integer> f : list) {
            try {
                System.out.println(f.get()+i);
                i++;
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
