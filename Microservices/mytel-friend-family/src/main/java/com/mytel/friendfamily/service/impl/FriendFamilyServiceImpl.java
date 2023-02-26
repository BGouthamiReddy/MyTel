package com.mytel.friendfamily.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytel.friendfamily.dto.FriendFamilyDTO;
import com.mytel.friendfamily.entity.FriendFamily;
import com.mytel.friendfamily.repository.FriendFamilyRepo;
import com.mytel.friendfamily.service.FriendFamilyService;


@Service
public class FriendFamilyServiceImpl implements FriendFamilyService {

	@Autowired
	FriendFamilyRepo friendRepo;
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public void saveFriend(Long phoneNo, FriendFamilyDTO friendDTO) {
		friendDTO.setPhoneNo(phoneNo);
		FriendFamily friend = this.modelMapper.map(friendDTO, FriendFamily.class);
		friendRepo.save(friend);
	}

	@Override
	public List<Long> getSpecificFriends(Long phoneNo) {
		List<Long> friendList= new ArrayList<Long>();
		List<FriendFamily> friends=friendRepo.getByPhoneNo(phoneNo);
		for (FriendFamily friendFamily : friends) {
			friendList.add(friendFamily.getFriendAndFamily());
		}
		return friendList;
	}

}
