import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Variable que guarda los miembros que hay en el equipo
    private ArrayList<Membership> miembros;
    // Variable que cuenta el numero de miembros que hay en el equipo
    private int numeroDeMiembros;

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        miembros = new ArrayList<Membership>();
        int numeroDeMiembros = 0;
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        miembros.add(member);
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

    /** 
     * Calcula el numero de socios que se dieron de alta en un mes determinado. 
     * El año no nos importa. En caso de que el parametro contenga un valor 
     * no valido se muestra por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     */
    public int joinedMonth(int mes){
        int contador = 0;
        if (mes < 1 || mes > 12){
            return -1;
        }
        else{
            for (Membership member : miembros){
                if(member.getMonth() == mes){
                    contador++;     
                } 
            }
        }
        return contador;
    }

    /** 
     * Todos los socios que se han dado de alta un determinado mes de un determinado año se
     * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
     * por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @param year El año en el que estamos interesados
     * @return Una coleccion con los socios que se han dado de baja del club
     */
    public ArrayList<Membership> purge(int mes, int año){
        Iterator<Membership> memb = miembros.iterator();
        ArrayList<Membership> miembrosEliminados = new ArrayList<>();
        while (memb.hasNext()){
            Membership miembro = memb.next();
            if (miembro.getMonth() == mes && miembro.getYear()== año){
                miembrosEliminados.add(miembro);
                memb.remove();
                numeroDeMiembros--;
            }  
            
        }
        return miembrosEliminados;
    }
}
