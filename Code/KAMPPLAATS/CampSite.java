package KAMPPLAATS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import PERSOON.Address;
import PERSOON.LivingGroup;
import PERSOON.Member;

/**
 * Klasse die een kampplaats voorstelt.
 * Een kampplaats heeft een adres, capaciteit en een lijst van faciliteiten.
 * 
 * @author Laroub Rayane
 * @version 2.0 2025-05-18
 */
public class CampSite {
    private Address campAddress;
    private int capacity;
    private Set<String> facilities = new HashSet<>();//Is uniek dankzij hash
    private Map<Member, LivingGroup> memberGroups = new HashMap<>();

     /**
     * Constructor voor een kampplaats.
     * 
     * @param address  het adres van de kampplaats
     * @param capacity de maximale capaciteit van de kampplaats
     */
    public CampSite(Address campAddress, int capacity){
      
        this.campAddress = campAddress;
        this.capacity = capacity;
    }

     /**
     * Geeft het adres van de kampplaats.
     * 
     * @return het adres van de kampplaats
     */
    public Address getCampAddress() {
        return campAddress;
    }
    public void setCampAddress(Address campAddress) {
        this.campAddress = campAddress;
    }

     /**
     * Geeft de capaciteit van de kampplaats.
     * 
     * @return de capaciteit
     */
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        if(this.capacity < 0) {
        throw new IllegalArgumentException("Capacity can't be lower than 0!");
        }else this.capacity = capacity;
    }

    /**
     * Geeft een lijst van faciliteiten van de kampplaats.
     * 
     * @return lijst met faciliteiten
     */
    public Set<String> getFacilities() {
        return (Set<String>) facilities;
    }

     /**
     * Voegt een faciliteit toe aan de kampplaats.
     * 
     * @param facility de naam van de faciliteit
     */
    public void addFacility(String facility) {
        if(facility == null) {
            throw new IllegalArgumentException("You can't and this as a facility!");
        }else facilities.add(facility);
    }
    public void addMemberToLivingGroup(Member member, LivingGroup group) {
        if(member == null || group == null) {
            throw new IllegalArgumentException("You can't add this!");
        }else if(memberGroups.size() > capacity) {
            System.out.println("No more places left.");
            return;                                                                  //return om alles te stoppen wanneer men niets meer kan toevoegen.
        }else group.addMember(member);
              memberGroups.put(member, group);
    }
    public List<Member> getSortedMembersByLastName() {
        List<Member> sorted = new ArrayList<>(memberGroups.keySet());
        Collections.sort(sorted);
        return sorted;
    }
    
    /**
     * Geeft een tekstuele weergave van de kampplaats.
     * 
     * @return string met adres, capaciteit en faciliteiten
     */
    @Override
    public String toString() {
        return "Camp site address: " + campAddress + "\n" +
               "Capacity: " + capacity + "\n" +
               "Facilities: " + facilities;         
    }
}
   