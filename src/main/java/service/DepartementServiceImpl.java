package service;

import java.util.List;
import dao.DepartementDAO;
import modele.Departement;

public class DepartementServiceImpl implements DepartementService {

    private DepartementDAO departementDAO;

    public DepartementServiceImpl(DepartementDAO departementDAO) {
        this.departementDAO = departementDAO;
    }

    @Override
    public Departement findDepartementByNum(Long id) {


        return departementDAO.findDepartementByNum(id);
    }

    @Override
    public List<Departement> findAllDepartements() {
        return departementDAO.findAllDepartements();
    }

    @Override
    public void saveDepartement(Departement departement) {
        departementDAO.saveDepartement(departement);
    }

    @Override
    public void updateDepartement(Departement departement, String newDeptNum, String newDeptName) {
       departement.setDeptName(newDeptName);
       departement.setDeptNum(newDeptNum);
       departementDAO.updateDepartement(departement);
    }




    @Override
    public void deleteDepartement(Long id) {


    	
            departementDAO.deleteDepartement(id);


            
    }
}