import Builder.Builder;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final List<Builder> builders = new ArrayList<>();

    public void addBuilders(Builder builder){
        builders.add(builder);
    }

    public void  removeBuilders(Builder builder){builders.remove(builder);}
    public void build(){
        for(Builder builder : builders){
            builder.builds();
        }
    }
}
