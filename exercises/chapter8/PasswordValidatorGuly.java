package exercises.chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordValidatorGuly {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserCredential userCredential = readUserCredential();
        //printPasswordCriteria();

        while (!isNewPasswordValid(userCredential).isEmpty()) {
            for (String errorMessage : isNewPasswordValid(userCredential)) {
                System.out.println(errorMessage);
            }
            userCredential.newPassword = readNewPassword();
        }

        System.out.println("Password accepted!");
        scanner.close();
    }


//    private static void printPasswordCriteria() {
//        System.out.println("Your new password must meet the following requirements:");
//        System.out.println("* at least 8 characters long");
//        System.out.println("* contain an uppercase letter");
//        System.out.println("* contain a special character");
//        System.out.println("* not contain the username");
//        System.out.println("* not the same as the old password");
//        System.out.println();
//    }

    private static UserCredential readUserCredential() {
        String username = readValue("Enter your Username:");
        String oldPassword = readValue("Enter your Old Password:");
        String newPassword = readNewPassword();
        return new UserCredential(username, oldPassword, newPassword);
    }

    private static String readNewPassword() {
        return readValue("Enter your new Password:");
    }

    private static String readValue(String label) {
        System.out.println(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static boolean isPasswordLengthValid(String newPassword) {
        return newPassword.length() >= 8;
    }

    private static List<String> isNewPasswordValid(UserCredential userCredential) {
        List<String> errorMessages = new ArrayList<>();

        if (!isPasswordLengthValid(userCredential.newPassword)) {
            errorMessages.add("Your new password must be at least 8 characters long");
        }
        if (!hasSpecialCharacter(userCredential.newPassword)) {
            errorMessages.add("Your new password must contain a special character");
        }
        if (!hasUpperCase(userCredential.newPassword)) {
            errorMessages.add("Your new password must contain an uppercase letter");
        }
        if (!differentFromPreviousPassword(userCredential)) {
            errorMessages.add("Your new password must not be the same as the old password");
        }
        if (!newPasswordDoesNotContainUserName(userCredential)) {
            errorMessages.add("Your new password must not not contain the username");
        }
        return errorMessages;

    }

    private static boolean differentFromPreviousPassword(UserCredential userCredential) {
        return !userCredential.newPassword.equals(userCredential.oldPassword);
    }

    private static boolean newPasswordDoesNotContainUserName(UserCredential userCredential) {
        return !userCredential.newPassword.contains(userCredential.username);
    }

    private static boolean hasSpecialCharacter(String newPassword) {
        return !newPassword.matches("[a-zA-Z0-9 ]*");
    }

    private static boolean hasUpperCase(String newPassword) {
        return !newPassword.equals(newPassword.toLowerCase());
    }
}
