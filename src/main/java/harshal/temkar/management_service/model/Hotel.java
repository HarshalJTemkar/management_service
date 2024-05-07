package harshal.temkar.management_service.model;

import java.io.Serializable;

import org.hibernate.annotations.UuidGenerator;
import org.hibernate.annotations.UuidGenerator.Style;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@Table(name = "PAYMENT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hotel implements Serializable{

	@Id
	@GeneratedValue
    @UuidGenerator(style = Style.TIME)
	@Column(name = "ID")
	private String id;

	@NotBlank
	@Column(name = "NAME")
    private String name;
	
	@NotBlank
	@Column(name = "NAME")
    private String address;
	
	@Max(value = 4)
	@Min(value = 1)
	@NotBlank
	@Column(name = "NAME")
    private int capacity;
}
