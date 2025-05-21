package KAMP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import KAMPPLAATS.CampSite;
import PERSOON.Member;
import PERSOON.Staff;

public class Camp {
    
    private String title;
    private CampSite campSite;
    private LocalDate from;
    private LocalDate to;
    private List<Member> campMembersList = new ArrayList<>();
    private List<Staff> staffsList = new ArrayList<>();

    public Camp(String title, CampSite campSite, LocalDate from, LocalDate to) {
        this.title = title;
        this.campSite = campSite;
        this.from = from;
        this.to = to;
    }
    public String getTitle() {
        return title;
    }
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
    public void addMember(Member member) {
        if(member instanceof Member) {
            campMembersList.add(member);
        }else throw new IllegalArgumentException("You xan't add this as a member!");
    }
    public void addStaff(Staff staff) {
        if(staff instanceof Staff) {
            staffsList.add(staff);
        }else throw new IllegalArgumentException("You can't add this as a staff!");
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
    public String toString() {
        return "Title: " + title + "\n" +
               "Camp site: " + campSite + "\n"+
               "Start: " + from + "\n" +
               "End: " + to;
    }
    
}
