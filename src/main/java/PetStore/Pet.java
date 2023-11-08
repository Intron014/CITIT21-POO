package PetStore;

public class Pet{
    private String name;
    private String chipCode;
    private EMASCOTA petType;

    public Pet(String name, String chipCode, EMASCOTA petType) throws LeException {
        super();
        if(name == null || name.isEmpty())
            throw new LeException("Name cannot be null or empty");
        this.name = name;
        this.chipCode = chipCode;
        this.petType = petType;
    }

    public String getName(){
        return name;
    };

}
