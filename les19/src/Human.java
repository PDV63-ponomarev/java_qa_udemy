public class Human {

    private String name = "Ivan";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(){
        }

    public Human(int q){
        System.out.println(q);
    }

    public Human(String q){
        System.out.println(q);
    }

}
