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
        int[] isbn13OnlyNumberArray = null;
        int[] isbn10OnlyNumberArray = null;
        String isbnOnlyNumbers = isbn.replaceAll("-", "");
        int controlSum10 = 0;
        int controlSum13 = 0;
        int controlNumberISBN10 = -1;
        int controlNumberISBN13 = -1;
        try {
            if (isbnOnlyNumbers.length() == 13) {
                isbn13OnlyNumberArray = Stream.of(isbnOnlyNumbers.split(""))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                for (int i = 0; i < isbn13OnlyNumberArray.length - 1; i++) {
                    if (i % 2 == 0) {
                        controlSum13 += isbn13OnlyNumberArray[i] * 1;
                    } else {
                        controlSum13 += isbn13OnlyNumberArray[i] * 3;
                    }
                }
                System.out.println(controlSum13);
                controlSum13 = controlSum13 % 10;
                if (controlSum13 > 0) {
                    controlSum13 = 10 - controlSum13;
                }
                controlNumberISBN13 = isbn13OnlyNumberArray[12];
                controlNumberISBN10 = 0;
            }
            else if (isbnOnlyNumbers.length() == 10){
                isbn10OnlyNumberArray = Stream.of(isbnOnlyNumbers.split(""))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                for (int i = 0; i < isbn10OnlyNumberArray.length - 1; i++) {
                    controlSum10 += isbn10OnlyNumberArray[i]*(i+1);
                }
                System.out.println(controlSum10);
                controlSum10 = controlSum10 % 11;
                controlNumberISBN10 = isbn10OnlyNumberArray[9];
                controlNumberISBN13 = 0;
            }
            else{
                controlNumberISBN10=-1;
                controlNumberISBN13=-1;
            }
        }
            catch (NumberFormatException e){
            }
        Logger.getAnonymousLogger().info("checking isbn validation");
        return isbnOnlyNumbers.matches("[0-9]+") && isbn.length() > 9 && controlNumberISBN10 == controlSum10 && controlNumberISBN13 == controlSum13;

    }
}
