package com.co.tiendas.indy.ccolombia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "home")
public class HomoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	@Column(nullable = false)
	private long idComponente;
	@Column(nullable = false)
	private long idHome;
	@Column(nullable = false)
	private String texto1;
	private String texto2;
	private String texto3;
	private String texto4;
	private String texto5;
	private String texto6;
	private String texto7;
	private String texto8;
	@Column(nullable = false)
	private String Img1;
	private String Img2;
	private String Img3;
	private String Img4;
	private String Img5;
	private String Img6;
	private String Img7;
	private String Img8;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdHome() {
		return idHome;
	}
	public void setIdHome(long idHome) {
		this.idHome = idHome;
	}
	public String getTexto1() {
		return texto1;
	}
	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}
	public String getTexto2() {
		return texto2;
	}
	public void setTexto2(String texto2) {
		this.texto2 = texto2;
	}
	public String getTexto3() {
		return texto3;
	}
	public void setTexto3(String texto3) {
		this.texto3 = texto3;
	}
	public String getTexto4() {
		return texto4;
	}
	public void setTexto4(String texto4) {
		this.texto4 = texto4;
	}
	public String getTexto5() {
		return texto5;
	}
	public void setTexto5(String texto5) {
		this.texto5 = texto5;
	}
	public String getTexto6() {
		return texto6;
	}
	public void setTexto6(String texto6) {
		this.texto6 = texto6;
	}
	public String getTexto7() {
		return texto7;
	}
	public void setTexto7(String texto7) {
		this.texto7 = texto7;
	}
	public String getTexto8() {
		return texto8;
	}
	public void setTexto8(String texto8) {
		this.texto8 = texto8;
	}
	public String getImg1() {
		return Img1;
	}
	public void setImg1(String img1) {
		Img1 = img1;
	}
	public String getImg2() {
		return Img2;
	}
	public void setImg2(String img2) {
		Img2 = img2;
	}
	public String getImg3() {
		return Img3;
	}
	public void setImg3(String img3) {
		Img3 = img3;
	}
	public String getImg4() {
		return Img4;
	}
	public void setImg4(String img4) {
		Img4 = img4;
	}
	public String getImg5() {
		return Img5;
	}
	public void setImg5(String img5) {
		Img5 = img5;
	}
	public String getImg6() {
		return Img6;
	}
	public void setImg6(String img6) {
		Img6 = img6;
	}
	public String getImg7() {
		return Img7;
	}
	public void setImg7(String img7) {
		Img7 = img7;
	}
	public String getImg8() {
		return Img8;
	}
	public void setImg8(String img8) {
		Img8 = img8;
	}
	
	
	
	
	

}
