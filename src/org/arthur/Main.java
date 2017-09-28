package org.arthur;

import org.arthur.enums.Gender;
import org.arthur.enums.Status;
import org.arthur.enums.Stream;
import org.arthur.enums.WorkingPlace;
import org.arthur.model.Human;
import org.arthur.model.Intern;
import org.arthur.model.Mentor;
import org.arthur.service.Conversation;
import org.arthur.service.ConversationImpl;

/**
 * Created by adobrya on 9/25/2017.
 */
public class Main {
    public static void main(String[] args) {
        Human arthur = new Intern("arthur",22, Gender.MALE, Stream.AM, WorkingPlace.Tower, Status.ONLINE);
        Human dima = new Intern("Dima",23, Gender.MALE, Stream.JAVA, WorkingPlace.Tower, Status.OFFLINE);
        Human valera = new Mentor("Valera",98, Gender.MALE);

        Conversation conversation = new ConversationImpl();

        conversation.sendMessage(arthur ,dima,"WHERE ARE YOU FOR GOD SAKE?!");

    }
}
