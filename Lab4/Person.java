
/** Represents a person and their list of friends
 */
public class Person
{
    private String firstName;
    private String friendList;
    private int friendCount;
    
    /** Creates a person with a given name and no friends in their list.
     * @param name the first name of the person of interest
     */
    public Person(String name)
    {
    	  //-----------Start below here. To do: approximate lines of code = 3
    	  // initialize instance variable firstName to name, initialize friendList to "" and friendCount to 0
    	  firstName = name;
         friendList = "";
        friendCount = 0;
    	  
    	  
    	  //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    
    /** Retrieves the names of all of a person's friends.
     * @return a string containing all of the names of a person's friends
     */
    public String getFriendNames()
    {
        return friendList;
    }
    
    /** Adds a person to the list of friends of this person.
     * @param p the person whose name is to be added to the friend list
     */
    public void befriend(Person p)
    {
    	  //-----------Start below here. To do: approximate lines of code = 2
    	  // add (concatenate) the first name of Person p to the String friendList followed by a space " "
    	  // increment friendCount
    	   friendList = friendList + p.firstName + " ";
           friendCount +=1;
    	  
    	  //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    
    /** Removes a person from the list of friends of this person.
     * @param p the person whose name is to be removed from the friend list
     */
    public void unfriend(Person p)
    {
    	  //-----------Start below here. To do: approximate lines of code = 2
    	  // removes the first name of Person p from the friendList string. Decrement friendCount 
    	  // Hint: use the replace method of class String. Don't forget to remove the space following the first name (see befriend above)
    	  // e.g. if first name is "xxx" then remove "xxx "
          friendList = friendList.replaceAll(p.firstName,"");
    	  friendCount -=1;
    	  
    	  //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
    
    /** Returns the number of friends a person currently has.
     * @return a count of the number of friends the person has
     */
    public int getFriendCount()
    {
        return friendCount;
    }
    
}
