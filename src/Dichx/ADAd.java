package Dichx;

public class ADAd {
    public static void main(String[] args) {
        Pair pair = new Pair("Vova", 14);
        System.out.println(pair.getName());
        System.out.println(pair.getId());

    }
}
class Pair {
     private String name;
     private int id;

    Pair(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}