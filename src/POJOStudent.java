public class POJOStudent {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public POJOStudent(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "POJOStudent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}

/*
annotation
-> type of metadata
-> metadata is a way of formally describing additional information about our code
-> annotation are more structured, and have more meaning, than comments
-> this is because they can be used by the compiler, or other type of preprocessing function, to get information about the code

overriden method
-> overriden method is a special method in java, that other classes can implement, if they use a specified method signature
*/
