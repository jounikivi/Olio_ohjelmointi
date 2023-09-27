package viikko3;

public class Main {
    public static void main(String[] args) {
        MyThing myThing, myThing2;
        myThing = new MySubThing();
        myThing2 = new MyOtherThing();

        myThing.value = 7;
        myThing2.value = 44;

        myThing.display();
        myThing2.display();
    }
}


	
