package viikko3;

class MyThing {
    int value;

    public void display() {
        System.out.println("In MyThing, value is " + value);
    }
}

class MySubThing extends MyThing {
    @Override
    public void display() {
        System.out.println("In MySubThing, value is " + value);
    }
}

class MyOtherThing extends MyThing {
}
