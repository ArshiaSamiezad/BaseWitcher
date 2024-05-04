package model;

public class LoginMenuInfo {
    private static String forgetPasswordUsername = null;
    private static boolean answeredQuestion = false;

    public static String getForgetPasswordUsername() {
        return forgetPasswordUsername;
    }

    public static void setForgetPasswordUsername(String forgetPasswordUsername) {
        LoginMenuInfo.forgetPasswordUsername = forgetPasswordUsername;
    }

    public static boolean isAnsweredQuestion() {
        return answeredQuestion;
    }

    public static void setAnsweredQuestion(boolean answeredQuestion) {
        LoginMenuInfo.answeredQuestion = answeredQuestion;
    }
}
