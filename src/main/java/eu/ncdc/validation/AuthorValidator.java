package eu.ncdc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthorValidator implements ConstraintValidator<AuthorStartsFromA, String>{

    @Override
    public void initialize(AuthorStartsFromA authorStartsFromA) {

    }

    @Override
    public boolean isValid(String author, ConstraintValidatorContext context) {
        List<String> nameList = new ArrayList<String>(Arrays.asList(author.split(" ")));
        String authorName = nameList.get(0);
        String authorSurname = nameList.get(1);
        return authorName.startsWith("A") || authorSurname.startsWith("A") || authorName.startsWith("a") || authorSurname.startsWith("a");
        //if nameList <2 todo
    }
}
