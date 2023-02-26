package com.mytel.friendfamily.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "friendfamily")
@Getter
@Setter
public class FriendFamily {

	@Id
	@GeneratedValue
	int id;

	@Column(name = "phone_no")
	long phoneNo;

	@Column(name = "friend_and_family")
	long friendAndFamily;
}