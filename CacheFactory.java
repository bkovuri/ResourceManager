package ResourceManager;

public class CacheFactory {


   Cache<Integer> buildCache(CacheType cacheType)
   {

       if(cacheType.equals(CacheType.BlockingQueueCache))
       {
           return new BlockingQueueCacheC();
       }
       else if(cacheType.equals(CacheType.LRUCache))
       {
         //  return new LRUCache();
       }
       return null;
   }
}
