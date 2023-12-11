public class POJOxRecord {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            POJOStudent s = new POJOStudent("ID"+i,
                    switch (i){
                        case 1 -> "marry";
                        case 2 -> "carol";
                        case 3 -> "tim";
                        case 4 -> "harry";
                        case 5 -> "lissa";
                        default -> "anonym";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }
        for(int i=1;i<=5;i++){
            RecordStudent s = new RecordStudent("ID"+i,
                    switch (i){
                        case 1 -> "marry";
                        case 2 -> "carol";
                        case 3 -> "tim";
                        case 4 -> "harry";
                        case 5 -> "lissa";
                        default -> "anonym";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }
        POJOStudent pojoStudent = new POJOStudent(
                "id p",
                "fatoni p",
                "1/1/2010 p",
                "Java MasterClass p"
        );
        RecordStudent recordStudent = new RecordStudent(
                "id r",
                "fatoni r",
                "1/1/2010 r",
                "Java MasterClass r"
        );
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        System.out.println(pojoStudent.getName());
        System.out.println(recordStudent.name());
    }
}
/*
if you wanna modify data on the class, you won't be using the record
but if you're reading a whole lot of records, from a database or file source and simply passing this data around, then the record is a big improvement
 */