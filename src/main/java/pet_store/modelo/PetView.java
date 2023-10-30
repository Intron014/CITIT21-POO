package pet_store.modelo;

public class PetView {
    public String createPet(Pet pet){
        StringBuilder str = new StringBuilder();
        str.append("Se ha creado correctamente a").append(pet.getName());
        return str.toString();
    }
}
