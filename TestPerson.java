public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Hayder");
        person.setFirstName("Labidi");
        person.setDateNaiss(1, 1, 2022);

        System.out.println("nom : " + person.Name);
        System.out.println("Prenom : " + person.firstName);
        System.out.println("Date de naissance : " + person.dayNaiss + "/" + person.monthNaiss + "/" + person.yearNaiss);
        System.out.println("Age en 2023 : " + person.ageEn2023() + " ans");
    }
}