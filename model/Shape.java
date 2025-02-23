import java.util.HashSet;
import java.util.Set;

public  abstract class Shape{

    private String name;
    protected Boolean single;
    protected Type type; // please add angles count into constructor for each shape type like Type.triangle(3)
    protected Set<Talent> talents = new HashSet<>();
	protected int evolution;
	protected Shape couple;
	protected int funds;
	protected long healt_point;
	protected Passport passport;
	protected boolean live;


    public abstract boolean Equals(Object object);
}
