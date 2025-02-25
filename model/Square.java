import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Square extends Shape{
    private String name;
    private Boolean single;
    private Type type; // please add angles count into constructor for each shape type like Type.triangle(3)
    private Set <Talent> talents = new HashSet <>();
    private Set<Shape> connection = new HashSet<>();
    private int evolution;
    private Shape couple;
    private long funds;
    private long healt_point;
    private Passport passport;
    private boolean live;

    public Square(String name, Type type, int evolution) {
        this.name = name;
        this.type = type;
        this.evolution = evolution;
        this.funds = 5000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSingle() {
        return single;
    }

    public void setSingle(Boolean single) {
        this.single = single;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Set<Talent> getTalents() {
        return talents;
    }

    public void setTalents(Set<Talent> talents) {
        this.talents = talents;
    }

    public int getEvolution() {
        return evolution;
    }

    public void setEvolution(int evolution) {
        this.evolution = evolution;
    }

    public Shape getCouple() {
        return couple;
    }

    public void setCouple(Shape couple) {
        this.couple = couple;
    }

    public long getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public long getHealt_point() {
        return healt_point;
    }

    public void setHealt_point(long healt_point) {
        this.healt_point = healt_point;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    @Override
    public boolean Equals(Object object) {
        if (this == object) return true;
        if (this == null || this.getClass() != object.getClass() )return false;

        Square square = (Square)object;
        return Objects.equals(this.name,((Square) object).getName()) && Objects.equals(this.getFunds(),((Square) object).getFunds());

    }
    @Override
    public int hashCode(){
        return Objects.hash(this.getName(), this.getHealt_point());
    }

}
