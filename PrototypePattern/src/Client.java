public class Client {
    public static void main(String arg[]){
        MyFruit fruit1= new Apple();
        MyFruit fruit2= (MyFruit) fruit1.clone();
        fruit1.display();
        fruit2.display();
        System.out.println("fruit1:"+fruit1.hashCode());
        System.out.println("fruit2:"+fruit2.hashCode());
    }
}
