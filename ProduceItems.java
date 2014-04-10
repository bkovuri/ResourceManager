package ResourceManager;

import ResourceManager.ResourceManagerC;

class ProduceItems implements Runnable
{

    public void run()
    {
      produceItem();
    }

    public void produceItem()
    {
       Integer number = 10;
       ResourceManagerC.getInstance().getCache().addToCache(number);
    }
}