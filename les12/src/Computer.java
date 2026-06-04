import org.w3c.dom.ls.LSOutput;

public class Computer {

    private int memory;
    private int cpu;
    private String name;

    Computer() {}; //нужен если не передавать значения при создание обьекта

    Computer(int memory, int cpu, String name){
        this.memory = memory;
        this.cpu = cpu;
        this.name = name;
    } //нужен если сразу передавать значения при создание обьекта


    void getCpu() {
        System.out.println(cpu);
    } //вывод значения CPU

    void getMemory() {
        System.out.println(memory);
    } //вывод значения Memory

    void getName(){
        System.out.println(name);
    } //вывод значения Name

    void setMemory (int m) {
        memory = m;
    }  // ввод значния Memory

    void setCpu (int c) {
        cpu = c;
    } // ввод значния CPU

    void setName(String n){
        name = n;
    } // ввод значния Name

}
