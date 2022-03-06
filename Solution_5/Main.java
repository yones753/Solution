package Solution_5;

public class Main {
    public static void main(String[] args) {
        MyProtectedUniqueList myList=new MyProtectedUniqueList("yones123");
//        myList.Add("123","7");
//        myList.Add("yones123","");

        myList.Add("yones123","3");
        myList.Add("yones123","2");
        myList.Add("yones123","5");


//        myList.Clear("yones123");

//        System.out.println(myList.ToString());



        for (var item: myList) {
            System.out.println(item);
        }
    }
}
