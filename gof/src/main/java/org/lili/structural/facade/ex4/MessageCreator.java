package org.lili.structural.facade.ex4;

import java.security.Security;
import java.util.Hashtable;
import java.util.Vector;

/**
 * Created by lili on 2017/7/12.
 */
class RichText{
//    URL
}


public class MessageCreator {
    public final static int MIME = 1;
    public final static int MAPI = 2;
    private Hashtable headerFields = new Hashtable();
    private RichText messageBody;
    private Vector attachments = new Vector();
    private boolean signMessage;
    public MessageCreator(String to, String from,
                          String subject, int type) {
        headerFields.put("to", to);
        headerFields.put("from", from);
        headerFields.put("subject", subject);
    }
    public MessageCreator(String to,
                          String from,
                          String subject) {
        this(to, from , subject, inferMessageType(to));
    }
    private static int inferMessageType(String address) {
        int type = 0;

        return type;
    }

    public void setMessageBody(String messageBody) {
        setMessageBody(new RichTextString(messageBody));
    }

    public void setMessageBody(RichText messageBody) {
        this.messageBody = messageBody;
    }

    public void addAttachment(Object attachment) {
        attachments.addElement(attachment);
    }
    public void setSignMessage(boolean signFlag) {
        signMessage = signFlag;
    }

    public void setHeaderField(String name, String value) {
        headerFields.put(name.toLowerCase(), value);
    }

    public void send() {
        //...
    }

    private Security createSecurity() {
        Security s = null;
        //...
        return s;
    }




}
