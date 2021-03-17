package Package2;

public class Student {
    int weight;
    String Name;
    String localization = "Home";

    public Student(int weight, String name) {
        this.weight = weight;
        Name = name;
    }

    public void Eat (){
        weight+=1;
    }
    public void Run (int km){
        weight-=km;
    }
    public void GoToUniversity () {
        localization = "University";
    }
    public void GoHome () {
        localization = "Home";
    }
    public void info (){
        System.out.println(Name + " is in the " + localization + " now, the weight is " + weight + " kg.");
    }
    public void chat (String string){
        System.out.println(string);
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }
}
