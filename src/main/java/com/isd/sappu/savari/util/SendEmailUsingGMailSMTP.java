package com.isd.sappu.savari.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmailUsingGMailSMTP {
   public void sendMail(String sendEmail, String subject, String content) {
      // Recipient's email ID needs to be mentioned.
      String to = sendEmail;//change accordingly

      // Sender's email ID needs to be mentioned
      String from = "SappuSavariApplication@gmail.com";//change accordingly
      final String username = "Samanrajapaksha19880126@gmail.com";//change accordingly
      final String password = "1qaz2wsx!";//change accordingly

      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      // Get the Session object.
      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
         }
      });

      try {
         // Create a default MimeMessage object.
         Message message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(to));

         // Set Subject: header field
         message.setSubject(subject);

         // Now set the actual message
         message.setText(content);

         // Send message
         Transport.send(message);

         System.out.println(content);

      } catch (MessagingException e) {
         //do nothing
      }
   }
}