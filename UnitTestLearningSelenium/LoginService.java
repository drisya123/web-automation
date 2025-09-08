package testNGLearning;

import org.testng.annotations.Test;

//File: LoginService.java
public class LoginService {
	
	@Test
	    // Simple login check
	    public boolean login(String username, String password) {
	        if (username == null || password == null) {
	            return false; // invalid input
	        }
	        if (username.equals("admin") && password.equals("password123")) {
	            return true; // valid login
	        }
	        return false; // invalid credentials
	    }
	}

