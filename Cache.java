package ResourceManager;

public interface Cache<T> {

    T removeFromCache();

    void addToCache(T element);
}
