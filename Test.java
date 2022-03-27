package annotation;

import org.apache.commons.lang3.reflect.MethodUtils;

import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("annotation.UserController");

        boolean result = clazz.isAnnotationPresent(Controller.class);//是否被Controller注解修饰？

        System.out.println(result);//true还是false？

        /*
        找出类中哪些方法使用了RequestMapping注解
         */
        Method methods[] = MethodUtils.getMethodsWithAnnotation(clazz, RequestMapping.class);//找出clazz这个类中，哪些方法使用了RequestMapping注解

        System.out.println(methods.length);//1还是2？

        /*for (Method method : methods) {
            RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
            System.out.println("注解的属性值：" + requestMapping.value());
        }*/
        /*
        lambda实现
         */
        Arrays.stream(methods).forEach((method)->{
            System.out.println(method.getAnnotation(RequestMapping.class).value());
        });
    }
}
