package com.xworkz.fest.work;

class Chat extends Group {
    Chat() {
        super(); // Calls the parent class constructor
        System.out.println("Chat class");
    }

    public void sendMessage() {
        System.out.println("Sending a message in the chat.");
    }

    public void deleteMessage() {
        System.out.println("Deleting a message from the chat.");
    }

    public void pinMessage() {
        System.out.println("Pinning an important message.");
    }

    public void muteChat() {
        System.out.println("Muting the chat notifications.");
    }

    public void shareFile() {
        System.out.println("Sharing a file in the chat.");
    }
}

