package com.draiv.gugledraiv.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.draiv.gugledraiv.entities.*;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
    // Buscar archivos desde una carpeta específica;
     @Query("SELECT f FROM File f WHERE f.folder = :folder")
    List<File> findByFolder(@Param("folder") Folder folder);
}
