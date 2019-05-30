package item3singleton;

import org.junit.Test;

import java.security.PublicKey;

import static org.assertj.core.api.Assertions.assertThat;


public class SingletonDefaultTest {

    @Test
    public void singletonDefaultTest(){
        SingletonDefault singletonDefault1 = SingletonDefault.INSTANCE;
        SingletonDefault singletonDefault2 = SingletonDefault.INSTANCE;
        assertThat(singletonDefault1).isEqualTo(singletonDefault2);
    }

    @Test
    public void singletonFactoryMeothodTest(){
        assertThat(SingletonFactoryMethod.getInstance()).isEqualTo(SingletonFactoryMethod.getInstance());
    }


    @Test
    public void singletonEnumTest(){
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        assertThat(singletonEnum1).isEqualTo(singletonEnum2);
    }
}