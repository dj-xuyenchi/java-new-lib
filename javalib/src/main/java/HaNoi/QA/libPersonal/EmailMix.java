/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HaNoi.QA.libPersonal;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author PC
 */
public class EmailMix {

    private String myEmail;
    private String emailPass;
private int count =1;
    public EmailMix(String myEmail, String emailPass) {
        this.myEmail = myEmail;
        this.emailPass = emailPass;
    }

    public boolean sendContentTo(String toEmail, String headerEmail, String body) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail, emailPass);
            }
        };
        Session session = Session.getInstance(props, auth);
        MimeMessage msg = new MimeMessage(session);
        try {
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress(toEmail, "NoReply-JD"));
            msg.setReplyTo(InternetAddress.parse(toEmail, false));
            msg.setSubject(headerEmail, "UTF-8");
            msg.setText(body, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            Transport.send(msg);
        } catch (MessagingException ex) {
            return false;
        } catch (UnsupportedEncodingException ex) {
            return false;
        }
        return true;
    }

    public boolean sendContentAndMultipartTo(String toEmail, String headerEmail, String body, List<String> dataSource) {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
        props.put("mail.smtp.port", "587"); //TLS Port
        props.put("mail.smtp.auth", "true"); //enable authentication
        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail, emailPass);
            }
        });
        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(myEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            message.setSubject(headerEmail);
            BodyPart headerEmailPart = new MimeBodyPart();
            headerEmailPart.setText(body);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(headerEmailPart);
            for (String source : dataSource) {
                MimeBodyPart bodyPart = new MimeBodyPart();
                DataSource dataSourceDetail = new FileDataSource(source);
                bodyPart.setDataHandler(new DataHandler(dataSourceDetail));
                bodyPart.setFileName("file"+count);
                multipart.addBodyPart(bodyPart);
                count++;
            }
            message.setContent(multipart);
            Transport.send(message);
        } catch (AddressException ex) {
            return false;
        } catch (MessagingException ex) {
            return false;
        }
        return true;
    }
}
