package PetWalkerManager.model;

public class Session {
    protected User currentuser;
    public boolean isLogged(){
        return currentuser != null;
    }
}
