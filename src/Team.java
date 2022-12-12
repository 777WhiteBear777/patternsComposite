import Builder.Builder;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Builder> builders = new ArrayList<>();

    public void addBuilders(Builder builder){
        builders.add(builder);
    }
    public void build(){
        for(Builder builder : builders){
            builder.builds();
        }
    }
}
