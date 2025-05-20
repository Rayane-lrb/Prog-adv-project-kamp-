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
    private List<Member> membersList = new ArrayList<>();
    private List<Staff> staffsList = new ArrayList<>();

    public Camp(String title, CampSite campSite, LocalDate from, LocalDate to) {
        this.title = title;
        this.campSite = campSite;
        this.from = from;
        this.to = to;
    }
    public String gettitle() {
        return title;
    }
    public void settitle(String title) {
        this.title = title;
    }
    public CampSite getcampSite() {
        return campSite;
    }
    public void setcampSite(CampSite campSite) {
        this.campSite = campSite;
    }
    public LocalDate getfrom() {
        return from;
    }
    public void setfrom(LocalDate from) {
        this.from = from;
    }
    public LocalDate getto() {
        return to;
    }
    public void setto(LocalDate to) {
        this.to = to;
    }
    public void addMember(Member member) {
        if(member instanceof Member) {
            membersList.add(member);
        }else throw new IllegalArgumentException("You xan't add this as a member!");
    }
    public void addStaffs(Staff staff) {
        if(staff instanceof Staff) {
            staffsList.add(staff);
        }else throw new IllegalArgumentException("You can't add this as a staff!");
    }
    public List<Member> getmembersList() {
        return membersList;
    }
    public List<Staff> staffsList() {
        return staffsList;
    }
    public int getnumberOfMembers() {
        return membersList.size();
    }
    public int getnumberOfStaffs() {
        return staffsList.size();
    }
    public String toString() {
        return "Title: " + title + "\n" +
               "Camp site: " + campSite + "\n"+
               "Start: " + from + "\n" +
               "End: " + to;
    }
    
}
