package io.github.thedxns.messenger;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/chat")
public class ChatWindow extends VerticalLayout {

    public ChatWindow() {
        add(new Text("Have a good chat."));
    }

}