package gr.aueb.cf.ch18.service.exceptions;

import gr.aueb.cf.ch18.model.MobileContact;

public class UserIdAlreadyExistsException extends Exception{
    private final long serialVersionUID = 1232123L;

    public UserIdAlreadyExistsException(MobileContact mobileContact) {
        super("Mobile contact with id: " + mobileContact.getId() + "already exists");
    }
}
