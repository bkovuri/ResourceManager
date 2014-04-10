package ResourceManager;

class ConsumeItemsC implements Runnable, ConsumeItems {

    ConsumeItemsC()
    {
        this.run();
    }

    public void run()
    {
        consumeTask();
    }

    @Override
    public void consumeTask() {

      ResourceManagerC.getInstance().getCache().removeFromCache();
    }
}