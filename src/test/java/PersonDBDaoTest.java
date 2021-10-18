import org.junit.jupiter.api.Test;

public class PersonDBDaoTest {

    @Test
    void shouldRetrieveSavedPersonFromDatabase(){
        PersonDao dao = new PersonDao(createDataSource());

        Person person = examplePerson();
        dao.save(person);

        assertThat(dao.retrieve(person.getId()))
    }
}
