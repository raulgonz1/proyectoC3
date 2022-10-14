package computer.computer.repositorio;

import computer.computer.modelo.Computer;
import computer.computer.modelo.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {


}
