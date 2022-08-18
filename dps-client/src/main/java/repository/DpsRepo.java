package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DpsRepo extends JpaRepository<DPS, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM theft_info t WHERE t.car_numb=:carNumb AND t.brend=:brend AND t.model=:model")
    List<T> getTheftInfo(String carNumb, String brend, String model);

}
