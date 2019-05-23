package services;

import model.Order.Order;
import database.DBConnection;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

public class EmailService {

    private int resultSet;

    public int sendMonthlyNewsLetter(String emailAddress) {
        DBConnection DBConnection1 = new DBConnection();
        Connection connection1 = DBConnection1.getConnection();

        try {
            String sql = "INSERT INTO newsLetters" + " (email)" + " VALUES ('" + emailAddress + "')";

            Statement statement = connection1.createStatement();
            resultSet = statement.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
    }
    return resultSet;
}

    public void sendTaxInvoice(Order order, String emailAddress) {
    }

    public void sendEnquiryEmail(String Subject, String enquiryBody) {
    }

    public void  sendEmail() {

        Properties props = new Properties();
        props.put("mail.smtp.host", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.trust", "*");

        final String username = "amna.hilmy@gmail.com";
        final String password = "(hApPy321)";

        Authenticator authenticator = new Authenticator() {
            private PasswordAuthentication pa = new PasswordAuthentication(username, password);

            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return pa;
            }
        };

        Session session = Session.getInstance(props, authenticator);
        session.setDebug(true);

        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress("amna.hilmy@gmail.com"));
            InternetAddress[] address = {new InternetAddress("amna.hilmy@gmail.com")};
            message.setRecipients(Message.RecipientType.TO, address);
            message.setSubject("Invoice");
            message.setSentDate(new Date());
            message.setText("Test Invoice");
            Transport.send(message);

        } catch (MessagingException ex) {

            ex.printStackTrace();
        }

    }
}
