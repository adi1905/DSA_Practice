public class enum_dataType {
    public static void main(String[] args) {
        enum Day {MON, TUES, WEDNES,THURS,FRI,SAT,SUN};
        Day today = Day.TUES; 
        System.out.println(today.name().getClass());
    }
}



// name() method can be used to convert enum datatype to String.