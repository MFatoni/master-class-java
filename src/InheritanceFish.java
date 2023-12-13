public class InheritanceFish extends InheritanceAnimal{
    private int gills;
    private int fins;

    public InheritanceFish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("muscles moving");
    }
    private void moveBackFin(){
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "InheritanceFish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
