package com.mytel.friendfamily.service;

import java.util.List;

import com.mytel.friendfamily.dto.FriendFamilyDTO;

public interface FriendFamilyService {
	public void saveFriend(Long phoneNo, FriendFamilyDTO friendDTO);
	public List<Long> getSpecificFriends(Long phoneNo);

}
