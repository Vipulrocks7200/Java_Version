/**
 * Proxy can call default methods with Java 16.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static java.lang.ClassLoader.getSystemClassLoader;

public class DefaultMethodsFromProxy {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Object proxy = Proxy.newProxyInstance(getSystemClassLoader(), new Class<?>[]{HelloWorld.class},
                (prox, method, args1) -> {
                    if (method.isDefault()) {
                        return InvocationHandler.invokeDefault(prox, method, args1);
                    }
                    return "";
                }
        );
        Method method = proxy.getClass().getMethod("hello");
        System.out.println(method.invoke(proxy));

    }
}

interface HelloWorld {
    default String hello() {
        return "world";
    }
}