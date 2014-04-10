package ResourceManager;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Bhanu on 4/9/14.
 */
public class BlockingQueueCacheC implements Cache<Integer> {

    BlockingQueue<Integer> blockingQueue;

    public BlockingQueueCacheC()
    {
      blockingQueue = new ArrayBlockingQueue<Integer>(100);
    }


    public Integer removeFromCache()
    {
        try
        {
            return blockingQueue.take();
        }
        catch(InterruptedException ie)
        {
          //Will use logging to report it as error
          System.out.println(new StringBuilder("ResourceManager.BlockingQueueCacheC::Exception occurred while removing element from cache")
                            .append(ie.getCause()));
        }
        return null;
    }

    public void addToCache(Integer element)
    {
        try
        {
           blockingQueue.put(element);
        }
        catch(InterruptedException ie)
        {
            //Will use logging to report it as error
            System.out.println(new StringBuilder("ResourceManager.BlockingQueueCacheC::Exception occurred while removing element from cache")
                    .append(ie.getCause()));
        }
    }

}
