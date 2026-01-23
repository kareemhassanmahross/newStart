package newStart.OOP.Abstract;

import java.util.*;

public class collectionDemo {
    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        QueueDemo();
        mapDemo();
    }
    /*
     HashSet => Store data without duplication and without sorting
     LinkedHashSet => Store data without duplication, with sorting during insertion
     TreeSet => Store data without duplication, with sorting from small to bigger
     */
    public static void setDemo(){
        Set <Integer> fruits = new HashSet();
        Set <Integer> fruit1 = new LinkedHashSet();
        Set <Integer> fruit2 = new TreeSet();

        fruits.add(1);
        fruits.add(2);
        fruits.add(3);
        fruits.add(4);     //[banana, apple, Lemon, Orange]
        fruits.add(1);
        System.out.println(fruits);
        var i = fruits.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("================");
         for (int fruit:fruits){
             System.out.println(fruit);
         }
        System.out.println("================");
         fruits.forEach(x-> System.out.println(x));
        System.out.println("================");
        fruits.forEach(System.out::println);
        System.out.println("================");
        fruit1.add(1);
        fruit1.add(3);
        fruit1.add(4);    //[apple, Lemon, banana, Orange]
        fruit1.add(2);
        fruit1.add(1);
        System.out.println(fruit1);
        System.out.println("================");
         Iterator<Integer> z = fruit1.iterator();
         while (z.hasNext()){
             System.out.println(z.next());
         }
        System.out.println("================");
         for(int fruit:fruit1){
             System.out.println(fruit);
         }
        System.out.println("================");
         fruit1.forEach(x-> System.out.println(x));
        System.out.println("================");
        fruit1.forEach(System.out::println);
        System.out.println("================");
        fruit2.add(4);    //[Lemon, Orange, apple, banana]
        fruit2.add(1);
        fruit2.add(3);
        fruit2.add(2);
        fruit2.add(1);
        System.out.println(fruit2);
        System.out.println("================");
        Iterator<Integer> y = fruit2.iterator();
        while (y.hasNext()){
            System.out.println(y.next());
        }
        System.out.println("================");
        for (int fruit:fruit2){
            System.out.println(fruit);
        }
        System.out.println("================");
        fruit2.forEach(s-> System.out.println(s));
        System.out.println("================");
        fruit2.forEach(System.out::println);
    }
    /*
    list
    =======
    1- ArrayList  =>
    2- LinkedList =>
    3- Stack      =>
    4- Vector     =>
    */
    public static void listDemo(){
        List <String> list = new ArrayList<>();
        list.add("kareem");
        list.add("Ahmed");
        list.add("Diap");
        list.add("Sara");
        list.add("Yara");
        list.add(1,"Hassan");

        List <String> other = new ArrayList<>();
        other.add("Emad");
        other.add("Nada");
        other.add("Noor");

        list.addAll(6,other);

//        System.out.println(list.toArray().length);
//        System.out.println(list.get(6));
//        System.out.println(list.indexOf("Noor"));
//        System.out.println(list.lastIndexOf("Noor"));
//        System.out.println(list.iterator().next());
//        System.out.println(list.listIterator(2).next());
        list.remove(2);
        list.add(2,"Mahross");
        list.set(5,"Samar");
//        System.out.println(list);
//        System.out.println(list.subList(4,8));
//        System.out.println(list);
        list.add("karam");
        System.out.println(list);
        Iterator <String> l = list.iterator();
        while (l.hasNext()){
            System.out.println(l.next());
        }
        System.out.println("===============================================================");
        for (String li:list){
            System.out.println(li);
        }
        System.out.println("===============================================================");
        list.forEach(x-> System.out.println(x));
        System.out.println("===============================================================");
        list.forEach(System.out::println);
    }
    public static void QueueDemo(){
        Queue <Integer> Qlist = new LinkedList();
        Qlist.add(1);
        Qlist.add(4);
        Qlist.add(3);
        Qlist.add(8);
        Qlist.add(12);
//        System.out.println(Qlist.peek()); // if qlist is null return null
//        System.out.println(Qlist.element()); // if qlist is null return Exeption error
//        System.out.println(Qlist.remove()); // delete first item from list but if qlist is null return exeption error
//        System.out.println(Qlist.poll()); // delete first item from list but if qlist is null return null
        System.out.println(Qlist);
        System.out.println("===================");
        Iterator <Integer> i = Qlist.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("===================");
        for (int qlist:Qlist){
            System.out.println(qlist);
        }
        System.out.println("===================");
        Qlist.forEach(x-> System.out.println(x));
        System.out.println("===================");
        Qlist.forEach(System.out::println);
    }
    public static void mapDemo(){
        Map <String,Integer> List = new HashMap();
        List.put("kareem" , 20);
        List.put("Ahmed" , 10);
        List.put("Diap" , 50);
        List.put("Akram" , 22);
        System.out.println(List);
        for(var Mlist:List.entrySet()){
            System.out.println("Your name is "+ Mlist.getKey() + " and Your Age is " + Mlist.getValue());
        }

    }
}
