package com.imooc.girl.dao;

import com.imooc.girl.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, Integer>{

}
