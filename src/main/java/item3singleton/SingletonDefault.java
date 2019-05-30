package item3singleton;

/**
 * 1. make constructor as private
 * 2. create new instance on property
 */
public class SingletonDefault {
    public static final SingletonDefault INSTANCE = new SingletonDefault();

    private SingletonDefault(){
    }
}

