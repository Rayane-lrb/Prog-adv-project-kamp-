package PERSOON;




import java.util.ArrayList;
import java.util.List;

/**
 * Deze klasse stelt een leefgroep voor binnen een kamp,
 * met een specifieke leeftijdscategorie, leiders en leden.
 * 
 * De leeftijdsgroep wordt weergegeven met een enum.
 * 
 * @author Laroub Rayane
 * @version 1.0
 */
public class LivingGroup {
   
     /**
     * Enum voor leeftijdsgroepen binnen de leefgroep.
     */
    public enum ages {
        TEENS, FORTEEN_AND_UP, SIXTEEN_AND_UP
    }
    private ages ageGroup;
    private List<Leader> Leaders = new ArrayList<>();
    private List<Member> Members = new ArrayList<>();
    
    /**
     * Maakt een nieuwe leefgroep aan met een gegeven leeftijdscategorie.
     * 
     * @param ageGroup de leeftijdsgroep, mag niet null zijn
     * @throws IllegalArgumentException als ageGroup null is
     */
    public LivingGroup(ages ageGroup) {
        if(this.ageGroup == null) {
            throw new IllegalArgumentException("Age group can't be empty");
        }else this.ageGroup = ageGroup;
    }
    
    /**
     * Geeft de leeftijdsgroep van de leefgroep terug.
     * 
     * @return de leeftijdsgroep
     */
    public ages getAgeGroup() {
        return ageGroup;
    }

      /**
     * Geeft de lijst met leiders in deze leefgroep.
     * 
     * @return lijst van leiders
     */
    public List<Leader> getLeaders() {
        return Leaders;
    }

      /**
     * Voegt een leider toe aan deze leefgroep.
     * 
     * @param leader de leider die toegevoegd moet worden, mag niet null zijn
     * @throws IllegalArgumentException als leader null is
     */
    public void addLeader(Leader leader) {
        if(leader == null) {
            throw new IllegalArgumentException("Leader can't be null");
        }else Leaders.add(leader);
    }

    /**
     * Voegt een lid toe aan deze leefgroep.
     * 
     * @param member het lid dat toegevoegd moet worden, mag niet null zijn
     * @throws IllegalArgumentException als member null is
     */
    public void addMember(Member member) {
        if(member == null) {
            throw new IllegalArgumentException("Member can't be null!");
        }else Members.add(member);
    }

      /**
     * Geeft de lijst met leden in deze leefgroep.
     * 
     * @return lijst van leden
     */
    public List<Member> getMembers() {
        return Members;
    }

      /**
     * Geeft het aantal leden in deze leefgroep.
     * 
     * @return het aantal leden
     */
    public int getNumberOfMembers() {
    return Members.size();
    }
    public boolean hasMember(Member member) {
       return Members.contains(member);
    }

    
    /**
     * Controleert of een bepaald lid onderdeel is van deze leefgroep.
     * 
     * @param member het lid om te controleren
     * @return true als het lid in de leefgroep zit, anders false
     */
    public String toString() {
        return "Living group: " + ageGroup + "\n" +
               "Leaders: " + Leaders + "\n" +
               "Members: " + Members;
    }
}    
