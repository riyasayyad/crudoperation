package com.example.demo.repsitory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	import com.example.demo.entity.Employee;

	@Repository
	public interface Repository1 extends JpaRepository<Employee,Long> {

	}

