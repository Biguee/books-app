package eu.ncdc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AuthorValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthorStartsFromA {


    String message() default "Invalid author - the should starts from A";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
