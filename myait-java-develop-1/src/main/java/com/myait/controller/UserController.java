package com.myait.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myait.model.User;
import com.myait.service.UserService;
import com.myait.view.UserView;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/* to get all records of Employee (Right method) */
	@GetMapping(value = "/getEmployees")
	public ResponseEntity<List<UserView>> getAll() {
		List<UserView> list = userService.showAll();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}

	/* to get record by AIT_id including all Parameters (Right method) */
	@GetMapping("/getEmployeeById/{id}")
	public ResponseEntity<User> getUserByaitId(@PathVariable String id) {
			User user = userService.findByAitid(id);
			return new ResponseEntity<User>(user, HttpStatus.OK);
	}



	@GetMapping("getEmployeeById/")
	public String ok() {
		return "please enter valid data";
	}

}