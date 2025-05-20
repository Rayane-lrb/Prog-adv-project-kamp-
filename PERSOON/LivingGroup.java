package PERSOON;




import java.util.ArrayList;
import java.util.List;

public class LivingGroup {
    public enum ages {
        TEENS, FORTEEN_AND_UP, SIXTEEN_AND_UP
    }
    private ages ageGroup;
    private List<Leader> Leaders = new ArrayList<>();
    private List<Member> Members = new ArrayList<>();
    
    public LivingGroup(ages ageGroup) {
        if(this.ageGroup == null) {
            throw new IllegalArgumentException("Age group can't be empty");
        }else this.ageGroup = ageGroup;
    }

    public ages getAgeGroup() {
        return ageGroup;
    }
    public List<Leader> getLeaders() {
        return Leaders;
    }
    public void addLeader(Leader leader) {
        if(leader == null) {
            throw new IllegalArgumentException("Leader can't be null");
        }else Leaders.add(leader);
    }
    public void addMember(Member member) {
        if(member == null) {
            throw new IllegalArgumentException("Member can't be null!");
        }else Members.add(member);
    }

    public List<Member> getMembers() {
        return Members;
    }
    public int getNumberOfMembers() {
    return Members.size();
    }
    public boolean hasMember(Member member) {
       return Members.contains(member);
    }
    public String toString() {
        return "Living group: " + ageGroup + "\n" +
               "Leaders: " + Leaders + "\n" +
               "Members: " + Members;
    }
}    
