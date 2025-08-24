package com.exam.examserver.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	
				@Id
				@GeneratedValue(strategy=GenerationType.AUTO)
				private Long id;
				private String username;
				private String password;
				private String firstName;
				private String lastname;
				
				private String email;
				private String phone;
				private String profile;
				
				public String getProfile() {
					return profile;
				}

				public void setProfile(String profile) {
					this.profile = profile;
				}

				private boolean enabled=true;

				public Long getId() {
					return id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getUsername() {
					return username;
				}

				public void setUsername(String username) {
					this.username = username;
				}

				public String getPassword() {
					return password;
				}

				public void setPassword(String password) {
					this.password = password;
				}

				public String getFirstName() {
					return firstName;
				}

				public void setFirstName(String firstName) {
					this.firstName = firstName;
				}

				public String getLastname() {
					return lastname;
				}

				public void setLastname(String lastname) {
					this.lastname = lastname;
				}

				public String getEmail() {
					return email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getPhone() {
					return phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public boolean isEnabled() {
					return enabled;
				}

				public void setEnabled(boolean enabled) {
					this.enabled = enabled;
				}

				public User() {
					super();
					// TODO Auto-generated constructor stub
				}

				public User(Long id, String username, String password, String firstName, String lastname, String email,
						String phone, String profile, boolean enabled) {
					super();
					this.id = id;
					this.username = username;
					this.password = password;
					this.firstName = firstName;
					this.lastname = lastname;
					this.email = email;
					this.phone = phone;
					this.profile = profile;
					this.enabled = enabled;
				}
				
				
				
}
