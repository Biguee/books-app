package eu.ncdc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthorValidator implements ConstraintValidator<AuthorStartsFromA, String>{

    @Override
    public void initialize(AuthorStartsFromA authorStartsFromA) {}

    @Override
    public boolean isValid(String author, ConstraintValidatorContext context) {
        List<String> nameList = new ArrayList<String>(Arrays.asList(author.split(" ")));
        String wordStartsFromA = "";
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).startsWith("A") || nameList.get(i).startsWith("a")){
                wordStartsFromA = nameList.get(i);
                break;
            }
        }
        return wordStartsFromA.startsWith("A") || wordStartsFromA.startsWith("a");
    }
}
