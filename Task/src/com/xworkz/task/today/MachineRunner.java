package com.xworkz.task.today;

public class MachineRunner {
    public static void main(String[] args) {
        Machine machine = new Machine("Washing", "Laundry", 800);
        System.out.println("Machine " + machine.toString());

        int code = machine.hashCode();
        String value="work";
        System.out.println("Made of metal:" + machine.hashCode());
        System.out.println("Made of Metal:" + value.hashCode());

        Machine machine1 = new Machine("Grinder", "Mixing", 400);
        boolean equal= machine1.equals(machine1);
        System.out.println("equal :"+ equal);
    }
}
