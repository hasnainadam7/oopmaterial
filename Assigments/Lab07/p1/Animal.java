package p1;

//Animal(interface) 
public interface Animal {

    abstract void detail();    //one additional abstract void by me for another information of animal

    abstract void eat();

    abstract void travel();
}

// Class OF Reptile
class Crocodile_Reptile implements Animal {
    public void detail() {
        System.out.println("\n\nCategroy :Repatile\nName :Crocodile");
    }

    public void eat() {
        System.out.println("Eat :Meat Of any animal");
    }

    public void travel() {
        System.out.println("Travel :Lakes of fresh Water");
    }
}

// Class OF Bird
class Pigeon_Bird implements Animal {
    public void detail() {
        System.out.println("\n\nCategroy :Bird\nName :Pigeon");
    }

    public void eat() {
        System.out.println("Eat :Insects ");
    }

    public void travel() {
        System.out.println("Travel :Sky ");
    }
}

// Class OF Fish
class Shark_Fish implements Animal {
    public void detail() {
        System.out.println("\n\nCategroy :Fish\nName :Shark");
    }

    public void eat() {
        System.out.println("Eat:Small Fishes ");
    }

    public void travel() {
        System.out.println("Travel :Deep water Of Sea");
    }
}

class Displaying {
    public static void main(String[] args) {
        Crocodile_Reptile reptile = new Crocodile_Reptile();
        reptile.detail();
        reptile.eat();
        reptile.travel();
        Pigeon_Bird bird = new Pigeon_Bird();
        bird.detail();
        bird.eat();
        bird.travel();
        Shark_Fish fish = new Shark_Fish();
        fish.detail();
        fish.eat();
        fish.travel();
    }
}