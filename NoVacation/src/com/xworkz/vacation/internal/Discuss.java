package com.xworkz.vacation.internal;

public class Discuss extends Chat{

    public  void debate(Group group){

        group.createGroup();

        if (group instanceof  Chat){

            Chat chat = (Chat) group;
            chat.changeGroupName();
            chat.addMembers();
            chat.removeMember();
            chat.createGroup();
            chat.deleteGroup();

        }
    }
}
