package a_anonymousclass;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();

        TalkingDog dogger = new TalkingDog();
        dogger.speak();

        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("what a hell");
            }
        };

        dog2.speak();

    }
}
