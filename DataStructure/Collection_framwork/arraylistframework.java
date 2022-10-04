package DataStructure.Collection_framwork;

import java.util.ArrayList;
public class arraylistframework {
    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<>();
        Students.add("Kushal");// adding values in the last
        Students.add("Badal");// adding values in the last
        Students.add("Dalsukh");// adding values in the last
        System.out.println(Students);
        Students.add(1,"divya");
        System.out.println(Students);
//        internal working of Arraylist
//                at first n=10;
//                after all spaces are filled
//                n=n+n/2+1;
//                example 10+10/2+1
//            copy all the data in new arraylist and will delete previous ones
    }
}
