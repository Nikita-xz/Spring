package com.xworkz.common_module.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.common_module.dto.RegistrationDTO;
import com.xworkz.common_module.entity.Endgame21v02Entity;
import com.xworkz.common_module.repository.Endgame21v02Repo;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	
	private Logger logger;

	@Autowired
	private Endgame21v02Repo repo;

	public RegistrationServiceImpl() {
		logger = Logger.getLogger(getClass());
		logger.info("invoked"+this.getClass().getSimpleName());
	}

	@Override
	public String validateAndSave(RegistrationDTO dto) {
		logger.info("inside {} ");
		Endgame21v02Entity entity = new Endgame21v02Entity();
		try {
			
			Endgame21v02Entity edEntity = repo.getByEmailId(dto.getEmailId());
			if (edEntity == null) {
				logger.info("Checking whether the Endgame21v02Entity is null ");
				BeanUtils.copyProperties(dto, entity);
				logger.info("Properties copied to dto ");
				entity.setRegisteredBy("Nikita");
                
				LocalDateTime ldate = LocalDateTime.now();
				logger.info("Settinf time and date ");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
				logger.info("Formatting time and date ");
				String date = formatter.format(ldate);
				logger.info("Setting registered date and time ");
				entity.setRegisteredDate(date);
				logger.info("Created save in validateAndSave");
				int affectedRows=repo.save(entity);
				if (affectedRows > 0 ) {
					logger.info("successfully registered");
					return "successfully registered";
				}else {
					logger.info("Registration failed");
					return "Registration failed";
				}
				
			}
			else {
				logger.info("user already exist");
				return "user already exist";
			}
		} catch (Exception e) {
			logger.error("you have an Exception in {} "+ e.getMessage(),e);
		}
		return "";
	}

}
