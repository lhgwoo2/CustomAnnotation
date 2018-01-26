package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @detail 문자열을 주입하기 위한 어노테이션
 * @author lhgwoo
 *
 */

/*
        참조
    http://jdm.kr/blog/216
    
        메타 어노테이션
    
    @Inherited  // 서브 클래스가 부모 어노테이션을 상속받도록 합니다.
    @Documented // 어노테이션 정보는 Javadoc으로 저장됩니다.
    @Retention(RetentionPolicy.RUNTIME) // 컴파일 이후에도 JVM에 의해서 참조가 가능하다.(런타임에 참조 가능, 리플렉션을 이용하여 검색 가능)
    @Retention(RetentionPolicy.CLASS)   // 컴파일러가 클래스를 참조할 때까지 유효합니다.(클래스 로딩시 참조 가능, VM에서는 사용되지 않음)
    @Retention(RetentionPolicy.SOURCE)  // 어노테이션 정보는 컴파일 이후에 없어집니다.
    
    @Target({
      ElementType.PACKAGE,      // 패키지 선언시
      ElementType.TYPE,         // 타입 선언시
      ElementType.CONSTRUCTOR,  // 생성자 선언시
      ElementType.FIELD,        // 멤버 변수 선언시
      ElementType.METHOD,       // 메소드 선언시
      ElementType.ANNOTATION_TYPE,  // 어노테이션 타입 선언시
      ElementType.LOCAL_VARIABLE,   // 지역 변수 선언시
      ElementType.PARAMETER,        // 매개 변수 선언시
      ElementType.TYPE_PARAMETER,   // 매개 변수 타입 선언시
      ElementType.TYPE_USE          // 타입 사용시
    })
*/


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StringInjector {
  String value() default "This is StringInjector";
}
