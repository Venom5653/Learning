package Package3;

public class Animal {
    private int id;
    public Animal(){

    }
    public Animal(int id){
        this.id = id;
    }

    public void eat(){
        System.out.println("Animal is eat...");
    }
    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
