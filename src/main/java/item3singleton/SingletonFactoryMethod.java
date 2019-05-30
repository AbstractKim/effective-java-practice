package item3singleton;

public class SingletonFactoryMethod {
    private volatile static SingletonFactoryMethod singletonFactoryMethod;

    static public SingletonFactoryMethod getInstance() {
        if (singletonFactoryMethod != null)
            return singletonFactoryMethod;
        createSingletonFactoryMethodBlocking();
        return singletonFactoryMethod;
    }
    synchronized static private void createSingletonFactoryMethodBlocking(){
        if(singletonFactoryMethod == null)
            singletonFactoryMethod = new SingletonFactoryMethod();
    }
}
