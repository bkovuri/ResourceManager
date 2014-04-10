package ResourceManager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ResourceManagerC implements ResourceManager {

    ExecutorService consumeService;
    ExecutorService produceService;
    private static ResourceManagerC resourceManager = new ResourceManagerC();
    Cache<Integer> cache;

    //Its Singleton Class
    private ResourceManagerC() {
        init();
    }

    private void init() {
        consumeService = Executors.newCachedThreadPool();
        produceService = Executors.newCachedThreadPool();

        CacheFactory cacheFactory = new CacheFactory();
        cache = cacheFactory.buildCache(CacheType.BlockingQueueCache);

    }

    public static ResourceManagerC getInstance() {
        return resourceManager;
    }

    @Override
    public Cache<Integer> getCache()
    {
       return cache;
    }

    @Override
    public void consumeItem()  {

        consumeService.execute(new ConsumeItemsC());
    }

    @Override
    public void produceItem() {
        produceService.execute(new ProduceItems());
    }
}