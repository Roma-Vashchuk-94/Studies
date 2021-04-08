package JavaCore.Lesson_21_Annotation_Date.task1;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String name();
}
