import org.joda.time.LocalDate;

public class Test {
    @org.junit.jupiter.api.Test
    public void Test() {
        Student s1 = new Student("Jimmy",235566, LocalDate.parse("2000-11-2"));
        assert(s1.getUName().equals("Jimmy21"));
    }
}
