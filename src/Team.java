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
        if (builders.size()!=0){
            for(Builder builder : builders){
            builder.builds();
            }
        }else {
            System.out.println("\n---------------------");
            System.out.println("Team is empty!");
            System.out.println("---------------------\n");
        }
    }
}
