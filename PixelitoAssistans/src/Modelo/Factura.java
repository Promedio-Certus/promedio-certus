package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author Luz Maria
 */
public class Factura {
    private String idFactura;
    private double monto;
    private LocalDateTime FechaDeEmision;  
    private LocalDateTime FechaDeVencimiento;
    private String cobranza;

    public Factura() {
    }

    public Factura(String idFactura, double monto, LocalDateTime FechaDeEmision, LocalDateTime FechaDeVencimiento, String cobranza) {
        this.idFactura = idFactura;
        this.monto = monto;
        this.FechaDeEmision = FechaDeEmision;
        this.FechaDeVencimiento = FechaDeVencimiento;
        this.cobranza = cobranza;
    }

    public String getCobranza() {
        return cobranza;
    }

    public void setCobranza(String cobranza) {
        this.cobranza = cobranza;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFechaDeEmision() {
        return FechaDeEmision;
    }

    public void setFechaDeEmision(LocalDateTime FechaDeEmision) {
        this.FechaDeEmision = FechaDeEmision;
    }

    public LocalDateTime getFechaDeVencimiento() {
        return FechaDeVencimiento;
    }

    public void setFechaDeVencimiento(LocalDateTime FechaDeVencimiento) {
        this.FechaDeVencimiento = FechaDeVencimiento;
    }
    
}
