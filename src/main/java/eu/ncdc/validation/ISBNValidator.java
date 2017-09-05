package eu.ncdc.validation;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class ISBNValidator implements ConstraintValidator<CorrectISBN, String> {

    @Override
    public void initialize(CorrectISBN correctISBN) {}

    @Override
    public boolean isValid(String isbn, ConstraintValidatorContext context){
        int[] isbnOnlyNumberArray = null;
        String isbnOnlyNumbers = isbn.replaceAll("-", "");
        int controlSum = 0;
        try {
            isbnOnlyNumberArray = Stream.of(isbnOnlyNumbers.split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int i = 0; i < isbnOnlyNumberArray.length - 1; i++) {
                if (i % 2 == 0) {
                    controlSum += isbnOnlyNumberArray[i] * 1;
                } else {
                    controlSum += isbnOnlyNumberArray[i] * 3;
                }
            }
            System.out.println(controlSum);
            controlSum = controlSum % 10;
            if (controlSum > 0) {
                controlSum = 10 - controlSum;
            }}
            catch (NumberFormatException e){
            }
        Logger.getAnonymousLogger().info(" ISBN input");
        return isbnOnlyNumbers.matches("[0-9]+") && isbn.length() > 12 && isbnOnlyNumberArray[12] == controlSum;
    }
}
