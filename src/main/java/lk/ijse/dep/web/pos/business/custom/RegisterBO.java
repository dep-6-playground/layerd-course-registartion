package lk.ijse.dep.web.pos.business.custom;

import lk.ijse.dep.web.pos.business.SuperBO;
import lk.ijse.dep.web.pos.dto.CourseDTO;
import lk.ijse.dep.web.pos.dto.RegisterDTO;

import java.util.List;

/**
 * @author : Deshan Charuka <d.c.0729439631@gmail.com>
 * @since : 2021-02-02
 **/
public interface RegisterBO extends SuperBO {
    public void saveRegister(RegisterDTO registerDTO) throws Exception;
    public void updateRegister(RegisterDTO registerDTO) throws Exception;
    public void deleteRegister(String registerID) throws Exception;
    public List<RegisterDTO> findAllRegisters() throws Exception;
}
