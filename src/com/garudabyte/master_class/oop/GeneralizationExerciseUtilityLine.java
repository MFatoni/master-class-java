package com.garudabyte.master_class.oop;

enum UtilityType {ELECTRICAL, FIBER_OPTIC, GAS, WATER}

public class GeneralizationExerciseUtilityLine implements GeneralizationExerciseMappable {

    private String name;
    private UtilityType type;

    public GeneralizationExerciseUtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICAL -> Color.RED + " " + LineMarker.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + LineMarker.DOTTED;
            case GAS -> Color.ORANGE + " " + LineMarker.SOLID;
            case WATER -> Color.BLUE + " " + LineMarker.SOLID;
            default -> Color.BLACK + " " + LineMarker.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return GeneralizationExerciseMappable.super.toJSON() + """
                , "name": "%s", "utility": "%s" """.formatted(name, type);
    }
}
