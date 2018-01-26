package Annotation;

import java.lang.reflect.Field;

/**
 * 객체 주입을 위한 서비스 클래스
 * 해당 어노테이션 필드에 값을 주입함으로써 추상화되어있는 인터페이스를 실체화 한다. -> 자바 리플렉션을 이용하여 실체화함.
 * @author lhgwoo
 *
 */
public class MyContextContainer {

  public MyContextContainer() {}

  /**
   * 객체를 반환하기 전 어노테이션을 적용합니다.
   * @param instance
   * @param <T>
   * @return
   * @throws IllegalAccessException
   */
  private <T> T invokeAnnotations(T instance) throws IllegalAccessException {
    Field[] fields = instance.getClass().getDeclaredFields();
    for (Field field : fields) {
      StringInjector annotation = field.getAnnotation(StringInjector.class);
      if (annotation != null && field.getType() == String.class) {
        field.setAccessible(true);
        field.set(instance, annotation.value());
      }
    }
    return instance;
  }
  
  /**
   * 매개변수로 받은 클래스의 객체를 반환합니다.
   * @param clazz
   * @param <T>
   * @return
   * @throws IllegalAccessException
   * @throws InstantiationException
   */
  @SuppressWarnings("unchecked")
  public <T> T get(Class clazz) throws IllegalAccessException, InstantiationException{
    T instance = (T) clazz.newInstance();
    instance = invokeAnnotations(instance);
    return instance;
  }
}
