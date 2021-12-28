package ownable.nftService.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="ownablens")
@AllArgsConstructor
@NoArgsConstructor
public class MakeNFT {
	
	@Id
	@Column(name="customer_id")
	private int codeOfAccount;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="username")
	private String userName;
	
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@Column(name="passwords")
	private String password;
	
	@Column(name="tokenname")
	private String tokenName;
	
	@Column(name="image")
	private String image;
	
	@Column(name="typeofasset")
	private String typeOfAsset;
	
	@Column(name="description")
	private String description;
	
	public MakeNFT() {
		
	}
	
	public MakeNFT(int codeOfAccount, String firstName, String lastName, String email, String userName,
			String phoneNumber, String password, String tokenName, String image, String typeOfAsset,
			String description) {
		super();
		this.codeOfAccount = codeOfAccount;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.tokenName = tokenName;
		this.image = image;
		this.typeOfAsset = typeOfAsset;
		this.description = description;
	}


	public int getCodeOfAccount() {
		return codeOfAccount;
	}


	public void setCodeOfAccount(int codeOfAccount) {
		this.codeOfAccount = codeOfAccount;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTokenName() {
		return tokenName;
	}


	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getTypeOfAsset() {
		return typeOfAsset;
	}


	public void setTypeOfAsset(String typeOfAsset) {
		this.typeOfAsset = typeOfAsset;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	

	
}
