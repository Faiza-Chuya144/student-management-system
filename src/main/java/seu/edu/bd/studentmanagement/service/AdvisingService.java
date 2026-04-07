package seu.edu.bd.studentmanagement.service;

import org.springframework.stereotype.Service;
import seu.edu.bd.studentmanagement.model.Advising;
import seu.edu.bd.studentmanagement.repository.AdvisingRepository;

@Service
public class AdvisingService {
    private final AdvisingRepository advisingRepository;
    private Advising[] all;

    public AdvisingService(AdvisingRepository advisingRepository){
        this.advisingRepository = advisingRepository;
    }

    public Advising save(Advising advising){
        return advisingRepository.save(advising);
    }


    public Advising[] getAll() {
        return all;
    }
}
