package com.xworkz.fest.work;

public class GroupRunner {
    public static void main(String[] args) {

        Group group = new Chat();
        group.createGroup();
        group.addMembers();
        group.removeMember();
        group.changeGroupName();
        group.setGroupPrivacy();


        Chat chat = new Chat();
        chat.sendMessage();
        chat.deleteMessage();
        chat.pinMessage();
        chat.muteChat();
        chat.shareFile();
    }
}
