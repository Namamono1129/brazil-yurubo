package teambrazil.yurubo.test.repository;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.seasar.doma.jdbc.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import teambrazil.yurubo.entity.Brazilian;
import teambrazil.yurubo.repository.BrazilianRepository;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(scripts = "classpath:schema-test.sql")
@Sql(scripts = "classpath:brazilian-repository-test.sql")
public class BrazilianRepositoryTest {

    @Autowired
    BrazilianRepository brazilianRepository;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * ぽりさんがいる
     */
    @Test
    public void canFindPori() {
        Brazilian pori = brazilianRepository.findBrazilianByLoginUsername("pori");
        assertThat(pori.getId(), is(1));
        assertThat(pori.getLoginUsername(), is("pori"));
        assertThat(pori.getName(), is("ぽり"));
        assertThat(pori.getPasswordHash(), is("$2a$08$urnSw5ow48PWO9xJ/KBDmO23yRFF6zhWuFqJfmQdkBLUlmJsGk3hW"));
    }

    /**
     * 名取はいない
     */
    @Test
    public void cannotFindNatori() {
        thrown.expect(NoResultException.class);
        Brazilian natori = brazilianRepository.findBrazilianByLoginUsername("natori_sana");
    }
}
