/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aziz OKAY
 */
class Administrator extends User{
    
    /**
     * 
     * @param theName name of user that we define
     * @param theId id of user that we user
     * @param theMail mail of user that we user
     * @param thePassword password of user that we user
     */
    public Administrator(String theName, String theId, String theMail, String thePass){
        super(theName, theId, theMail, thePass);
    }
    
    
    @Override
    /**
     * Function that print information about user on screen
     */
    public void UserProfil(){
        System.out.println("Mereba ");
    }
    
    public void add(User theUser){
        getUserList().add(theUser);
    }
    
    /**
     * 
     * @param theUser that will remove if exist
     * @return true if user exist false otherwise
     */
    public boolean remove(User theUser){
        boolean result = false;
        try{
            for(int i = 0; i < getUserList().size(); i++){
                if(theUser.getId() == getUserList().get(i)){
                    getUserList().remove(i);
                    result = true;
                } 
                if(result != true)
                    throw new UserException();
            }
        }
        catch(UserException e){
            System.out.println(e.noSuchUser());
        }
        return result;
    }
}
