package com.FinfirmProject.FinfirmProject;

import org.springframework.stereotype.Service;
import org.slf4j.Logger; import org.slf4j.LoggerFactory;
@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    public void createUser(String username) { logger.info("Creating user: {}", username);
        // Your user creation logic here
        logger.debug("User {} created successfully", username);
    }
    public void deleteUser(String username) { try { logger.info("Deleting user: {}", username);
        // Your user deletion logic here
        logger.debug("User {} deleted successfully", username);
    } catch (Exception e) {
        logger.error("Error occurred while deleting user: {}", username, e);
    }
    }
}
