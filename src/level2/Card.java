package level2;

public class Card {
private String point;
private String color;
public  Card(String point, String color){
    this.point = point;
    this.color = color;
}
public  Card(String point){
    this.point = point;
}
public void printInfo(){
    System.out.println(this.color + " :" + this.point);
}
public Card(int x){

}
}
