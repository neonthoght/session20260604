package my.sandbox.session20260604.repositories;

import my.sandbox.session20260604.entity.MySession;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.session.SessionRepository;
import org.springframework.session.jdbc.JdbcIndexedSessionRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.session.Session;

@Repository
public class MySessionRepository {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();

// ... configure jdbcTemplate ...

TransactionTemplate transactionTemplate = new TransactionTemplate();

// ... configure transactionTemplate ...

JdbcIndexedSessionRepository repository = new JdbcIndexedSessionRepository(jdbcTemplate,
		transactionTemplate);


}
