/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jan
 */
class Tutor extends User{
    
    /**
     * 
     * @param theName name of user that we define
     * @param theId id of user that we user
     * @param theMail mail of user that we user
     * @param thePassword password of user that we user
     */
    public Tutor(String theName, String theId, String theMail, String thePass){
        super(theName, theId, theMail, thePass);
    }
    /**
     * Function that print information about user on screen
     */
    @Override
    public void UserProfil(){
        System.out.println("Mereba This function print tutor information");
    }
}
