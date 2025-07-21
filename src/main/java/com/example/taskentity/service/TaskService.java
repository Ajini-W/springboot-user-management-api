package com.example.taskentity.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.taskentity.repository.TaskRepository;
import com.example.taskentity.entity.TaskEntity;
@Service
public class TaskService {
	@Autowired
	private TaskRepository repo;
	public TaskEntity saveUser(TaskEntity user) {
        return repo.save(user);
    }

    public TaskEntity login(String username, String password) {
        return repo.findByUsernameAndPassword(username, password);
    }

    public List<TaskEntity> getAllUsers() {
        return repo.findAll();
    }

    public void deleteUser(Long id) {
        repo.deleteById(id);
    }

    public TaskEntity updateUser(Long id, TaskEntity updatedUser) {
        TaskEntity existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setUsername(updatedUser.getUsername());
            existing.setPassword(updatedUser.getPassword());
            existing.setEmail(updatedUser.getEmail());
            return repo.save(existing);
        }
        return null;
    }

}
