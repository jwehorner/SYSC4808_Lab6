package application;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BuddyInfoRepository extends JpaRepository<BuddyInfo, Long> {

    List<BuddyInfo> findByName(String name);

    List<BuddyInfo> findByAge(int age);

    BuddyInfo findById(long id);

}