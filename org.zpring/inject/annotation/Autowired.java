package inject.annotation;

/**
 * @author 3zZ.
 * @date 2020/9/25.
 * Autowired目前仅支持成员变量注入
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Autowired {
    String value() default "";
}
