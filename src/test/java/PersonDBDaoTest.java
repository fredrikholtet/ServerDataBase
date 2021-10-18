import org.junit.jupiter.api.Test;

import javax.sql.DataSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PersonDBDaoTest {

    @Test
    void shouldRetrieveSavedPersonFromDatabase(){
        PersonDao dao = new PersonDao(createDataSource());

        Person person = examplePerson();
        dao.save(person);
        assertThat(dao.retrieve(person.getId()))
                .usingRecursiveComparison()
                .isEqualTo(person)
        ;
    }

    private Person examplePerson() {
        return new Person();
    }

    private DataSource createDataSource() {
        return null;
    }
}
