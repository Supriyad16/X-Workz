package com.xworkz.fest.work;

class Chat extends Group {
    Chat() {
        super();
        System.out.println("Chat class");
    }

    public void createGroup() {
        System.out.println("Creating a new group to chat.");
    }

    public void addMembers() {
        System.out.println("Adding members to the group for chit chat.");
    }

    public void removeMember() {
        System.out.println("Removing a member.");
    }

    public void changeGroupName() {
        System.out.println("Changing the group name to different one.");
    }

    public void deleteGroup() {
        System.out.println("Delete the group.");
    }
}

