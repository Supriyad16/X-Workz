package com.xworkz.vacation.internal;

public class GroupRunner {
    public static void main(String[] args) {

        Group group = new Chat();
        group.createGroup();
        group.addMembers();
        group.removeMember();
        group.changeGroupName();
        group.deleteGroup();


        Chat chat = new Chat();
        chat.changeGroupName();
        chat.addMembers();
        chat.removeMember();
        chat.createGroup();
        chat.deleteGroup();

        Discuss discuss = new Discuss();
        discuss.changeGroupName();
        discuss.addMembers();
        discuss.removeMember();
        discuss.createGroup();
        discuss.deleteGroup();
    }
}
