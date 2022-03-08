package ma.octo.aop.repository.impl;

import ma.octo.aop.entity.Language;
import ma.octo.aop.repository.LanguageRepository;
import ma.octo.aop.util.LanguageRowMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Component
@Primary

public class LanguageJdbTemplateRepository implements LanguageRepository {

    private DataSource dataSource;

    private JdbcTemplate jdbctemplate;

    public LanguageJdbTemplateRepository(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbctemplate =new JdbcTemplate(this.dataSource);
    }

    @Override
    public Optional<Language> findByExtension(String extension) {
        var query = "SELECT * FROM LANGUAGE WHERE FILE_EXTENSION='"+ extension+ "'";
        Language language = jdbctemplate.queryForObject(query, new LanguageRowMapper());
        return Optional.ofNullable(language);
    }

    @Override
    public Optional<Language> findById(String id) {
        var query = "SELECT * FROM LANGUAGE WHERE ID ='"+ id + "'";
        Language language = jdbctemplate.queryForObject(query, new LanguageRowMapper());
        return Optional.ofNullable(language);
    }

    @Override
    public List<Language> findAll() {
        var query = "SELECT * FROM language  ";
        List<Language> languages = jdbctemplate.query(query, new LanguageRowMapper());
        return languages;
    }
}
