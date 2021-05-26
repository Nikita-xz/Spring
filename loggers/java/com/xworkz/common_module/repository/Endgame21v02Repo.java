package com.xworkz.common_module.repository;

import com.xworkz.common_module.entity.Endgame21v02Entity;

public interface Endgame21v02Repo {
	public Integer save(Endgame21v02Entity entity);

	public Endgame21v02Entity getByEmailId(String emailId);

}
