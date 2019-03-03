package AASMain;
import java.io.Serializable;
import java.sql.Blob;

public class User implements Serializable
{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
		private int ID;
		private String Name;
		private String Address;
		private String City;
		private String Pincode;
		private String Contact;
		private String Email;
		private String Pwd;
		private String Auth_no;
		private Blob Auth_img;
		private Character Type;
		public Blob getAuth_img() {
			return Auth_img;
		}
		public void setAuth_img(Blob auth_img) {
			Auth_img = auth_img;
		}
		public String getAuth_no() {
			return Auth_no;
		}
		public void setAuth_no(String auth_no) {
			Auth_no = auth_no;
		}
		public String getPwd() {
			return Pwd;
		}
		public void setPwd(String pwd) {
			Pwd = pwd;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public Character getType() {
			return Type;
		}
		public void setType(Character type) {
			Type = type;
		}
		public String getContact() {
			return Contact;
		}
		public void setContact(String contact) {
			Contact = contact;
		}
		public String getPincode() {
			return Pincode;
		}
		public void setPincode(String pincode) {
			Pincode = pincode;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
	}

