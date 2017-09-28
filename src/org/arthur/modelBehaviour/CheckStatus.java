package org.arthur.modelBehaviour;

import org.arthur.enums.Status;
import org.arthur.model.Human;
import org.arthur.model.Intern;

/**
 * Created by adobrya on 9/27/2017.
 */
public interface CheckStatus {
    
     default Status checkStatus(Human human){
         Intern intern = ((Intern) human);
         Status status = intern.getStatus();
         intern.setStatus(status);
        if (status == Status.OFFLINE ||
                status == Status.AWAY
                || status == Status.BUSY) {
            System.out.println(human.getName() + " is " + status + " try again later");
            try {
                Thread.sleep(status.getDelay());
            } catch (InterruptedException e) {
            }
            return checkStatus(intern);
        } else return Status.ONLINE;
    }
}
