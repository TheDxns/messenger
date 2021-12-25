package io.github.thedxns.messenger;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import io.github.thedxns.messenger.logic.UserService;
import io.github.thedxns.messenger.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Route("/")
public class ChatList extends VerticalLayout {

    private final UserService contactService;

    @Autowired
    public ChatList(UserService userService) {
            this.contactService = userService;
            Grid<User> grid = new Grid<>(User.class, false);
            grid.addColumn(User::getId).setHeader("ID");
            grid.addColumn(User::getName).setHeader("Question");
            grid.addColumn(User::getSurname).setHeader("Answer");
            grid.addColumn("Chat").setHeader("");

            //List<User> contacts = userService.getAllContacts();
            //grid.setItems(contacts);
    }

}