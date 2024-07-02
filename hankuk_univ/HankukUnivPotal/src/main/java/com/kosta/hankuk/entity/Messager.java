package com.kosta.hankuk.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.kosta.hankuk.dto.MessagerDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Messager {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer msgNo;
	@Column
	private String sendId;
	@Column
	private String recvId;
	@Column
	private String title;
	@Column
	private String content;
	@Column
	@CreationTimestamp 
	private Date writeDt;
	
	public MessagerDto toMessagerDto() {
		return MessagerDto.builder()
					.msgNo(msgNo)
					.sendId(sendId)
					.recvId(recvId)
					.title(title)
					.content(content)
					.writeDt(writeDt)
					.build();
	}
}
