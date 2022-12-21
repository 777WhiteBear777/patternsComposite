import Builder.Builder;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Team team = new Team();

        Builder firstWorker = new Worker();
        Builder secondWorker = new Worker();
        Builder engineer = new Engineer();

        team.addBuilders(firstWorker);
        team.addBuilders(secondWorker);
        team.addBuilders(engineer);

        team.build();

        team.removeBuilders(firstWorker);
        team.removeBuilders(secondWorker);
        team.removeBuilders(engineer);

        team.build();
    }
}
