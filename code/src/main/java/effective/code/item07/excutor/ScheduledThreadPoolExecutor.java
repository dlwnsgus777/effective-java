package effective.code.item07.excutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ScheduledThreadPoolExecutor {
   public static void main(String[] args) throws ExecutionException, InterruptedException {
      ExecutorService service = Executors.newScheduledThreadPool(10);

      Future<String> submit = service.submit(new Task());

      System.out.println(Thread.currentThread() + " hello");

      Thread.sleep(2000L);

      System.out.println(Thread.currentThread() + " hello");

      System.out.println(submit.get());

      service.shutdown();
   }


   static class Task implements Callable<String> {

      @Override
      public String call() throws Exception {
         Thread.sleep(2000L);
         return Thread.currentThread() + " world";
      }
   }
}
