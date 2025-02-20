public  abstact class Shape{

    private String name;
    protected Boolean single;
    protected Type type; // please add angles count into constructor for each shape type like Type.triangle(3)
    protected Set<Talent> talents = new HashSet<>(); 
	protected int evolution_stage,points_to_evolve;
	protected Shape couple;
	protected int funds;
	protected UUID id;

}
