package com.ct;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //primitives
        int myNumber = 10;
        boolean isActive = true;
        boolean hasBeenProcessed = false;
        double myDouble = 10.0;
        long myLong = 10000000000L;

        Object myObject = new Object();

        //Object version of primitives
        //int 32bit
        Integer myInteger = new Integer(10);
        Boolean myBoolean = new Boolean(true);
        Double myObjectDouble = new Double(10.00);
        //long 64bit
        Long myObjectLong = new Long(myLong);

        //no good, too big
        long myBigNumber = 1000000000000000000L;

        double myLongToDouble = myObjectLong.doubleValue();

        //autoboxing
        double myMph = new Double(10.0);
        Double myKpg = 10.0;

        double userAge = 0;
        double userAgeOldSchool = -1;
        double userAgeUnknow;
        //System.out.printf("%.2f%n", userAgeUnknow);

        Double userAgeAsObject = null;
        /*if (userAgeAsObject == null) {
            userAgeAsObject = 10.0;
        }*/
        if (userAgeAsObject != null) {
            System.out.println(userAgeAsObject + 10.0);
        }

        // Collections

        //List are ordered and can have duplicates
        //unbounded
        List<String> myTodoList = new ArrayList<>();
        myTodoList.add("cut the lawn");

        //bound
        //does not work; can't use primitives with Collections List<int> myFaveNumber = new ArrayList<>(10);
        List<Integer> myFaveNumbers = new ArrayList<>(10);
        myFaveNumbers.add(1);

        //showcase ordering
        List<String> myTopTenMovies = new ArrayList<>(10);
        myTopTenMovies.add("Rocky 1"); //0
        myTopTenMovies.add("BTF"); //1
        myTopTenMovies.add("Star Wars"); //2
        myTopTenMovies.add("Star Wars"); //3
        // [],[],[]
        String myFacovriteThirdMovie = myTopTenMovies.get(3 - 1);

        System.out.println(myTopTenMovies);


        //Sets are not-ordered and cannot have duplicates
        Set myChildren = new HashSet();
        Set myGunCollection = new HashSet(20);

        Set<String> myFaveMovieSet = new HashSet<>();
        myFaveMovieSet.add("Rocky 1");
        myFaveMovieSet.add("BTF");
        myFaveMovieSet.add("Star Wars");
        myFaveMovieSet.add("Star Wars");

        // <hash id, value>
        System.out.println(myFaveMovieSet);

        //an array is static and can't grow
        int CONDITION_1 = 0;
        int CONDITION_2 = 1;
        int CONDITION_3 = 2;
        Double[] myIntArray = {3.4, 5.4, 7.6};
        double processedValue = 1.2 * CONDITION_1;
        //example of conversion from list to array
        String[] myListedArray = myTopTenMovies.toArray(new String[0]);

        //Map
        /**
         *  Javascript & Python psudeocode
         *   const myData = {
         *     msg: hello,
         *     data: {
         *       val: 1
         *     }
         *   }
         *
         *   myData.msg = "new hello"
         */
        //Map has always, a key, and a value
        //keys can't be duplicated
        Map<Integer, String> numberToStringMap = new HashMap<>();
        numberToStringMap.put(1, "one");
        numberToStringMap.put(2, "two");
        numberToStringMap.put(3, "three");
        numberToStringMap.put(3, "tree");
        //this doesn't exist -> numberToStringMap.1 = "new number"
        System.out.println(numberToStringMap);

        String myFourthValue = numberToStringMap.get(4);
        System.out.println(myFourthValue);

        //this will throw an NPE (null pointer exception)
        //char firstCharacter = myFourthValue.charAt(0);
        //System.out.println(firstCharacter);

        //other languages give you; java is old
        //char firstCharacter = myFourthValue?charAt(0) : "";
        //java old way -> ternary (or alternately an if/else)
        //chat firstCharacter = myFourthValue == null ? "" : myFourthValue.charAt(0);

        numberToStringMap.put(4, "four");
        System.out.println(numberToStringMap.get(4));

        record User(String name, Integer age) {
        }

        Map<UUID, User> myStudentMap = new HashMap<>();
        myStudentMap.put(UUID.randomUUID(), new User("bob", 18));
        myStudentMap.put(UUID.randomUUID(), new User("mike", 19));
        myStudentMap.put(UUID.randomUUID(), new User("gil", 20));
        System.out.println(myStudentMap);
        //User student = myStudentMap.get(myUUIDFrontUI);
        /** if (student == null) {
            throw new Exception("no student found");
         } else {
           return student;
         }

         no no
         myStudentMap.findStudentWithBookThree("Book Three");
         */

        // ENUMS
        enum AutoMakers {
            NISSAN, TOYOTA, HONDA, FORD, TESLA

        }
        var userInputToSwitch = AutoMakers.FORD;

        switch (userInputToSwitch) {
            case HONDA -> System.out.println("honda");
            case FORD -> {
                System.out.println("you chose FORD");
            }
            case TESLA -> System.out.println("Tesla");
        }

        //enum with mapped data that is static and can't change
        // this can be called a dictionary
        enum AutoMakersComplex {
            NISSAN("Japan", 1900),
            TOYOTA("Japan", 1850),
            HONDA("", 1987),
            FORD("US", 1900),
            TESLA("US", 2010);

            String country;

            int yearEstablished;

            AutoMakersComplex(String country, int i) {
                this.country = country;
                this.yearEstablished = i;
            }
        }

        var myFordAlternateUniverse = AutoMakersComplex.FORD;
        myFordAlternateUniverse.yearEstablished = 100;

    }
}