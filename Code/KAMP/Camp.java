package KAMP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import KAMPPLAATS.CampSite;
import PERSOON.LivingGroup;
import PERSOON.Member;
import PERSOON.Staff;

/**
 * Klasse die een kamp sessie voorstelt.
 * Een kamp heeft een titel, start- en einddatum, een kampplaats, en lijsten met leden en personeel.
 * 
 * @author Laroub Rayane
 * @version 2.0 2025-05-19
 */
public class Camp {
    
    private String title;
    private CampSite campSite;
    private LocalDate from;
    private LocalDate to;
    private List<Member> campMembersList = new ArrayList<>();
    private List<Staff> staffsList = new ArrayList<>();
    private List<LivingGroup> livingGroups = new ArrayList<>();

    /**
     * Constructor voor een kamp.
     * 
     * @param title     de titel van het kamp
     * @param campSite  de kampplaats waar het kamp wordt gehouden
     * @param startDate de startdatum van het kamp
     * @param endDate   de einddatum van het kamp
     */
    public Camp(String title, CampSite campSite, LocalDate from, LocalDate to) {
        this.title = title;
        this.campSite = campSite;
        this.from = from;
        this.to = to;
    }

    /**
     * Geeft de titel van het kamp.
     * 
     * @return de titel
     */
    public String getTitle() {
        return title;
    }

    /**
     * Zet de titel van het kamp.
     * 
     * @param title de nieuwe titel van het kamp
     */
    public void setTitle(String title) {
        this.title = title;
    }
    public CampSite getCampSite() {
        return campSite;
    }
    public void setCampSite(CampSite campSite) {
        this.campSite = campSite;
    }
    public LocalDate getFrom() {
        return from;
    }
    public void setFrom(LocalDate from) {
        this.from = from;
    }
    public LocalDate getTo() {
        return to;
    }
    public void setTo(LocalDate to) {
        this.to = to;
    }

     /**
     * Voegt een lid toe aan het kamp.
     * 
     * @param member het lid dat toegevoegd wordt
     */
    public void addMember(Member member) {
        if (member == null) {
    throw new IllegalArgumentException("Member can't be null!");
           }
            campMembersList.add(member);
    }

    /**
     * Voegt een personeelslid toe aan het kamp.
     * 
     * @param staffMember het personeelslid dat toegevoegd wordt
     */
    public void addStaff(Staff staff) {
        if(staff instanceof Staff) {
            staffsList.add(staff);
        }else throw new IllegalArgumentException("You can't add this as a staff!");
    }

    public void addMemberToGroup(Member member, LivingGroup.ages ageGroup) {
        if (!campMembersList.contains(member)) {
        campMembersList.add(member);
         }
         LivingGroup group = findGroupByAge(ageGroup);
            if (group == null) {
        group = new LivingGroup(ageGroup);
        livingGroups.add(group);
         }
         group.addMember(member);
        }
         private LivingGroup findGroupByAge(LivingGroup.ages ageGroup) {
    for (LivingGroup group : livingGroups) {
        if (group.getAgeGroup() == ageGroup) {
            return group;
        }
    }
    return null;
}

    public List<Member> getCampMembersList() {
        return campMembersList;
    }
    public List<Staff> getStaffsList() {
        return staffsList;
    }
    public int getNumberOfMembers() {
        return campMembersList.size();
    }
    public int getNumberOfStaffs() {
        return staffsList.size();
    }

    /**
     * Geeft een tekstuele weergave van het kamp.
     * 
     * @return string met titel, data en kampplaats
     */
    public String toString() {
        return "Title: " + title + "\n" +
               "Camp site: " + campSite + "\n"+
               "Start: " + from + "\n" +
               "End: " + to;
    }
    
}
