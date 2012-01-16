package ua.com.al1.timing.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
@Table(name="students")
public class Student {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long studId;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="patronymic")
    private String patronymic;
    
    @Column(name="phone")
    private String phone;
    
    @Column(name="email")
    private String email;
    
    @Column(name="skype")
    private String skype;
    
    @Column(name="keywords")
    private String keywords;
    
    @Column(name="cources")
    private String cources;

    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getCources() {
		return cources;
	}

	public void setCources(String cources) {
		this.cources = cources;
	}

	public Long getStudId() {
        return studId;
    }

    public void setStudId(Long studId) {
        this.studId = studId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", surname="
				+ surname + ", patronymic=" + patronymic + ", phone=" + phone
				+ ", email=" + email + ", skype=" + skype + ", keywords="
				+ keywords + ", cources=" + cources + "]";
	}
}
