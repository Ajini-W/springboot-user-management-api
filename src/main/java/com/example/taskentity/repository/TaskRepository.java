package com.example.taskentity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.taskentity.entity.TaskEntity;
public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
	TaskEntity findByUsernameAndPassword(String username, String password);
}
