package com.test33.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test33.Entity.User;
import com.test33.Repository.UserRepository;
import com.test33.payload.UserDto;

@Service
public class MyUserDetailService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public String getDto() throws JsonProcessingException{
		ObjectMapper objMapper=new ObjectMapper();
		ArrayList<UserDto> list=new ArrayList<>();
		UserDto s1=new UserDto(1, "Amulya", "cse");
		UserDto s2=new UserDto(2, "Avar", "cse");
		list.add(s1);
		list.add(s2);
		String jsonData=objMapper.writeValueAsString(list);
//		StudentDto value= objMapper.readValue( json, StudentDto.class);
//		StudentDto save= studentRepo.save(dtoToEntity(value));
		System.out.println(jsonData);		
		return jsonData;
	}
	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user=userRepo.findByUsername(username);
//		if(user==null) throw new UsernameNotFoundException("this user was not found.");
//		
//		
//		return new UserPrincipalDao(user);
//	}
	
	public UserDto userToDto(User user) {
//		User found=userRepo.findById(user.getId()).get();
//		3rd way :
		UserDto dto=this.modelMapper.map(user, UserDto.class);
////	1st way:
//		dto.setId(user.getId());
//		dto.setUsername(user.getUsername());
//		dto.setPassword(user.getPassword());
		
////	2nd way :
//		BeanUtils.copyProperties(dto, user, getClass());
		
		return dto;
	}
	
	public User dtoToUser(UserDto dto) {
//		User found=userRepo.findById(dto.getId()).get();
		User user=this.modelMapper.map(dto, User.class);
//		BeanUtils.copyProperties(dto, user, getClass());
		return user;
	}
	
	public List<UserDto> userToDtoList(List<User> users){
		List<UserDto> dtoList= users.stream().map( i-> userToDto(i) ).collect(Collectors.toList());
		return dtoList;
	}
	
	public List<User> dtoToUserList(List<UserDto> dtoList){
		List<User> userList=dtoList.stream().map( i-> dtoToUser(i)).collect(Collectors.toList());
		return userList;
	}
	
//	API
	
	public UserDto getUserById(Integer id) {
		User user=userRepo.findById(id).get();
//		if(user==null) {    throw new UserNotFoundException("no such user exists with this id ******");		}
		return userToDto(user);
	}
	
	public UserDto addUser(UserDto userDto) {
//		if(userDto==null) { throw new BadBodyFoundException("yrr galat request body kyu daal rha hai ****** "); }
		User user=new User();
		BeanUtils.copyProperties(userDto, user, getClass());
		User savedUser= userRepo.save(user);
		return userToDto(savedUser);
	}
}
