package service;

import java.util.List;

import modele.Departement;

public interface DepartementService {


    List<Departement> findAllDepartements();
    void saveDepartement(Departement departement);
    void updateDepartement(Long num, String newDeptNum, String newDeptName);
    void deleteDepartement(String departement);
	Departement findDepartementByNum(Long id);
}
