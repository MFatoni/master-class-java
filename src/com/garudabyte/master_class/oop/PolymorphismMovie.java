package com.garudabyte.master_class.oop;

public class PolymorphismMovie {
    private String title;

    public PolymorphismMovie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instaceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instaceType + " film");
    }

    public static PolymorphismMovie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            default -> new PolymorphismMovie(title);
        };
    }
}

class Adventure extends PolymorphismMovie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Please Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure(){
        System.out.println("Watching an adventure");
    }
}

class Comedy extends PolymorphismMovie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }

    public void watchComedy(){
        System.out.println("Watching an comedy");
    }
}