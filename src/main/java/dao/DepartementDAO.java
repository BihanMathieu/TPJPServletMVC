package dao;


import java.util.List;

import modele.Departement;

public interface DepartementDAO {

    Departement findDepartementByNum(Long id);
    List<Departement> findAllDepartements();
    void saveDepartement(Departement departement);
    void updateDepartement(Departement departement);
    void deleteDepartement(Long id);
}
