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

public class CampSite {
    private Address campAddress;
    private int capacity;
    private Set<String> facilities = new HashSet<>();//Is uniek dankzij hash
    private Map<Member, LivingGroup> memberGroups = new HashMap<>();

    public CampSite(Address campAddress, int capacity){
      
        this.campAddress = campAddress;
        this.capacity = capacity;
    }

    public Address getCampAddress() {
        return campAddress;
    }
    public void setCampAddress(Address campAddress) {
        this.campAddress = campAddress;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        if(this.capacity < 0) {
        throw new IllegalArgumentException("Capacity can't be lower than 0!");
        }else this.capacity = capacity;
    }
    public Set<String> getFacilities() {
        return (Set<String>) facilities;
    }
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
    @Override
    public String toString() {
        return "Camp address: " + campAddress + "\n" +
               "Capacity: " + capacity + "\n" +
               "Facilities: " + facilities;         
    }
}
   