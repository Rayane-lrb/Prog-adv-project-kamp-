package PERSOON;



import java.time.LocalDate;

public class Member extends Person implements Comparable<Member> {

    public int size;

    public Member(String firstName, String lastName, LocalDate DoB, Address address){
        super(firstName, lastName, DoB, address);
}
@Override
    public int compareTo(Member member) {
        return this.getLastName().compareTo(member.getLastName());
    }
@Override
public String toString() {
    return "(Member)\n" + super.toString();
  }
}
