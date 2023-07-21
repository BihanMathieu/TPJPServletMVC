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
	public void deleteDepartement(String departement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDepartement(Long num, String newDeptNum, String newDeptName) {
		// TODO Auto-generated method stub
		
	}

//    @Override
//    public void updateDepartement(Long num, String newDeptNum, String newDeptName) {
//        Departement existingDepartement = departementDAO.findDepartementByNum(num);
//        if (existingDepartement != null) {
//
//            
//            if (!num.equals(newDeptNum)) {
//                Departement deptWithNewNum = departementDAO.findDepartementByNum(newDeptNum);
//                if (deptWithNewNum != null) {
//                    throw new IllegalArgumentException("Un département avec le numéro " + newDeptNum + " existe déjà.");
//                }
//            }
//
//            
//            existingDepartement.setDeptNum(newDeptNum);
//            existingDepartement.setDeptName(newDeptName);
//
//            departementDAO.updateDepartement(existingDepartement);
//        } else {
//            throw new IllegalArgumentException("Le département avec le numéro " + num + " n'existe pas.");
//        }
//    }

//    @Override
//    public void deleteDepartement(String deptNum) {
//        Departement existingDepartement = departementDAO.findDepartementByNum(deptNum);
//        if (existingDepartement != null) {
//            departementDAO.deleteDepartement(existingDepartement);
//        } else {
//
//            throw new IllegalArgumentException("Le département avec le numéro " + deptNum + " n'existe pas.");
//        }
//    }
}