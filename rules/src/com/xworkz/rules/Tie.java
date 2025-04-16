package com.xworkz.rules;

public class Tie implements Brick, Brush, Bowl, Bolt, Fan {

    @Override
    public void tighten() {
        System.out.println("Tightening the bolt");
    }

    @Override
    public void loosen() {
        System.out.println("Loosening the bolt");
    }

    @Override
    public void rust() {
        System.out.println("Bolt is rusted");
    }

    @Override
    public void holdFood() {
        System.out.println("Bowl holding food");
    }

    @Override
    public void wash() {
        System.out.println("Washing the bowl");
    }

    @Override
    public void cover() {
        System.out.println("Covering the bowl");
    }

    @Override
    public void build() {
        System.out.println("Building with bricks");
    }

    @Override
    public void breakBrick() {
        System.out.println("Breaking the brick");
    }

    @Override
    public void weigh() {
        System.out.println("Weighing the brick");
    }

    @Override
    public void spin() {
        System.out.println("Fan spinning");
    }

    @Override
    public void switchOn() {
        System.out.println("Fan switched on");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the fan");
    }

    @Override
    public void paint() {
        System.out.println("Painting with brush");
    }

    @Override
    public void dry() {
        System.out.println("Drying with brush");
    }

    @Override
    public void cleans() {
        System.out.println("Brush used for cleaning");
    }

    public static void main(String[] args) {
        Bolt bolt = new Tie();
        bolt.tighten();
        bolt.loosen();
        bolt.rust();

        Bowl bowl = new Tie();
        bowl.holdFood();
        bowl.cover();
        bowl.wash();

        Brick brick = new Tie();
        brick.build();
        brick.breakBrick();
        brick.weigh();

        Fan fan = new Tie();
        fan.spin();
        fan.switchOn();
        fan.cleans();

        Brush brush = new Tie();
        brush.paint();
        brush.dry();
        brush.clean();
    }
}
