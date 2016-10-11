package br.com.vendas.paciente;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paciente {
	@Id
	@Column(name = "cd_paciente")
	private Long cdPaciente;

	@Column(name = "nm_paciente")
	private String nmPaciente;

	@Column(name = "dt_nascimento")
	private Calendar dtNacimento;

	public Paciente() {
	}

	public Paciente(Long cdPaciente, String nmPaciente, Calendar dtNacimento) {
		this.cdPaciente = cdPaciente;
		this.nmPaciente = nmPaciente;
		this.dtNacimento = dtNacimento;
	}

	public Long getCdPaciente() {
		return cdPaciente;
	}

	public void setCdPaciente(Long cdPaciente) {
		this.cdPaciente = cdPaciente;
	}

	public String getNmPaciente() {
		return nmPaciente;
	}

	public void setNmPaciente(String nmPaciente) {
		this.nmPaciente = nmPaciente;
	}

	public Calendar getDtNacimento() {
		return dtNacimento;
	}

	public void setDtNacimento(Calendar dtNacimento) {
		this.dtNacimento = dtNacimento;
	}

}
