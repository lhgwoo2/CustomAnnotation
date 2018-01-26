package Annotation;

import java.lang.reflect.Field;

/**
 * ��ü ������ ���� ���� Ŭ����
 * �ش� ������̼� �ʵ忡 ���� ���������ν� �߻�ȭ�Ǿ��ִ� �������̽��� ��üȭ �Ѵ�. -> �ڹ� ���÷����� �̿��Ͽ� ��üȭ��.
 * @author lhgwoo
 *
 */
public class MyContextContainer {

  public MyContextContainer() {}

  /**
   * ��ü�� ��ȯ�ϱ� �� ������̼��� �����մϴ�.
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
   * �Ű������� ���� Ŭ������ ��ü�� ��ȯ�մϴ�.
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
