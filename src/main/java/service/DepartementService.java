package service;

import java.util.List;

import modele.Departement;

public interface DepartementService {


    List<Departement> findAllDepartements();
    void saveDepartement(Departement departement);
    void updateDepartement(Departement departement, String newDeptNum, String newDeptName);
    void deleteDepartement(Long id);
	Departement findDepartementByNum(Long id);
}
