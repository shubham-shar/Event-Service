package com.event.service.model;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the event_details database table.
 *
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class EventDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	public long id;
	public String title;
	public String description;
	public String location;
	public String price;

}
