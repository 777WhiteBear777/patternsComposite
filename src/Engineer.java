import Builder.Builder;

public class Engineer implements Builder {
    @Override
    public void builds(){
        System.out.println("Make Project!");
    }
}
