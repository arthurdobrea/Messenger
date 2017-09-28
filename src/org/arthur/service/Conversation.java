package org.arthur.service;

import org.arthur.model.Human;

/**
 * Created by adobrya on 9/26/2017.
 */
public interface Conversation {
    void sendMessage(Human sender, Human receiver,String Message);
}
