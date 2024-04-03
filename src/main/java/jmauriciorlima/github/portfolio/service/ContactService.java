package jmauriciorlima.github.portfolio.service;

import jmauriciorlima.github.portfolio.model.ContactModel;
import jmauriciorlima.github.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public ContactModel sendMessage(ContactModel contactModel) {
        return contactRepository.save(contactModel);
    }
}
