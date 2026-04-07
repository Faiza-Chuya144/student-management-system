package seu.edu.bd.studentmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import seu.edu.bd.studentmanagement.model.Advising;

@Repository
public interface AdvisingRepository extends MongoRepository<Advising, String > {
}
