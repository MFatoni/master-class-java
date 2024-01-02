import java.util.ArrayList;
import java.util.List;

public class GeneralizationExercise {

    public static void main(String[] args) {

        List<GeneralizationExerciseMappable> mappables = new ArrayList<>();

        mappables.add(new GeneralizationExerciseBuilding("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new GeneralizationExerciseBuilding("Sydney Opera House",
                UsageType.ENTERTAINMENT));
        mappables.add(new GeneralizationExerciseBuilding("Stadium Australia", UsageType.SPORTS));

        mappables.add(new GeneralizationExerciseUtilityLine("College St", UtilityType.FIBER_OPTIC));
        mappables.add(new GeneralizationExerciseUtilityLine("Olympic Blvd", UtilityType.WATER));

        for (var m : mappables) {
            GeneralizationExerciseMappable.mapIt(m);
        }
    }
}