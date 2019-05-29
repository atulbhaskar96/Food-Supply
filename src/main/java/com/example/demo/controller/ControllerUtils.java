package com.example.demo.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.example.demo.bean.AddressBean;
import com.example.demo.bean.CountryBean;
import com.example.demo.bean.User;
import com.example.demo.model.Address;
import com.example.demo.model.City;
import com.example.demo.model.Country;
import com.example.demo.model.State;
import com.example.demo.model.UserAdmin;

public interface ControllerUtils {
	
	static UserAdmin getUserModel(User user) {
		UserAdmin userAdmin = new UserAdmin();
		try {
			userAdmin.setActiveStatus(user.isActiveStatus());
			if (user.getAddress() == null || user.getAddress().isEmpty()) {
				throw new RuntimeException("invalid address");
			}
			List<Address> address = new LinkedList<Address>();
			for (AddressBean addressBean : user.getAddress()) {
				address.add(getAddressModel(addressBean));
			}
			userAdmin.setAddress(address);
			if (user.getCreationDate() == null) {
				user.setCreationDate(new Date());
			}
			userAdmin.setCreationDate(user.getCreationDate());
			userAdmin.setEmail(user.getEmail());
			userAdmin.setGender(user.getGender());
			userAdmin.setImage(user.getImage());
			userAdmin.setKitchenClose(user.isKitchenClose());
			userAdmin.setLevel(user.getLevel());
			userAdmin.setLoginStatus(user.isLoginStatus());
			userAdmin.setMobile(user.getMobile());
			userAdmin.setName(user.getName());
			userAdmin.setPassword(user.getPassword());
			userAdmin.setRating(user.getRating());
			userAdmin.setRole(user.getRole());
			userAdmin.setStopOrderRecieve(user.isStopOrderRecieve());
			if (user.getUpdationDate() == null) {
				user.setUpdationDate(new Date());
			}
			userAdmin.setUpdationDate(user.getUpdationDate());
			userAdmin.setVerified(user.isVerified());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return userAdmin;
	}

	static Address getAddressModel( AddressBean addressBean) {
		Address address = new Address();
		 address.setCity(getCityModel(addressBean)); 
		 address.setHouseNo(addressBean.getHouseNo()); 
		 address.setLandMark(addressBean.getLandMark());
		 address.setPinCode(addressBean.getPinCode());
		 address.setStreet(addressBean.getStreet());
		 return address; 
	}
	
	static City getCityModel(AddressBean addressBean) {
		City city = new City();
		city.setId(addressBean.getCity().getCityId());
		city.setName(addressBean.getCity().getName());
		city.setState(getStateModel(addressBean));
		return city;
	}
	
	static State getStateModel(AddressBean addressBean) {
		State state = new State();
		state.setId(addressBean.getState().getId());
		state.setName(addressBean.getState().getName());
		state.setCountry(getCountryModel(addressBean));
		return state;
	}
	
	static Country getCountryModel(AddressBean addressBean) {
		Country country = new Country();
		CountryBean countryBean = addressBean.getCountry();
		if(countryBean != null) {
			country.setId(countryBean.getId());
			country.setName(countryBean.getName());
		}
		return country;
	}
}
