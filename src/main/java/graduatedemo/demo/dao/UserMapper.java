package graduatedemo.demo.dao;

import graduatedemo.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

  User selByid(int id);

}
