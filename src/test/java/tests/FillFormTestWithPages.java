import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import tests.TestBase;


public class FillFormTestWithPages extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void successfulFillFormTest() {

        registrationPage.openPage()
                .removeBan()
                .setFirstName("Alexander")
                .setLastName("Volodin")
                .setEmail("lex@test.ru")
                .setGender("Male")
                .setUserNumber("7123456789")
                .setDateOfBirth("14", "11", "1989")
                .setSubjects("Chemistry")
                .setHobbies("Sports")
                .setImage("image.jpg")
                .setAdress("Lenina Street, 1a")
                .setState("Rajasthan")
                .setCity("Jaiselmer")

                .submit()

                .checkTable("Student Name Alexander Volodin")
                .checkTable("Student Email lex@test.ru")
                .checkTable("Gender Male")
                .checkTable("Mobile 7123456789")
                .checkTable("Date of Birth 14 December,1989")
                .checkTable("Subjects Chemistry")
                .checkTable("Hobbies 	Sports")
                .checkTable("Picture image.jpg")
                .checkTable("Address Lenina Street, 1a")
                .checkTable("State and City Rajasthan Jaiselmer");

    }
}