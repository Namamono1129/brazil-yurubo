package teambrazil.yurubo.config;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.GreedyCacheSqlFileRepository;
import org.seasar.doma.jdbc.NoCacheSqlFileRepository;
import org.seasar.doma.jdbc.SqlFileRepository;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

import javax.sql.DataSource;

@Component
public class DomaConfig implements Config {
    private DataSource dataSource;
    private Dialect dialect;
    private SqlFileRepository sqlFileRepository;

    public DomaConfig() {
    }

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = new TransactionAwareDataSourceProxy(dataSource);
    }

    @Autowired
    public void setDialect(Dialect dialect) {
        this.dialect = dialect;
    }

    @Autowired
    public void setSqlFileRepository(@Value("${spring.profiles.active}") String springProfilesActive) {
        // develop モードの時は SQL ファイルがキャッシュされないようにする
        if (StringUtils.equals(springProfilesActive, "development")) {
            this.sqlFileRepository = new NoCacheSqlFileRepository();
        } else {
            this.sqlFileRepository = new GreedyCacheSqlFileRepository();
        }
    }

    @Override
    public DataSource getDataSource() {
        return this.dataSource;
    }

    @Override
    public Dialect getDialect() {
        return this.dialect;
    }

    @Override
    public SqlFileRepository getSqlFileRepository() {
        return this.sqlFileRepository;
    }

}
