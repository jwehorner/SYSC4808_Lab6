package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BuddyInfoController {
    @Autowired
    private final BuddyInfoRepository repository;

    BuddyInfoController(BuddyInfoRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/buddyinfo")
    public BuddyInfo newBuddy(BuddyInfo newBuddy){
        return repository.save(newBuddy);
    }
}
