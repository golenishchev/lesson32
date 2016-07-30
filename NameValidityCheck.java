package com.example.lesson32;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidityCheck {
    private String userName = "null";
    // (^[\\w] To forbid whitespaces before user name
    // $ To forbid whitespaces after or inside user name
    final String regularExpression = "(^[\\w]{4,16}$)";

    public void validateUserNameByUsingRegExp() {
        Pattern myPattern = Pattern.compile(regularExpression);
        Matcher myMatcher = myPattern.matcher(userName);
        if (myMatcher.find()) {
            System.out.println("\tUser name is: " + userName);
        } else {
            System.out.println("\tOnly letters, digits and underscores allowed." +
                    "\n\tAnd length should be within 4-16 characters");
        }
    }

    public void validateUserNameWithoutUsingRegExp() {
        final String validCharacters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz";
        final int userNameLength = userName.length();
        if (userNameLength >= 4 && userNameLength <= 16) {
            System.out.println("\tUser name is: " + userName);
        } else {
            System.out.println("\tUser name's length should be within 4-16 characters");
        }
        for (int i = 0; i < userNameLength; i++) {
            if (validCharacters.indexOf(userName.charAt(i)) == -1) {
                System.out.println("\tOnly letters, digits and underscores allowed." +
                        "\n\tAnd length should be within 4-16 characters");
            }
        }
    }
}
