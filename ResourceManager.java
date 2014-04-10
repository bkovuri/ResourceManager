package ResourceManager;

/**
 * Created by Bhanu on 4/9/14.
 */
public interface ResourceManager {
    Cache getCache();

    void consumeItem() throws InterruptedException;

    void produceItem();
}
