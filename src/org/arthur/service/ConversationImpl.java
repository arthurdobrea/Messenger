package org.arthur.service;

import org.arthur.enums.Status;
import org.arthur.model.Human;
import org.arthur.model.Intern;
import org.arthur.model.Mentor;

/**
 * Created by adobrya on 9/26/2017.
 */
public class ConversationImpl implements Conversation {
    @Override
    public  void sendMessage(Human sender, Human receiver, String Message) {
        if(receiver instanceof Intern &&(((Intern) receiver).checkStatus(receiver) == Status.ONLINE)){
            System.out.println(sender.getName() + ": " + Message + ". " + receiver.getName() + " received message");
        }

        if(sender instanceof Mentor){
            System.out.println(sender.getName() + ": " + Message + ". "
                    + receiver.getName() + " received message, because " + sender.getName() + " is All-powerful mentor");
        }
    }

}
