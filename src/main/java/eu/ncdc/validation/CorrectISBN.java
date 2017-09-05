package eu.ncdc.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ISBNValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CorrectISBN {
    String message() default "Invalid ISBN number - can contains only numbers and \"-\" (min. length is 13 digits)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
