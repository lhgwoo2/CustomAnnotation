package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @detail ���ڿ��� �����ϱ� ���� ������̼�
 * @author lhgwoo
 *
 */

/*
        ����
    http://jdm.kr/blog/216
    
        ��Ÿ ������̼�
    
    @Inherited  // ���� Ŭ������ �θ� ������̼��� ��ӹ޵��� �մϴ�.
    @Documented // ������̼� ������ Javadoc���� ����˴ϴ�.
    @Retention(RetentionPolicy.RUNTIME) // ������ ���Ŀ��� JVM�� ���ؼ� ������ �����ϴ�.(��Ÿ�ӿ� ���� ����, ���÷����� �̿��Ͽ� �˻� ����)
    @Retention(RetentionPolicy.CLASS)   // �����Ϸ��� Ŭ������ ������ ������ ��ȿ�մϴ�.(Ŭ���� �ε��� ���� ����, VM������ ������ ����)
    @Retention(RetentionPolicy.SOURCE)  // ������̼� ������ ������ ���Ŀ� �������ϴ�.
    
    @Target({
      ElementType.PACKAGE,      // ��Ű�� �����
      ElementType.TYPE,         // Ÿ�� �����
      ElementType.CONSTRUCTOR,  // ������ �����
      ElementType.FIELD,        // ��� ���� �����
      ElementType.METHOD,       // �޼ҵ� �����
      ElementType.ANNOTATION_TYPE,  // ������̼� Ÿ�� �����
      ElementType.LOCAL_VARIABLE,   // ���� ���� �����
      ElementType.PARAMETER,        // �Ű� ���� �����
      ElementType.TYPE_PARAMETER,   // �Ű� ���� Ÿ�� �����
      ElementType.TYPE_USE          // Ÿ�� ����
    })
*/


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StringInjector {
  String value() default "This is StringInjector";
}
