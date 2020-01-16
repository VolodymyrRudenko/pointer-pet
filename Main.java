package pointer.pet;

public class Main {

    public static void main(String[] args) {
        MakeVoice(new Dog());
        MakeVoice(new Cat());
        MakeVoice(new Cow());

    }

    static void MakeVoice(Pet pet) {
        pet.voice();
    }

}



