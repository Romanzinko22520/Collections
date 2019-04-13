package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(3);
        list.add(6);
        System.out.println(list);


   ArrayList<User> users= new ArrayList<>();
    users.add(new User(1,"Roman"));
        users.add(new User(45,"Vika"));

        users.add(new User(31,"Taras"));
        users.add(new User(100,"Oleg"));
        System.out.println(users);

        Collections.sort(users);
        System.out.println(users);


//        CompareUser compareUser= new CompareUser();
//       users.sort(compareUser);
//        System.out.println(users);


        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.name == "Taras"){
                iterator.remove();
            }
        }
        System.out.println(users);



      TreeSet<User> users2 = new TreeSet<>();
         users2.add(new User(1,"Roman"));
        users2.add(new User(100,"Roman"));
        users2.add(new User(31,"Roman"));
        users2.add(new User(41,"Roman"));
        System.out.println(users2);


        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Roman");
        map.put(3,"Vika");
        map.put(5,"Taras");
        map.put(7,"Yura");
        System.out.println(map);


        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> next = iterator1.next();
            if (next.getValue().equals("Vika")){
                iterator1.remove();

            }
        }

        System.out.println(map);
        CompareCar compareCar = new CompareCar();

        TreeSet<Car> cars = new TreeSet<>(compareCar);
        cars.add(new Car("bmv", 1, 2010, "black",new Wheel("Aldi",78.2),new Motor(1,78.2,100.2)));
        cars.add(new Car("mers", 2, 1993, "yelow",new Wheel("Netto",156.34),new Motor(2,100,98.2)));
        cars.add(new Car("opel", 3, 1999, "green",new Wheel("Panny",756.2),new Motor(3,200,99.56)));
        cars.add(new Car("audi", 4, 2019, "red",new Wheel("Nash",41.2),new Motor(4,4000,45.2)));



//        CompareCar compareCar = new CompareCar();
//        cars.sort(compareCar);
//        System.out.println(cars);

        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            if (next.year <= 2010) {
                double diameter = next.carWheel.diameter;
                double radius= (diameter/2)-20;
                next.carWheel.diameter=radius;
               // System.out.println(next);
            }
        }


            ArrayList<Car> car2 = new ArrayList<>();
            Iterator<Car> iterator2 = cars.iterator();
            while (iterator2.hasNext()) {
                Car next = iterator2.next();
                if (next.year <= 2010) {
                   car2.add(next);
            }

            }
        System.out.println(car2);


        Iterator<Car> iterator3 = car2.iterator();
        while (iterator3.hasNext()) {
            Car next = iterator3.next();
            System.out.println(next);
        }

        HashMap<User,Car>map =new HashMap<>();
        map.put(new User(1,"Roman"),new Car("bmv", 1, 2010, "black",new Wheel("Aldi",78.2),new Motor(1,123,100.2)));
        map.put(new User(1,"Oleg"),new Car("sitroen", 1, 2019, "black",new Wheel("NAshkrai",78.2),new Motor(1,78.2,100.2)));
        map.put(new User(1,"PEtro"),new Car("Tavria", 1, 1990, "black",new Wheel("Aldi",78.2),new Motor(1,78,100.2)));
        System.out.println(map);



        Set<Map.Entry<User, Car>> entries = map.entrySet();
        Iterator<Map.Entry<User, Car>> iteratorMap = entries.iterator();
        while (iteratorMap.hasNext()) {
            Map.Entry<User, Car> next = iteratorMap.next();
           if (next.getValue().year>= 2000){
               iteratorMap.remove();

           }
        }
        System.out.println(map);


    }




}

        

