package com.mytel.friendfamily.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytel.friendfamily.entity.FriendFamily;

public interface FriendFamilyRepo extends JpaRepository<FriendFamily, Integer> {

	List<FriendFamily> getByPhoneNo(Long phoneNo);

}
