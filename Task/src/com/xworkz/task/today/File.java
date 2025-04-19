package com.xworkz.task.today;

public class File {

    private String type;
    private double size;
    private String name;

    public File(String type, double size, String name) {
        this.type = type;
        this.size = size;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                File file = this;
                File file1 = (File) obj;
                if (file1.name.equals(file.name) && file1.type.equals(file.type)) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 30;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", size=" + size + "MB, name=" + name + "]";
    }
}
