package javagurus.curso.frameworks.model;
// default package
// Generated 1/12/2012 04:06:04 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * Movimiento generated by hbm2java
 */
public class Movimiento implements java.io.Serializable {

	private BigDecimal idmovimiento;
	private Tipomovimiento tipomovimiento;
	private Cuenta cuenta;
	private Date fecha;
	private BigDecimal monto;

	public Movimiento() {
	}

	public Movimiento(BigDecimal idmovimiento, Tipomovimiento tipomovimiento,
			Cuenta cuenta, Date fecha, BigDecimal monto) {
		this.idmovimiento = idmovimiento;
		this.tipomovimiento = tipomovimiento;
		this.cuenta = cuenta;
		this.fecha = fecha;
		this.monto = monto;
	}

	public BigDecimal getIdmovimiento() {
		return this.idmovimiento;
	}

	public void setIdmovimiento(BigDecimal idmovimiento) {
		this.idmovimiento = idmovimiento;
	}

	public Tipomovimiento getTipomovimiento() {
		return this.tipomovimiento;
	}

	public void setTipomovimiento(Tipomovimiento tipomovimiento) {
		this.tipomovimiento = tipomovimiento;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

}
