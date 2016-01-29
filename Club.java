import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Variable que guarda los miembros que hay en el equipo
    private ArrayList<Membership> miembro;
    // Variable que cuenta el numero de miembros que hay en el equipo
    private int numeroDeMiembros;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        miembro = new ArrayList<Membership>();
        int numeroDeMiembros = 0;
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        miembro.add(new Membership(member.getName(), member.getMonth(),member.getYear()));
        numeroDeMiembros++;
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return numeroDeMiembros;
    }
}
