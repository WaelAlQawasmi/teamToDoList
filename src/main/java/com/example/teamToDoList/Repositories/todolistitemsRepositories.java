package com.example.teamToDoList.Repositories;


import com.example.teamToDoList.models.todolistitems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface todolistitemsRepositories extends JpaRepository<todolistitems,Long> {

}
