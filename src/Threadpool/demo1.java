package Threadpool;

import java.util.concurrent.*;

public class demo1 {
    public static void main(String[] args) {
        //1,创建线程池对象
        /**
         * int corePoolSize,
         *  int maximumPoolSize,
         *  long keepAliveTime,
         *  TimeUnit unit,
         *BlockingQueue<Runnable> workQueue,
         * ThreadFactory threadFactory,
         *   RejectedExecutionHandler handler
         */
        ExecutorService pool=new ThreadPoolExecutor(3,5,6,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory()
       ,new ThreadPoolExecutor.AbortPolicy() );

        //2,给任务线程池处理
        Runnable target=new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
    }
}
