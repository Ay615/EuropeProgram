package com.unitedcoder.studentshomework.deletenewsletter;

public class NewsLetter {
    private String Subject;
    private String SenderName;
    private String SenderEmail;
    private String HtmlContent;

    public NewsLetter() {
    }

    public NewsLetter(String subject, String senderName, String senderEmail, String htmlContent) {
        Subject = subject;
        SenderName = senderName;
        SenderEmail = senderEmail;
        HtmlContent = htmlContent;
    }

    public String getSubject() {
        return Subject;
    }

    public String getSenderName() {
        return SenderName;
    }

    public String getSenderEmail() {
        return SenderEmail;
    }

    public String getHtmlContent() {
        return HtmlContent;
    }
}
